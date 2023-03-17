public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");

                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("У вас неизвестная ОС");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2018;
        int clientOS = 0;
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");

                    break;
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
            }
        } else {
            switch (clientOS) {
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");

                    break;
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
            }

        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2024;
        int yearCheck1 = year % 4;
        int yearCheck2 = year % 100;
        int yearCheck3 = year % 400;
        if (yearCheck1 == 0) {
            if (yearCheck2 == 0 && yearCheck3 == 0) {
                System.out.println( year + " год является високосным");
            }
            else if (yearCheck2 == 0) {
                System.out.println(year + " год не является високосным");

            }
            else {
                System.out.println(year + " год является високосным");
            }
        }


        else {
            System.out.println(year + " год не является високосным");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 101;
        int daysToDeliver = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + daysToDeliver);
        } else if (deliveryDistance > 20 && deliveryDistance <=60) {
            System.out.println("Потребуется дней: " + (daysToDeliver + 1));

        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (daysToDeliver + 2));

        } else {
            System.out.println("Доставка не осуществляется");

        }

    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 18;
        switch (monthNumber) {
            case 12:
                System.out.println("зима");
                break;
            case 1:
                System.out.println("зима");
                break;
            case 2:
                System.out.println("зима");
                break;
            case 3:
                System.out.println("весна");
                break;
            case 4:
                System.out.println("весна");
                break;
            case 5:
                System.out.println("весна");
                break;
            case 6:
                System.out.println("лето");
                break;
            case 7:
                System.out.println("лето");
                break;
            case 8:
                System.out.println("лето");
                break;
            case 9:
                System.out.println("осень");
                break;
            case 10:
                System.out.println("осень");
                break;
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }

}