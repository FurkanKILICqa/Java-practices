package practice3;

import java.util.Scanner;

public class C03forloop {
    public static void main(String[] args) {



        /*
            Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
            ve ardından yıldız işaretini kullanarak bir dik üçgen çizin

            Satır sayısı = 4 ==>      *
                                      * *
                                      * * *
                                      * * * *
            */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz");
        int satirSayisi = input.nextInt();

        for (int i = 0; i <satirSayisi ; i++) {//Burada kullanucının girdiği sayı kadar dönecek.// burası satır döngüsü içindir

            for (int j = 0; j <= i; j++) {// Burada <= dememizin sebebi  ile de yazdırması için //Yıldız yazdırmak için

                System.out.print("* ");


            }

            System.out.println();//Imleci konsolda alt satıra getirir

        }



















































    }
}
