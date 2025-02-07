import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1
        System.out.print("Введите 0 для iOS или 1 для Android: ");
        int clientOS = scanner.nextInt();
        System.out.println("Результат задачи 1:");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2
        System.out.print("Введите год выпуска устройства: ");
        int clientDeviceYear = scanner.nextInt();
        System.out.println("Результат задачи 2:");
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 3
        System.out.print("Введите год для проверки на високосность: ");
        int year = scanner.nextInt();
        System.out.println("Результат задачи 3:");
        if (year > 1584 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача 4
        System.out.print("Введите расстояние доставки: ");
        int deliveryDistance = scanner.nextInt();
        int deliveryDays = 1;
        System.out.println("Результат задачи 4:");
        if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        } else {
            if (deliveryDistance > 60) {
                deliveryDays += 2;
            } else if (deliveryDistance > 20) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        }

        // Задача 5
        System.out.print("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();
        System.out.println("Результат задачи 5:");
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректный номер месяца");
        }

        scanner.close();
    }
}
