package practice02;

import java.util.Scanner;

public class tekpro {

    public static void main(String[] args) {


        /*
            Kullanıcıdan bir sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */
/*
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");

        int sayi = input.nextInt();
        
        Object result = sayi % 2 == 0 ? "Çift sayi" : sayi + 3;

        System.out.println(result);
        
 */
        
        
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 2 tane sayi giriniz");

        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();
        System.out.println("Lütfen toplamak için + çarpmak için * bölmek için / cıkarmak - giriniz");

        String operator = input.next();

        if (operator.equals("+") ){
            System.out.println("Sayilarin toplamı" + sayi1+sayi2);

        } else if (operator.equals("*")) {
            System.out.println("Sayikarin carpimi" + sayi1*sayi2);

        } else if (operator.equals("/")) {

            System.out.println("Sayilarin bölümü" + sayi1/sayi2);
        } else if (operator.equals("-")) {

            System.out.println(sayi1-sayi2);

        }else System.out.println("Lütfen bir sayı giriniz");


































    }


    }


