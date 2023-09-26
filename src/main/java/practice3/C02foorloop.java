package practice3;

import java.util.Scanner;

public class C02foorloop {


    public static void main(String[] args) {



         /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayılardan birler basamagı 7 veya 9 olanlar hariç diğerlerinin toplamını bulunuz
        */

        Scanner input = new Scanner(System.in);

        int toplam = 0;


        for (int i = 0; i <5 ; i++) {

            System.out.println("Lütfen bir sayı giriniz");
            int sayi = input.nextInt();

            if (sayi%10==7 || sayi%10==9){// On ile bölümünden kalan birler basamağındaki rakamı verir

                continue;// Bu sotu else ile de yapılabilir fakat else ile yaparsak continui kullanamayız o zaman

            }

            toplam = toplam + sayi;

        }

        System.out.println("Toplam : " + toplam);












































    }
}
