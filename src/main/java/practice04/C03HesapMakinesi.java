package practice04;

import java.util.Scanner;

public class C03HesapMakinesi {

    public static void main(String[] args) {


         /*
        Basit 4 islem yapan bir hesap makinesi kodlayınız
        Kullanıcıcn yapacagi islemi islem sembolu ile( +  -  /  *  ) secmesini isteyiniz
        Kullanıcının 2 sayi girmesini isteyiniz
        Girilen islem ve sayilara gore dogru sonucu ekrana yazdırınız
        */

        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen yapmak istediğiniz işlemi seciniz: +, -, *, /");

        char islem= input.next().charAt(0);

        if (islem== '+' || islem == '-'|| islem=='*'|| islem =='/'){

            System.out.println("Lütfen islem yapmak istediğiniz sayilari giriniz \nBirinci sayi");

            double sayi = input.nextDouble();
            System.out.println("Ikınci sayi :");
            double sayi2= input.nextDouble();

            hesapMakinesi(islem,sayi,sayi2);//Methodu olusturmak için yazdık


        }else System.out.println("Hatali giris");



    }

    private static void hesapMakinesi(char islem, double sayi, double sayi2) {

        switch (islem){
            case '+':
                System.out.println(sayi+"+"+sayi2+"="+(sayi+sayi2) );break;
            case '-':
                System.out.println(sayi+"-"+sayi2+"="+(sayi-sayi2));break;
            case '*':
                System.out.println(sayi+"*"+sayi2+"="+sayi*sayi2);break;

            case '/':
                System.out.println(sayi+"/"+sayi2+"="+ sayi/sayi2);break;


        }




    }


}
