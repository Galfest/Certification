package Task14.Animals;

import java.util.Arrays;

public class Dankey extends PackAnimal{
    public Dankey(){

    }

    public String[] commands = new String[]{"жует морковь", "идет", "лежит"};

    public String[] getArr(){
        return commands;
    }

    public String[] getCommands() {
        System.out.println(Arrays.toString(commands));
        return commands;
    }
    public Dankey(String[] commands) {
        this.commands = commands;
    }
}
