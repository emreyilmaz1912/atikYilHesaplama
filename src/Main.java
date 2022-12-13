import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Atık Yıl Hesaplamaya Hoşgeldiniz!");
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yılı giriniz :");
        year = input.nextInt();

        if (year % 100 == 0){
            if (year % 400  == 0){
                System.out.println(year + " Atık bir yıldır.");
            }else{
                System.out.println(year + " Atık bir yıl değildir.");
            }
        } else if (year % 4 == 0) {
            System.out.println(year + " Atık bir yıldır.");
        }else{
            System.out.println(year + " Atık bir yıl değildir.");
        }
    }
}