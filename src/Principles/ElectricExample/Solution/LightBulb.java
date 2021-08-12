package Principles.ElectricExample.Solution;

public class LightBulb implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Light is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is off");
    }
}
