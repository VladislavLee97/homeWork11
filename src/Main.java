import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1");
        checkLeapYear(2021);
    }

    public static void task2() {
        System.out.println("Задача 2");
        operatingSystem(2025, 0);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }

    public static void operatingSystem(int year, int clienOS) {
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear && clienOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (year >= currentYear && clienOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (year < currentYear && clienOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}


