package Principles.FoodService;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class FoodServiceTest {

    FoodService foodService=new FoodService();
    EaterAdaptor adaptor;
    Human human;
    @BeforeEach
    void setUp() {
        human = new HumanImpl();
        adaptor=new AnimalImpl();
    }

    @org.junit.jupiter.api.Test
    void addToList() {
        foodService.addToList(human);
    }

    @org.junit.jupiter.api.Test
    void addToListEveryAlive() {
        foodService.addToListEveryAlive(adaptor);
    }
}