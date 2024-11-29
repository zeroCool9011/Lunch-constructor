import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    static DinnerConstructor dc;
    static Scanner scanner;

    public static void main(String[] args) {
        dc = new DinnerConstructor();
        scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Введите тип блюда (Напиток, Гарнир, Мясо):");
                    String dishType = scanner.nextLine();
                    System.out.print("Введите название блюда(Должно соответствовать типу: " + dishType + "):");
                    String dishName = scanner.nextLine();

                    dc.addNewDish(dishType, dishName);
                    break;
                case "2":

                    generateDishCombo();
                    break;
                case "3":
                    System.out.println("Завершение работы.");
                    return;
            }
        }
    }


    private static void printMenu() {
        System.out.println("Выберите команду:");
        System.out.println("1 - Добавить новое блюдо");
        System.out.println("2 - Сгенерировать комбинации блюд");
        System.out.println("3 - Выход");
    }

    static void generateDishCombo() {
        ArrayList<String> type = new ArrayList<>();
        System.out.println("Начинаем конструировать обед...");

        System.out.println("Введите количество наборов, которые нужно сгенерировать:");
        int numberOfCombos = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Вводите типы блюда " + dc.menu.keySet() + ", разделяя символом переноса строки (enter).");

        String nextItem = scanner.nextLine();//не получилось убрать метод в класс DinerConstructor, не перенося Scanner
        while (!nextItem.isEmpty()) {
            if (dc.menu.containsKey(nextItem)) {
                type.add(nextItem);
                System.out.println("Тип блюда выбран, хотите продолжить? Для завершения ввода нажмите 'Enter'");
                nextItem = scanner.nextLine();

            } else {
                System.out.println("Данный тип блюда не найден, попробуйте еще раз.");
                return;
            }
        }
        for (int i = 0; i <numberOfCombos; i++) {
            for (int j = 0; j < type.size(); j++) {
                ArrayList<String> randomDish = dc.menu.get(type.get(j));
                int arrayDishSize = randomDish.size();
                System.out.println(randomDish.get(dc.randomDiner(arrayDishSize)));
                System.out.println();
            }
            System.out.println("-".repeat(30));
        }
    }

}
