package com.company;

public class Main {

    public static void main(String[] args) {
       System.out.println("   Задача 1");
        byte clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Установите версию приложения для Android по ссылке");
        }
       System.out.println("   Задача 2");
        int clientDeviceYear = 2015;
        int clientOS2 = 0;
        if (clientDeviceYear >= 2015) {
            switch (clientOS2) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                default:
                    System.out.println("Установите версию приложения для Android по ссылке");
        }} else {
            switch (clientOS2) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                default:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }}
       System.out.println("   Задача 3");
        float year = 2021f;
        if (year < 1584) {
            System.out.println("Високосный год был введён только в 1584 году, выберите другой год");
        } else if (year% 400 == 0.0 || year% 4 == 0.0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
       System.out.println("   Задача 4");
        int deliveryDistance = 95;
        int deliveryDay = 0;
        if (deliveryDistance <= 20) {
            deliveryDay = deliveryDay + 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            deliveryDay = deliveryDay + 3;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("доставки нет");
        }
       System.out.println("   Задача 5");
        int monthNumber = 12;
        switch (monthNumber)  {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}

