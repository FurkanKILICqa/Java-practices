package practice04Deneme;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDeneme {


    public static void main(String[] args) {

        /*
        Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun sonra dogdu.
        Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
        Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
         */

        LocalDate aliBirth = LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);

        LocalDate veliBirth = LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);

        System.out.println(aliBirth);
        System.out.println(veliBirth);

        DateTimeFormatter formatedali = DateTimeFormatter.ofPattern("yy/M/d");//Bu sadece orjinalini değiştirir
        // bu direkt yazdırılmaz

        System.out.println(formatedali.format(aliBirth));//Formatlanmış versiyonu bu şekilde yazdırılır

        if (aliBirth.equals(veliBirth)){

            System.out.println("Ali ve veli aynı tarihtre doğmamıştır");

        }else System.out.println("Aynı tarihte dogmamışlar");



        /*
        Kulanıcıdan alınan bir tam sayı kadar(47den kucuk olmak kosuluyla)
        FIBONACCI dizisi olusturun
        Ör: sayi=10 için
        0-1-1-2-3-5-8-13-21-34 gibi
         */
        //Ödev


































    }


}
