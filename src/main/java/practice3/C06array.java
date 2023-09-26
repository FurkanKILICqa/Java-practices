package practice3;

import java.util.Arrays;
import java.util.Scanner;

public class C06array {
    public static void main(String[] args) {

        //binarrysearch data nın içinde veri varmı yokmu diye kullanılır

        /*
        5 elemanlı bir array olusturunuz(int)
        Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız
        Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        Arrayin elemanlarının işaretlerini degistiren bir kod yazzınız
         */


        int [] arr = new int[5];//eleman sayısı

        System.out.println(Arrays.toString(arr));//[0,0,0,0,0] defoult array değeri

        Scanner input = new Scanner(System.in);

        for (int i = 0; i <arr.length ; i++) {

            System.out.println("Lütfen bir sayı giriniz");
            int sayi = input.nextInt();// Kullanıcının gireceği yer

            arr[i]=sayi;


        }

        System.out.println(Arrays.toString(arr));

        double toplam =0;

        for (int w : arr) {

            toplam = toplam +w;


        }
/*
        System.out.println("Toplam = " + toplam);

        double ortalama = toplam/arr.length;//Arr nin bütün karakter sayısı bölü (" / ")

        System.out.println("Ortalama " + ortalama);


        for ( int w : ortalama) {

        }

 */

























































    }

}
