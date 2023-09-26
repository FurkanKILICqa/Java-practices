package practice02Nt;

import java.util.Scanner;

public class C03ternary {

    public static void main(String[] args) {


          /*
            Kullanıcıdan bir sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz");

        int sayi = input.nextInt();

        Object result = sayi % 2 == 0 ? "Cift sayi" : sayi +3;


        System.out.println("Sonuc = " + (result));


        /*

        // iki durum varsa ternary yani bu kullandığımız formulü kullanırız
        // if veya if else de yapılabilir ama bu durum uzun olur
        // ikiden fazla durum vasrsa if veya if else yi kullanırız
        // switch ve ternary yi kullanamadığımız durumlarda if veya if else kullanılır


         */























    }



















}
