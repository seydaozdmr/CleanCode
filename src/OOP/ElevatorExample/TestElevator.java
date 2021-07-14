package OOP.ElevatorExample;

public class TestElevator {
    public static void main(String[] args) {
        EncapsulatedElevator elevator=new EncapsulatedElevator();

        elevator.go(Floor.FIFTH);
        System.out.println("******************");
        ResponsibleElevator responsibleElevator=new ResponsibleElevator();
        responsibleElevator.goToFloor(Floor.FIFTH);
    }
}
