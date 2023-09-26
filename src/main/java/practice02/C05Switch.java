package practice02;

import java.util.Scanner;

public class C05Switch {

    public static void main(String[] args) {

        // boolean hariç if , if else in yaptığı herşeyi yapar genelde çok satır yazacaksak kullanırız

         /*

         Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.

         Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
              puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
              puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
              puanı 2,5-3,5 arasında ise UST seviyesi veriniz
              puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz

              //Üstteki durumlarda switch kullanamayız çünkü üsttekilerin içinde boolean , float , double var

        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTİ seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARİKA seviyesine A harf notu veriniz

          */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 0-4 arası bir puan giriniz");

        double puan = input.nextDouble();
        String seviye = "";//if else dısında da kullanabilmek için seviyeyi ifelse den önce olusturuyoruz


        if (puan>=0 && puan <1){
            seviye ="KALDI";
        } else if (puan>=1 && puan <2){
            seviye ="GECTI";
        } else if (puan>=2 && puan<2.5) {
            seviye="IYI";
        }else if (puan>=2.5 && puan < 3.5){
            seviye="UST";
        }else if (puan >=3.5 && puan <=4){
            seviye="HARIKA";
        }else {
            seviye="Atanmadi, yanlis giris";
        }

        System.out.println("seviye = " + seviye);

        /*

        switch (seviye){

            case "KALDI" :
                System.out.println("F");
                break;
            case "Geçti" :
                System.out.println("D");
                break;
            case "Iyi" :
                System.out.println("C");
                break;
            case "Ust" :
                System.out.println("B");
                break;
            case "Harika" :
                System.out.println("A");
                break;

            default:
                System.out.println("Sınav puanınızı doğru giriniz");

         */

        switch (seviye) {
            case "KALDI":
                System.out.println("F");
                break;
            case "GECTİ":
                System.out.println("D");
                break;
            case "IYI":
                System.out.println("C");
                break;
            case "UST":
                System.out.println("B");
                break;
            case "HARIKA":
                System.out.println("A");
                break;
            default:
                System.out.println("Sinav puanınızı dogru giriniz");

        }



















    }







}
