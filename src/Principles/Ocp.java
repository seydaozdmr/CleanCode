package Principles;

public class Ocp {
    /**
     * Uygulamalar geliştikçe değişiklikler gerçekleşir. Yeni bir özellik eklendiğinde
     * ya da mevcut özellikler güncellendiğinde değişiklikler yapılır. Her iki durumda da
     * var olan kod yapısı değiştirilebilir ve bu değişiklikler uygulamanın kırılmasına sebep
     * olabilir.
     * İyi inşa edilmiş bir uygulamada gereksinimler değiştiğinde mevcut kod yapısını değiştirmemelisiniz.
     * Değişim yerine yeni gereksinimleri karşılamak için mevcut yapıyı genişletmelisiniz.
     * İşte Open Close Principle bunu yapmamıza yardımcı olur. Kod yapısı değişikliklere kapalı,
     * yeni durumlarda genişletmeye açık olmalıdır.
     *
     * Bu prensip ile iyi tasarlanmış kod yapısı, okunabilir, bakımı yapılabilir, güncellenebilir ve
     * genişleterek yeni değişimler yapılabilir hale getirilir.
     *
     * Genişletmeyi soyutlamalar üzerinden (interface, abstract classes) kurarsak, kodumuz yapacağımız
     * değişikliklerden ya da yeni eklemelerden dolayı kırılmaz.
     *
     * Sigorta örneğine bakalım.
     */
}
