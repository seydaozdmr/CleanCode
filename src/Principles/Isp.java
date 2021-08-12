package Principles;

public class Isp {
    /**
     * Interface Segregation Principle ->
     * Clients should not be forced to depend upon interfaces that they do not use.
     * Divide your interfaces for focus same subject.
     *
     * Arayüzler java'nın temel bir parçasıdır. Soyutlama yapma ve çoklu tür kalıtımını desteklemek için
     * kurumsal uygulamalarda yaygın olarak kullanılırlar. Bir sınıf birden çok arayüzü implemente
     * edebilir.
     *
     * Bugüne kadar pekçok interface yazmış olabilirsiniz fakat, interfaceleri tasarlarken tasarım prensiplerine
     * uygun olup olmadığını düşündünüz mü? Interfaceleri yazarken uymamız gereken tasarım prensibi Inteface Segregation
     * Principle 'dır.
     *
     * Bu prensip şunu öne sürüyor, bir istemci (inteface'ş uygulayan sınıflar) içerisinde kullanmadığı methodlar olan interfaceleri implemente
     * etmeye zorlanmamalıdır. Yani interfaceleriniz methodlarla doldurulmuş, çok fazla methoddan oluşmamalıdır. Özellikle
     * de sınıfın uygulamadığı methodlarla.
     *
     * Bunun dışında eğer interface üzerinde bir değişiklik, çıkarma ya da eksiltme ya da method imzalarında bir değişiklik
     * meydana gelediğinde bu interface'i implemente eden bütün sınıflar etkilenecektir.
     *
     * ISP böyle yağlı şişman arayüzleri daha küçük ve kendi içinde cohesive(bağlı) parçalara ayırmayı savunur.
     * Böylece her bir parça belirli davranışlara odaklı olur. İstemci de kendine uyumlu olan interfaceleri implemente
     * eder.
     *
     * Farklı türden oyuncakları inşa eden bir Toy interface'imiz olduğunu düşünelim.
     * Her oyuncağın ücreti (price) ve rengi (color) bulunur. Fakat bazı oyuncaklar, araba gibi hareket etme özelliği ya da
     * uçak gibi uçma özelliğine sahiptirler. Bu durumda ev oyuncağına bu interface'i implemente ettiğimizde move() ve fly()
     * methotları uygulanmayacak.
     * ISP'ye göre bu durumda interface'imizi parçalara bölmeliyiz. Toy (setPrice() , setColor()) - Movable(move()) - Flyable(fly())
     * gibi.
     *
     * İstemci yalnızce kendisini ilgilendiren interfaceleri implemente edecektir.
     */
}
