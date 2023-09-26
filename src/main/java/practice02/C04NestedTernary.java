package practice02;

import java.util.Scanner;

public class C04NestedTernary {

    public static void main(String[] args) {

        // nested iç içe demek

         /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen birinci tam sayıyı giriniz");

        int sayi1 = input.nextInt();

        System.out.println("Lütfen ikinci tam sayiyi giriniz");

        int sayi2 = input.nextInt();

        System.out.println(sayi1 == sayi2 ? "Sayilar birbirine eşit" : (sayi1 > sayi2 ? sayi1 : sayi2));


    }




}
