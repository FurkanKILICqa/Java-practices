package practice3;

import java.util.Scanner;

public class C04whileloop {

    public static void main(String[] args) {

        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız
        // Not: While loop kullanınız
        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");

        int sayi = input.nextInt();// Başlangıç değeri kullanıcını girdiği değer yani



        while (sayi%10!=0){// Burası 10 un katı olmadığı sürece çalışır

            System.out.print(sayi + " ");

            sayi++;// Burayı unutursak sonsuz döngüye gireriz


        }





















































    }
}
