package practice3;

import java.util.Scanner;

public class C05dowhileloop {

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

        Scanner input = new Scanner(System.in);

        int  toplam =0;
        int sayac =0;


        do {//Kullanıcıdan 2 den fazla yani tekrarlı

            System.out.println("Lütfen pozitif  bir tam sayı giriniz\nLütfen bitirmek için 0' a basınız ");

            int sayi = input.nextInt();

            if (sayi==0){
                break;

            } else if (sayi<0) {

                System.out.println("Lütfen pozitif bir tam sayı giriniz");

                //continue;  else kullandığımız için continu dememize gerek kalmadı eğer else kullanmazzak contuniu kullanılrı

            }else {

                toplam = toplam + sayi;
                sayac++;// Sonsuz döngüye girmemek için sayacı bir artırırız

            }


        }while (true);// Döngü devam etsin diye true dedik

        System.out.println("Girdiğiniz  "+sayac+"  adet pozitif tamsayının toplamı :  " + toplam);

























































    }
}
