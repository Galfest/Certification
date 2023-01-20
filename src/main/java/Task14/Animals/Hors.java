package Task14.Animals;

import java.util.Arrays;

public class Hors extends PackAnimal{
    public Hors(){

    }

    public String[] commands = new String[]{"ест", "бегает", "прыгает через барьеры"};

    public String[] getArr(){
        return commands;
    }

    public String[] getCommands() {
        System.out.println(Arrays.toString(commands));
        return commands;
    }
    public Hors(String[] commands) {
        this.commands = commands;
    }
}
