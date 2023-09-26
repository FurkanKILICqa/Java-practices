package practice3;

import java.util.Scanner;

public class C01foloop {

    public static void main(String[] args) {

            /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir kelime giriniz");

        String kemile = input.next();

        int sayac = 0;

        for (int i = 0; i <kemile.length() ; i++) {

            if (kemile.charAt(i)=='c'){ //Bir kelimedeki karakterleri tek tek kullanmak için charat kullanırız
                break;

            } else if (kemile.charAt(i)=='a') {

                sayac++;

            }

        }

        System.out.println("İlk c harflerinden sonrakilerin toplamı : "  + sayac );

















































    }


}
