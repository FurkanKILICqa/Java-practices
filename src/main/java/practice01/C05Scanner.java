package practice01;

import java.util.Scanner;

public class C05Scanner {


    public static void main(String[] args) {






         /*
        kullanıcıdan aldıgınız sayının karesini bulunuz bulunuz
       not:bir sayının karesi,sayının kendisi ile carpımına esittir
     */

        // scanner ri yaparken ilk önce scanner objesi oluşturmak

        Scanner input = new Scanner(System.in) ;

        // kullanıcıya mesaj (ne yapacagını söylememiz gerekir) vermek gerekir

        System.out.println("lütfen karesini bulmak istediğiniz sayıyı giriniz");


        int sayi = input.nextInt();


        System.out.println(sayi);


        System.out.println(sayi*sayi);


















    }
}
