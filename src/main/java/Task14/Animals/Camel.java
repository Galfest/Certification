package Task14.Animals;

import java.util.Arrays;

public class Camel extends PackAnimal{
    public Camel(){

    }

    public String[] commands = new String[]{"плюет", "бегает", "лежит"};

    public String[] getCommands() {
        System.out.println(Arrays.toString(commands));
        return commands;
    }
    public Camel(String[] commands) {
        this.commands = commands;
    }
}
