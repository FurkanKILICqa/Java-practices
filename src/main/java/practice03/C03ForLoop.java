package practice03;

import java.util.Scanner;

public class C03ForLoop {
    public static void main(String[] args) {


         /*
            Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
            ve ardından yıldız işaretini kullanarak bir dik üçgen çizin

            Satır sayısı = 4 ==>      *
                                      * *
                                      * * *
                                      * * * *
            */

        //Interview sorusu



        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen satır sayısını sisteme giriniz");
        int satirSayisi = scan.nextInt();

        for (int i = 0; i <satirSayisi; i++) {//Satırlar için loop


            for (int j = 0; j <=i ; j++) {

                System.out.print("* ");


            }

            System.out.println();


        }

















































    }

}
