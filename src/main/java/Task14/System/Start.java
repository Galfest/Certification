package Task14.System;

import Task14.Animals.*;

import java.io.FileWriter;
import java.io.IOException;
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
//    public static Map<String, Object> returnFieldsWithValues(Field[] fields) {
//
//        Map<String, Object> map = null;
//        try {
//            map = new HashMap<>();
//            for (Field field : fields) {
//                field.setAccessible(true);
//
//                if (!field.getType().isPrimitive() &&
//                        !field.getType().getSimpleName().equals("String") &&
//                        !field.getType().getSimpleName().equals("Integer") &&
//                        !field.getType().getSimpleName().equals("Boolean") &&
//                        !field.getType().getSimpleName().equals("Enum") &&
//                        !field.getType().getSimpleName().equals("Double") &&
//                        !field.getType().getSimpleName().equals("Float") &&
//                        !field.getType().getSimpleName().equals("Long")) {
//
//                    map.putAll(returnFieldsWithValues(field.getType().getDeclaredFields()));
//
//                } else {
//                    map.put(field.getName(), field.getType().getSimpleName());
//                }
//            }
//        } catch (SecurityException e) {
//            e.printStackTrace();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
//        return map;
//    }
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
                String[] arr = dog.getArr();
                String[] arr1 = new String[dog.getArr().length + 1];
                for (int i = 0; i <= arr1.length; i++) {
                    arr1[arr.length - 1] = command;
                }
                System.out.println("Новый набор команд:");
                System.out.println(Arrays.toString(arr1));

//                FileWriter fileWriter = new FileWriter("CommandsForDog");
//                fileWriter.write(String.valueOf(newCommands));
//
                System.out.println(Arrays.toString(arr));
                break;
            case (2):
//                Код2;
                break;
            case (3):
//                КодN;
                break;
            case  (4):
//                Код1;
                break;
            case  (5):
//                Код1;
                break;
            case  (6):
//                Код1;
                break;
            default:
//                КодВыбораПоУмолчанию;
                break;
        }
    }
}