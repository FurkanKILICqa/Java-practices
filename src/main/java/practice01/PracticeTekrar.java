package practice01;

import java.util.Scanner;

public class PracticeTekrar {


    public static void main(String[] args) {



        //(int) bir variable(yas)  olustur ve yazdır

        int saat = 5;

        //(int) bir variable(sayi)  olustur ve yazdır

        int yas = 50;

        System.out.println(yas);

        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala

        System.out.println("benimYasim = " + yas);

        //String bir variable olusturalım
        
        String isim = "furkan";

        //isim variable ını etiketıyle yazdır

        System.out.println("isim = " + isim);


        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala
        
        
        String onunIsmi = isim;

        System.out.println("onunIsimi = " + isim);


        //isim variable'ının degerini guncelle
        
        isim = "ali";

        System.out.println("isim =" + isim);


        //isim ve onunIsmi variable'larını yazdır

        System.out.println("onunIsmi = " + onunIsmi);
        onunIsmi = "veli";

        System.out.println("onunIsmi = " + onunIsmi);



        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;



        double toplam = num1 + num2 + num3 + num4 + num5 ; //

        System.out.println("toplam = " + toplam);





        System.out.println("ortalama= " + toplam / 5);


        /*

        Isim: ...
        Soyisim: ...
        Yas: ...
        Boy: ...
        Kilo: ...

         */

        String ad = "Furkan";
        String soyad = "KILIC " ;
        byte matem = 27;
        double boy = 1.87;
        double kilo = 100;

        System.out.println("Ad: " + ad + "\nSoyAd: " + soyad + "\nYas:" + matem + "\nboy:" + boy + "\nKilo:" + kilo);



        /*
        Java5Güzel yazdırın
        8Java yazdırın
        Java8Guzel yazdırın
        2Güzel15 yazdırın
        Java22 yazdırın
        53Güzel yazdırın


         */


        String str1="Java";
        String str2="Güzel";
        int sayi1=5;
        int sayi2=3;


        System.out.println(str1 + sayi1 + str2);

        System.out.println(sayi1 + sayi2 + str1);

        System.out.println(str1 +  (sayi1 + sayi2) + str2 );

        System.out.println((sayi1 - sayi2 ) + str2  + (sayi1 * sayi2 ));

        System.out.println(str1 + (sayi1 - sayi2 ) + (sayi1 - sayi2 ) );

        System.out.println(sayi1 + (sayi2 + str2 ));

        System.out.println("" + sayi1 + sayi2 + str2);


        // scanner ri yaparken ilk önce scanner objesi oluşturmak

        Scanner input = new Scanner(System.in);

        // kullanıcıya mesaj (ne yapacagını söylememiz gerekir) vermek gerekir


        System.out.println("lütfen yaşınızı giriniz");


        int t = input.nextInt();


        System.out.println(t);


        // Dış panelde işlem yapmak istiyprsak her zaman "sout kullanırız"































    }
}
