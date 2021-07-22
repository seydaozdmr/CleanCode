package Principles.FoodService;

public class Test {


    public static void main(String[] args) {
        Human human=new HumanImpl();
        Animal animal=new AnimalImpl();

        FoodService foodService=new FoodService();
        foodService.addToListEveryAlive(human);
        foodService.addToListEveryAlive(animal);
    }
}
