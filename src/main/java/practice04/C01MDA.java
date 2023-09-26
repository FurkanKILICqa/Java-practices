package practice04;

import java.util.Arrays;
import java.util.Scanner;

public class C01MDA {

    public static void main(String[] args) {


    /*
        arr[3][2] luk bir mdarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int [][] arr={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */

        int [] [] arr = new int[3][2];

        System.out.println(Arrays.deepToString(arr));

        Scanner input = new Scanner(System.in);

        for (int i = 0; i <arr.length ; i++) {//Outer Array elemanlarını gezecek

            for (int j = 0; j <arr[i].length ; j++) {//Inner array elemanlarını alacak

                System.out.println("Lütfen eklemek istediğiniz tam sayıyı giriniz");
                arr[i][j]= input.nextInt();

            }

        }
        System.out.println(Arrays.deepToString(arr));

        int [] brr = new int[arr.length];//Dış array in eleman sayısı

        for (int i = 0; i <arr.length ; i++) {//Dış array elemanlarını alacak

            int toplam =0;//0toplamada etkisiz eleman olduğu için 0 verdik

            for (int j = 0; j <arr[i].length ; j++) {//

                toplam = toplam + arr[i][j];


            }

            brr[i]=toplam;

        }

        System.out.println(Arrays.toString(brr));
































    }


}
