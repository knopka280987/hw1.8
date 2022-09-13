package task;

import java.time.LocalDate;
import java.util.Scanner;

import static java.time.Year.isLeap;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("введите код");
        System.out.println();
        var year = scanner.nextInt();
        System.out.println(isLeap(year) ? "високосный" : "не високосный");
//        System.out.println(generateInstallationMessage(1, 2020));
//        System.out.println("Потребуется для доставки дней: " + calculateDeliveryDays(10));
    }

    private static boolean IsLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static String generateInstallationMessage(int os, int productionYear) {
       if (!(os == 0 || os == 1)) {
           throw new RuntimeException("устройство поддерживаемо немедленно");
        }

       var currentYear= LocalDate.now().getYear();

       String versionMessage = productionYear < currentYear ? "облегченную" : "";
       String osMessage = os == 0 ? "iOS" : "android";

       return String.format("Установите %s версию приложения для %s по ссылке %s", versionMessage, osMessage);
    }

    private static int calculateDeliveryDays(int distance) {
       int start = 20;
       int step = 40;
       int result = 1;
       if (distance >= start) {
           result = (Math.abs((distance - start) / step) + 2);
       }
       return result;
        }
    }
