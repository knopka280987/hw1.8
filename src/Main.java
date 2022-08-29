import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //task1

        printIsLeap(  2020);
        printInstallationMessage(1, 2020);
    }

    private static void printIsLeap(int year) {
        if (year % 4 == 0 && year % 100 ≠ 0 || year % 400 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }
    private static void printInstallationMessage(int os, int productionYear){
        if (!(os == 0 || os == 1)){
            throw new RuntimeException("устройство поддерживаемо");
        }

        var currentYear :int = LocalDate.now().getYear();

        String versionMessage = productionYear < currentYear ? "облегченную" : "";
        String osMessage = os == 0?  "IOS" : "android";

        System.out.printf("Установите %s версию приложения для %s по ссылке", versionMessage, osMessage );
        if (os == 0) {
            if (productionYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        }else {
                if (productionYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для android по ссылке");
                }else {
                    System.out.println("Установите версию приложения для android по ссылке");

            }
        }

    }
}