package Principles.ElectricExample.Solution;

public class ElectricPowerSwitch implements Switch{
    /**
     * Switchable interface'i içerisinde turnOn() ve turnOff() methodları bulunmaktadır.
     * Artık uygulama içerisinde switch'e sahip herhangi bir cihaza bu interface'i uygulayabiliriz ve bu sınıf içerisinde
     * kullanabiliriz. Bu sınıfın bağımlılığını da Switchable üzerinden gerçekleştirmiş olduk.
     *
     * Artık bu sınıfla beraber çalışmak üzere birden çok düşük seviyeli sınıf yaratabiliriz. Switchable interface'ini implemente
     * etmeleri yeterli.
     *
     * Paket içerisinde yazdığımız LightBulb ve Fan sınıfların ikisi de Switchable interface'ini implemente ediyorlar ve
     * ikisi de kendi içerisinde kendi fonksiyonelitesine sahip.
     */
    public Switchable client;
    public boolean on;

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on=false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        boolean checkOn=isOn();
        if(checkOn){
            client.turnOff();
            this.on=false;
        }else{
            client.turnOn();
            this.on=true;
        }
    }
}
