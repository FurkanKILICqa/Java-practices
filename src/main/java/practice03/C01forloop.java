package practice03;

import java.util.Scanner;

public class C01forloop {
    public static void main(String[] args) {


         /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir kelime giriniz");

        String kelime = scan.next();

        //Stringteki bütün karakterleri tektek charat

        int sayac =0;

        for (int i = 0; i <kelime.length() ; i++) {

            if(kelime.charAt(i)=='a'){
                sayac++;


            } else if (kelime.charAt(i)=='c') {//Karakterlerde eşitliği == ile konrol ederiz equals ile değil
                break;
            }


        }
        System.out.println("Ilk c harflerine kadar olan harf sayısı" + sayac);














































    }
}
