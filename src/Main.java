import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        boolean isLeapYear = false;

        Scanner input = new Scanner(System.in);
        //We get the year data from the user.
        System.out.print("Yıl giriniz: ");
        year = input.nextInt();
        //We check if the entered year is divisible by 4 and if it is divisible by 100, we also check if it is divisible by 400.
        if (year % 4 == 0) {
            if (year % 100 != 0 || (year % 400 == 0)) {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println(year + " bir artık yıldır.");
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}