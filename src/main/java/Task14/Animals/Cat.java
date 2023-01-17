package Task14.Animals;


import java.util.Arrays;

public class Cat extends HomeAnimal {

    public Cat(){

    }
    public String[] commands = new String[]{"мяукает", "бегает", "прыгает"};

    public String[] getCommands() {
        System.out.println(Arrays.toString(commands));
        return commands;
    }
    public Cat(String[] commands) {
        this.commands = commands;
    }

}
