package OOP.ElevatorExample;

public class EncapsulatedElevator {
    private boolean doorOpen =false;
    private boolean stopped=true;
    private Floor currentFloor=Floor.ENTRANCE;
    private int weight = 0;

    private final int CAPACITY = 1000;

    public void openDoor(){
        if(stopped){
            doorOpen=true;
            System.out.println("Door is open.");
        }
    }

    public void closeDoor(){
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

    public void go(Floor desiredFloor){
        int compare=currentFloor.compareTo(desiredFloor);
        while(compare!=0){
            if(compare>0){
                goDown();
                System.out.println(currentFloor.name());
            }else if(compare < 0) {
                goUp();
                System.out.println(currentFloor.name());
            }
            compare=currentFloor.compareTo(desiredFloor);
            System.out.println(compare);
        }
        stopped=true;
    }

    public void goDown(){
        currentFloor=currentFloor.goDown();
    }

    public void goUp(){
        currentFloor=currentFloor.goUp();
    }
}


