package practice02Nt;

import java.util.Scanner;

public class C02NestedIff {

    public static void main(String[] args) {


        /*
      Kullanıcıdan sisteme bir numara girmesini isteyin.

      Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

      Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Rakam" yazdırın,
      10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

  */


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");

        int num = input.nextInt();

        if (num<0){


            System.out.println("Negatif sayi");

        }else {


            if (num<10){

                System.out.println("Rakam");


            }else {

                System.out.println("Pozitif sayı");// burada else nin içine if else dememizin sebebi java yı yormamak içindir


            }


        }






















    }


}
