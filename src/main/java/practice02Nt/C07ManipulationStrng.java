package practice02Nt;

import java.util.Scanner;

public class C07ManipulationStrng {

    public static void main(String[] args) {

         /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen adinizi ve soyadinizi aralarında bir boşluk olacak şekilde giriniz"+
                "\nNot: Yanlizca bir ad bir soy ad girmeli ");

        String adSoyad = scan.nextLine();// kullanıci birden fazla kelime gireceği için nextline kullanırız


        int spaceIndx = adSoyad.indexOf(" "); // boşluk olacağı için indexOf kullandık
        String ad = adSoyad.substring(0,spaceIndx); // substringde ilk index dahil ikinci index hariç tir
        //substring 2 parametre ile kullanılısa ;ilk index dahil, ikinci index harictir
        //substring tek parametre ile kullanılırsa indx dahil stringin sonuna kadar alır

        String soyad=adSoyad.substring(spaceIndx+1);

        //aLi cAn
        //Ali Can

        String ad2 = ad.toUpperCase().charAt(0) + ad.toLowerCase().substring(1);
        //     A                           li

        String soyad2 = soyad.toUpperCase().charAt(0) + soyad.toLowerCase().substring(1);


        System.out.println(ad2);
        System.out.println(soyad2);

























    }

















}
