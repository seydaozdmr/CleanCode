package OOP.ElevatorExample;

public class ResponsibleElevator implements Elevator{
    private boolean doorOpen =false;
    private boolean stopped=true;
    private Floor currentFloor=Floor.ENTRANCE;
    private int weight = 0;

    private final int CAPACITY = 1000;

    @Override
    public void goToFloor(Floor desiredFloor) {
        int compare=currentFloor.compareTo(desiredFloor);
        while(compare!=0){
            if(compare>0){
                goDown();
            }else if(compare<0){
                goUp();
            }
            compare=currentFloor.compareTo(desiredFloor);
        }
        stopped=true;
    }

    @Override
    public void openDoor() {
        if(stopped){
            doorOpen=true;
            System.out.println("Door is open.");
        }
    }

    @Override
    public void closeDoor() {
        calculateCapacity();
        if(weight<=CAPACITY){
            doorOpen=false;
        }else{
            System.out.println("The elevator has exceeded capacity");
            System.out.println("Doors will remain open until someone exits!");
        }
    }

    public void calculateCapacity(){
        weight=(int)(Math.random()*1500);
        System.out.println("Weight : "+weight);
    }

    private void goDown(){
        if(doorOpen)
            closeDoor();

        if(currentFloor.compareTo(Floor.ENTRANCE)>0) { //if elevator at Entrance
            System.out.println("Going down");
            currentFloor=currentFloor.goDown();
            System.out.println(currentFloor);
        }else{
            System.out.println("Already on bottom floor");
        }
        stopped=true;
        openDoor();
    }

    private void goUp(){
        if(doorOpen)
            closeDoor();
        if(currentFloor.compareTo(Floor.FIFTH)<0){
            System.out.println("Going Up");
            currentFloor=currentFloor.goUp();
            System.out.println(currentFloor);
        }else {
            System.out.println("Already on the top floor");
        }
        stopped=true;
        openDoor();
    }
}
