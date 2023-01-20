package Task14.System;

import Task14.Animals.*;

import java.io.*;
import java.util.*;


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

    public static void dispatcher() throws IOException {
        System.out.println("Добрый день!\nНиже приведен список команд:\n1. - завести новое животное.\n2. - увидеть список команд, которое выполняет животное.\n3. - обучить животное новым командам.\n-------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer != 1 && answer != 2 && answer != 3) {
            System.out.println("Введено не корректное значение! Запустите программу еще раз!");
//            dispatcher();
        }
        if (answer == 1) {
            name();
        }
        if (answer == 2) {
            commands();
        }
        if (answer == 3) {
            addingCommands();
        }
    }

    public static void name() {
        String animalName = "";
        System.out.println("Введите название животного");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        animalName = name;
        System.out.println("Выберите тип животного:\n 1. Домашние животные.\n 2. Вьючные животные");
        Scanner scanner2 = new Scanner(System.in);
        int type = scanner2.nextInt();
        if (type != 1 && type != 2) {
            System.out.println("Введено не корректное значение! Запустите программу еще раз!");
        }
        if (type == 1) {
            try (FileWriter writer = new FileWriter("src/main/resources/listHomeAnimal", true)) {
                writer.write(name + " \n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (type == 2) {
            try (FileWriter writer = new FileWriter("src/main/resources/listPackAnimal", true)) {
                writer.write(name + " \n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void commands() {
        System.out.println("Выберите, у какого животного посмотреть команды?\n1. - Домашние животные.\n2. - Вьючные животные\n");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if (type == 1) {
            System.out.println("1. - Собака.\n2. - Кошка.\n3. - Хомяк\n");
            Scanner sc1 = new Scanner(System.in);
            int name = sc1.nextInt();
            if (name == 1) {
                Dog dog = new Dog();
                dog.getCommands();
            }
            if (name == 2) {
                Cat cat = new Cat();
                cat.getCommands();
            }
            if (name == 3) {
                Hamster hamster = new Hamster();
                hamster.getCommands();
            } else {
                System.out.println("Попробуйте еще раз!\n-------------------------------------------------------");
            }
        }
        if (type == 2) {
            System.out.println("1. - Лошадь.\n2. - Верблюд.\n3. - Осел\n");
            Scanner sc1 = new Scanner(System.in);
            int name = sc1.nextInt();
            if (name == 1) {
                Hors hors = new Hors();
                hors.getCommands();
            }
            if (name == 2) {
                Camel camel = new Camel();
                camel.getCommands();
            }
            if (name == 3) {
                Dankey dankey = new Dankey();
                dankey.getCommands();
            } else {
                System.out.println("Программа отработала корректно!\n-------------------------------------------------------");
            }
        }
    }

    public static void addingCommands() throws IOException {
        System.out.println("Выберите, какому животному добавить команду:\n1. Собака\n2. Кошка\n3. Хомяк\n4. Лошадь\n5. Верблюд\n6. Осел\n");
        Scanner scanner = new Scanner(System.in);
        int animal = scanner.nextInt();
        switch (animal) {
            case  (1):
                System.out.println("Введите название новой команды");
                Scanner scanner1 = new Scanner(System.in);
                String command = scanner1.nextLine();
                Dog dog = new Dog();
                String[] arr1 = new String[dog.getArr().length + 1];
                for (int i = 0; i <= arr1.length; i++) {
                    arr1[arr1.length - 1] = command;
                }
                writeToTxt(dog.getArr(), "src/main/resources/oldCommandsForDog");
                System.out.println("Новая команда - " + command);
                FileWriter writer = new FileWriter("commandsForDog", true);
                String text = command;
                writer.write(text);
                writer.flush();
                break;
            case (2):
                System.out.println("Введите название новой команды");
                Scanner scanner2 = new Scanner(System.in);
                String command2 = scanner2.nextLine();
                Cat cat = new Cat();
                String[] arr2 = new String[cat.getArr().length + 1];
                for (int i = 0; i <= arr2.length; i++) {
                    arr2[arr2.length - 1] = command2;
                }
                writeToTxt(cat.getArr(), "src/main/resources/oldCommandsForCat");
                System.out.println("Новая команда - " + command2);
                FileWriter writer2 = new FileWriter("commandsForCat", true);
                String text2 = command2;
                writer2.write(text2);
                writer2.flush();
                break;
            case (3):
                System.out.println("Введите название новой команды");
                Scanner scanner3 = new Scanner(System.in);
                String command3 = scanner3.nextLine();
                Hamster hamster = new Hamster();
                String[] arr3 = new String[hamster.getArr().length + 1];
                for (int i = 0; i <= arr3.length; i++) {
                    arr3[arr3.length - 1] = command3;
                }
                writeToTxt(hamster.getArr(), "src/main/resources/oldCommandsForHamster");
                System.out.println("Новая команда - " + command3);
                FileWriter writer3 = new FileWriter("commandsForHamster", true);
                String text3 = command3;
                writer3.write(text3);
                writer3.flush();
                break;
            case  (4):
                System.out.println("Введите название новой команды");
                Scanner scanner4 = new Scanner(System.in);
                String command4 = scanner4.nextLine();
                Hors hors = new Hors();
                String[] arr4 = new String[hors.getArr().length + 1];
                for (int i = 0; i <= arr4.length; i++) {
                    arr4[arr4.length - 1] = command4;
                }
                writeToTxt(hors.getArr(), "src/main/resources/oldCommandsForHors");
                System.out.println("Новая команда - " + command4);
                FileWriter writer4 = new FileWriter("commandsForHors", true);
                String text4 = command4;
                writer4.write(text4);
                writer4.flush();
                break;
            case  (5):
                System.out.println("Введите название новой команды");
                Scanner scanner5 = new Scanner(System.in);
                String command5 = scanner5.nextLine();
                Camel camel = new Camel();
                String[] arr5 = new String[camel.getArr().length + 1];
                for (int i = 0; i <= arr5.length; i++) {
                    arr5[arr5.length - 1] = command5;
                }
                writeToTxt(camel.getArr(), "src/main/resources/oldCommandsForHamster");
                System.out.println("Новая команда - " + command5);
                FileWriter writer5 = new FileWriter("commandsForHamster", true);
                String text5 = command5;
                writer5.write(text5);
                writer5.flush();
                break;
            case  (6):
                System.out.println("Введите название новой команды");
                Scanner scanner6 = new Scanner(System.in);
                String command6 = scanner6.nextLine();
                Dankey dankey = new Dankey();
                String[] arr6 = new String[dankey.getArr().length + 1];
                for (int i = 0; i <= arr6.length; i++) {
                    arr6[arr6.length - 1] = command6;
                }
                writeToTxt(dankey.getArr(), "src/main/resources/oldCommandsForHamster");
                System.out.println("Новая команда - " + command6);
                FileWriter writer6 = new FileWriter("commandsForHamster", true);
                String text6 = command6;
                writer6.write(text6);
                writer6.flush();
                break;
            default:
                break;
        }
    }

    public static void writeToTxt (String [] array, String filePathName) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(filePathName)));
        for (int i = 0; i < array.length; i++) {
                writer.write(String.valueOf(array[i]));
                writer.write(" ");
            writer.write("\r\n");
        }
        writer.flush();
    }
}