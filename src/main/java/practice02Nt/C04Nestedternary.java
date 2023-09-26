package practice02Nt;

import java.util.Scanner;

public class C04Nestedternary {


    public static void main(String[] args) {

        // iç içe ternary demektir

           /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen birinci sayiyi giriniz");

        int sayi1 = input.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz");

        int sayi2 = input.nextInt();

        System.out.println(sayi1 == sayi2 ? "Sayilar birbirine eşit" : sayi1 > sayi2 ? sayi1 : sayi2);// Birinci yol

        // kodu başka bir yerde kullanmayacaksak yani sadece yazdıracaksak üstteki gibi yaparız kullanacaksak Object ile yaparız

        //Object result =  a == b ? "Sayilar birbirine eşit" : sayi1 > sayi2 ? sayi1 : sayi2

        // System.out.println(result) // İkinci yol buda kullanılabilir







    }















}
