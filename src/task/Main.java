package task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        printIsLeap(2020);
//      printInstallationMessage(1,2020);
        printCalculateDeliveryDays(120);

    }

    private static void printIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Високосный год");
        }else {
            System.out.println("Не високосный год");
        }

    }

    private static void printInstallationMessage(int os, int productionYear) {
       if (!(os == 0 || os == 1)) {
           throw new RuntimeException("устройство поддерживаемо немедленно");
        }

       var currentYear= LocalDate.now().getYear();

       String versionMessage = productionYear < currentYear ? "облегченную" : "";
       String osMessage = os == 0 ? "iOS" : "android";

        System.out.printf("Установите %s версию приложения для %s по ссылке %s", versionMessage, osMessage);
    }
    private static void printCalculateDeliveryDays(int distance) {
       int start = 20;
       int step = 40;
       int result; //количество дней
       if (distance >= start) {
           result = 1;
       } else {
           result = (Math.abs((distance - start) / step) + 2);
       }
        System.out.println("Потребуется для доставки дней: " + result);

        }

    }
