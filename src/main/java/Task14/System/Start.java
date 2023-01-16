package Task14.System;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {

    public static void start() {
        try {
            dispatcher();
        } catch (InputMismatchException e) {
            System.out.println("Введено не корректное значение! Запустите программу еще раз!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String dispatcher() throws IOException {
        File homeAnimals = new File("src/main/resources/listHomeAnimal");
        File packAnimals = new File("src/main/resources/listPackAnimal");
        String animalName = " ";
        System.out.println("Добрый день!\n Ниже приведен список команд:\n 1. - завести новое животное.\n 2. - увидеть список команд, которое выполняет животное.\n 3. - обучить животное новым командам.\n-------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("Введите название животного");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            animalName = name;
            System.out.println("Выберите тип животного:\n 1. Домашние животные.\n 2. Вьючные животные");
            Scanner scanner2 = new Scanner(System.in);
            int type = scanner2.nextInt();
//            if (type != 1 || type != 2){
//                System.out.println("Введено не корректное значение! Запустите программу еще раз!");
//            }
            if (type == 1){
                //Запись в файл listHomeAnimal
                try (FileWriter writer = new FileWriter("listHomeAnimal", true))
                {
                    writer.write(name);
                    writer.flush();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            if (type == 2){
                //Записб в файл listPackAnimal
            }
//нужен файл!
        } else {
            System.out.println("Вы ввели неверное значение, запустите программу еще раз.\n-------------------------------------------------------");
        }
//        if (name == 1){
//
//            int type = scanner.nextInt();
//            if (type == 1){
//                name ==
//            }
//        }

        return animalName;

    }
}
