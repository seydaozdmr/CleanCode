package Principles.FoodService;

import java.util.ArrayList;
import java.util.List;

public class FoodService {

    //eğer hem insanı hem de hayvanı listeye eklemek istersem problem olur bundan dolayı
    //ikisini birlikte ekleyebileceğim bir adaptör yaratmalıyım.
    public void addToList(Human human){
        System.out.println(human + "added to list");
    }

    public void addToListEveryAlive(EaterAdaptor eaterAdaptor){
        System.out.println(eaterAdaptor + "added to list");
        eaterAdaptor.eat();
    }


}
