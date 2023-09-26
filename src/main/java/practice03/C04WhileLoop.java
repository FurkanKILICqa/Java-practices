package practice03;

import java.util.Scanner;

public class C04WhileLoop {
    public static void main(String[] args) {

        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız
        // Not: While loop kullanınız
        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");

        int sayi = scan.nextInt();//Başlangıç değeri



        while (sayi%10!=0){//Sayi 10 un katı olduğu anda loop bitecek 10 un katı olmadığı müdetce çalışacak

            System.out.println(sayi +" ");

            sayi++;


        }












































































    }

}
