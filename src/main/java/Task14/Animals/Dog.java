package Task14.Animals;

import java.util.Arrays;

public class Dog extends HomeAnimal {
    public Dog(){

    }

    private String[] commands = new String[]{"лает", "бегает", "прыгает"};

    public String[] getArr(){
        return commands;
    }
    public String[] getCommands() {
        System.out.println(Arrays.toString(commands));
        return commands;
    }
    public Dog(String[] commands) {
        this.commands = commands;
    }

}

