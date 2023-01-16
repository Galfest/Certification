package Task14.Animals;

public class Dog extends HomeAnimal {

    private static Dog dog;

    public static synchronized Dog getInstance() {
        if (dog == null) {
            dog = new Dog();
        }
        return dog;
    }
}

