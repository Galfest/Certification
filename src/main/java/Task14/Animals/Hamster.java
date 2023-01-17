package Task14.Animals;

import java.util.Arrays;

public class Hamster extends HomeAnimal{
    public Hamster(){

    }
    public String[] commands = new String[]{"пищит", "бегает в колесе", "ест"};

    public String[] getCommands() {
        System.out.println(Arrays.toString(commands));
        return commands;
    }
    public Hamster(String[] commands) {
        this.commands = commands;
    }

}
