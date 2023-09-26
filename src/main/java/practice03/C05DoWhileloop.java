package practice03;

import java.util.Scanner;

public class C05DoWhileloop {
    public static void main(String[] args) {

        /*
          Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
          Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

          kullanici bitirmek istediginde
          toplam kac adet pozitif tam sayi girdigini
          ve bunlarin toplaminin kac oldugunu yazdirin

          Kullanici negatif sayi girerse
          "negatif sayi kullanamazsiniz " yazdirin
          bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */

        Scanner scen = new Scanner(System.in);

        int toplam = 0;
        int sayac = 0;

        do {

            System.out.println("Lütfen bir sayı giriniz \nBitirmek için 0'a basın ");
            int sayi = scen.nextInt();

            if (sayi==0){

                System.out.println("Oyun bitti");
                break;


            } else if (sayi<0) {// Burada continu ile de yazılabilir o zaman else komutuna ihtiyac kalmaz

                System.out.println("Negatif sayı kullanamazsın ");

            }else{

                toplam = toplam + sayi;//toplam+=sayi

                sayac++;

            }


        }while (true);


        System.out.println("Girdiğiniz "+sayac+" adet pozitif tamsayının toplamı :" + toplam);




















































    }

}
