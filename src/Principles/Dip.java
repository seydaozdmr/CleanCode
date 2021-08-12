package Principles;

public class Dip {
    /**
     * Use Interface dependency instead classes.
     */

    /**
     * Java developer olarak coupling (bağlama) konusunu duymuşsunuzdur. Ve sıkı bağlanmadan
     * kaçınılması gerektiğini. İyi code yazma'nın önünde duran en büyük engel sıkı sağlanmış kodlarla
     * uygulama yazmaktır. Örneğin bir sınıf içerisinde new operatörü ile başka bir sınıftan instance yaratıyorsanız.
     * Bu sıkı bağlanmış iki sınıfı gösterir. Bağlılık küçük uygulamalar için zararsız görünebilir. Fakat
     * kurulsal uygulama geliştirmeye geldiğimizde, sıkı bağlanma pekçok olumsuzluğa sebep olur.
     *
     * Bir sınıf başka bir sınıfın tasarımını ve uygulamalarını açıkça biliyorsa, diğer sınıfta gerçekleşecek değişiklik
     * ilk sınıfta kırılmaya neden olur. Bu tür değişiklikler bütün uygulama boyunca yayılabilir ve kırılmalar bütün
     * uygulamayı etkileyebilir. Bu problemleri engellemek ve "iyi kod" yazmak için gevşek bağlanma kullanmalıyız.
     * Dependency Inversion Principle 'da gevşek bağlanmayı destekler.
     *
     * Dependency Inversion Principle'ın iki durumu vardır:
     * 1- Yüksek seviyeli modüller daha düşük seviyeli modüllere bağımlı olmamalıdır. İkisi arasında soyutlama olmalıdır.
     * 2- Soyutlama detaylara bağlı olmamalıdır, detaylar soyutlamalara bağlı olmalıdır.
     *
     * Geleneksel uygulama mimarisi üst düzey bir sorunun daha küçük parçalara bölündüğü yukarıdan aşağıya doğru
     * kurgulanan bir tasarım yaklaşımını kabul eder. Sonuç olarak doğrudan yazılan üst seviye modüller (controller, service)
     * daha küçük seviyeli modüllere bağlıdır.
     *
     * Dependency Inversion Principle; bu yüksek seviyeli modüllerin düşük seviyeli modüllere bağımlı olması yerine
     * her ikisinin de soyutlama üzerinden bağımlı olması gerektiğini söyler.
     * Örneğin package A içindeki class A içerisinde Package B içerisindeki Class B yi barındırıyor. Yani A-> B' ye bağımlı.
     * İşte bu durum yerine A bir interface X'e bağımlı olursa (içerisinde bulundurursa) ve Class B 'de bu interface'i implemente
     * ederse, A'nın B'ye olan bağımlılığı ortadan kalkar, ve B'yi interface X üzerinden ulaşarak kullanabilir.
     * İşte bu durumda A sınıfının B sınıfına olan bağımlılığı, interface X i implemente eden B sınıfına tersine çevrilir.
     *
     * Robert Martin, Dependency Inversion Principle'ı OCP ve LSP prensiplerinin kombinasyonu olarak düşünmüştür.
     * DIP kullanmak fazla kod yazmanın getirdiği ek yüke rağmen sağladığı avantajlar, ileride karşılaşacağınız
     * ek yükten daha önemlidir.
     *
     * Kod yazarken mümkün olduğunca bağımlılıkların kodunuzu zaman içinde bozacağını düşünerek, kodunuzu değişikliklere
     * karşı dayanıklı hale getirmek için soyutlamalardan faydalanın.
     *
     * Dependency Inversion Principle ile Dependency Injection kavramının (Spring Framework) ilişkili olduğunu düşünebiliriz.
     * Uncle Bob Martin DIP 'ı Martin Fowler'ın DI kavramından daha önce bulmuştur.
     * DIP daha çok kodunuzun yapısına odaklanır. Koduzunun bağımlılıklarının zayıf olmasına odaklanır. Diğer yandan
     * DI ise kodunuzun nasıl fonksiyonel olabileceğine çalışır. Spring Framework ile çalışırken DI kullanarak, uygulamanızı birleştirmenizi
     * sağlıyor.
     * DIP kodunuzu ayrıştıran şeydir, bağımlılıkları soyutlamalar üzerinden gerçekleştirmenizi sağlar böylece Spring DI
     * kullanarak çalışma zamanında bu bağımlılıkları bir araya getirir.
     */

}
