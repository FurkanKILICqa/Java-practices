package practice02;

import java.util.Scanner;

public class C03Ternary {

    public static void main(String[] args) {


        // condition ?  durum1 : durum2

        /*
            Kullanıcıdan bir sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");

        int sayi = input.nextInt();

        Object result = sayi % 2 == 0 ? "Cift sayi" : sayi + 3;

        System.out.println(result);





























    }




}
