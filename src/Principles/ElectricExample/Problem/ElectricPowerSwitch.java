package Principles.ElectricExample.Problem;

public class ElectricPowerSwitch {
    /**
     * Burada üst seviye {@link ElectricPowerSwitch} sınıfımız {@link LightBulb} sınıfına doğrudan bağlıdır.
     * Koda baktığımızda LightBulb hard coded olarak implemente edilmiştir. Fakat swith ampüle(bulb) bağımlı olmamalıdır.
     * Diğer cihazları da açıp kapayabilmelidir.
     * ElecticPowerSwitch sınıfımıza yeni özellikler ya da aletler eklediğimizi düşünün. Bu durumda tasarımımızın hatalı
     * olduğunu görecek ve DIP 'a göre yeniden dizayn etmek zorunda kalacağız.
     */
    public LightBulb lightBulb;
    public boolean on;

    public ElectricPowerSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on=false;
    }

    public boolean isOn(){
        return this.on;
    }

    public void press(){
        boolean checkOn=isOn();
        if(checkOn){
            lightBulb.turnOff();
            this.on=false;
        }else{
            lightBulb.turnOn();
            this.on=true;
        }
    }
}
