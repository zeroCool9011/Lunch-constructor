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
                    System.out.println("Начинаем конструировать обед...");

                    System.out.println("Введите количество наборов, которые нужно сгенерировать:");
                    int numberOfCombos = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Вводите типы блюда, разделяя символом переноса строки (enter). Для завершения ввода введите пустую строку");
                    String nextItem = scanner.nextLine();
                    dc.generateDishCombo(numberOfCombos, nextItem);
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


}
