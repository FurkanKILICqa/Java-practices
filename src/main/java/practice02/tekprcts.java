package practice02;

import java.util.Scanner;

public class tekprcts {

    public static void main(String[] args) {


        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lütfen ikinci sayiyi giriniz");
        
        int sayi2 = scan.nextInt();
        
        if (sayi1>0 && sayi2>0) {

            System.out.println("Toplamı ="+ (sayi1+sayi2) );
            
            
            
            
        } else if (sayi1<0 && sayi2<0) {

            System.out.println("Carpımı = "+ (sayi1*sayi2) );
            
            
        } else if (sayi1<0 && sayi2>0 || sayi1>0 && sayi2<0) {

            System.out.println("Farklı işaretli sayılar ile işlem yapılamaz");

            
        }else
            System.out.println("Sıfır yutan elemandır");



        /*
      Kullanıcıdan sisteme bir numara girmesini isteyin.

      Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

      Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Rakam" yazdırın,
      10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

  */


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir numara giriniz");

        int num = input.nextInt();

        if (num<0){

            System.out.println("Negatif sayı");



        }else {

            if (num<10){

                System.out.println("Rakam");

            } else if (num>10 || num == 10) {


                System.out.println("Pozitif sayi");

            }


        }

































    }






















}
