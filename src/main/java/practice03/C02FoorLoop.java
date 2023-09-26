package practice03;

import java.util.Scanner;

public class C02FoorLoop {
    public static void main(String[] args) {


        /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayılardan birler basamagı 7 veya 9 olanlar hariç diğerlerinin toplamını bulunuz

      */

        Scanner scan = new Scanner(System.in);

        int toplam =0;//Kullanıcıdan alacağım sayının toplamını koyacağımız bir kavanov


        for (int i = 0; i <5 ; i++) {//Loop 5 kere dönecek

            System.out.println("Lütfen bir sayı giriniz");//Buraya sout girmemizin sebebi
            int sayi = scan.nextInt();

            if (sayi%10==7 || sayi%10==9){
                
                continue;//İf condition kısmının true verdiği elemanları pass geçer Continiu 
                

            }
                toplam = toplam+ sayi ;//toplam+=sayi

        }
        System.out.println("toplam = " + toplam);

































































    }
}
