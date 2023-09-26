package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class C06Array {

    public static void main(String[] args) {


         /*
        5 elemanlı bir array olusturunuz(int)
        Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız
        Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        Arrayin elemanlarının işaretlerini degistiren bir kod yazzınız
         */


        int arr [] = new int[5];
        System.out.println(Arrays.toString(arr));

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length ; i++) {

            System.out.println("Lütfen diziye eklemek istediğiniz sayiyi giriniz");
            int sayi = scan.nextInt();

            arr[i]=sayi;

        }

        System.out.println(Arrays.toString(arr));


        //Ortalamayı bulmak için arr elemanlarının toplatıp arr nin eleman sayısına böleriz


        double toplam = 0;// Ortalama küsüratlı gelebileceği için double ile oluşturalım

        for ( int w : arr) {
            
            toplam+=w;
            

        }

        System.out.println("toplam" + toplam);
        
        double ortalama =toplam/ arr.length;

        System.out.println("ortalama = " + ortalama);

        //Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        for (int each : arr) {

            if (each>ortalama){

                System.out.print(each + " ");


            }

        }


        //Arrayin elemanlarının işaretlerini degistiren bir kod yazzınız





























































    }
}
