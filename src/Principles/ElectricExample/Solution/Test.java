package Principles.ElectricExample.Solution;

public class Test {
    public static void main(String[] args) {
        Switchable switchableBulb=new LightBulb();
        Switch bulbPowerSwitch=new ElectricPowerSwitch(switchableBulb);

        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        Switchable switchableFan=new Fan();
        Switch funPowerSwitch=new ElectricPowerSwitch(switchableFan);

        funPowerSwitch.press();
        funPowerSwitch.press();
    }
}
