package practice05;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 47 den kucuk bir tam sayı giriniz");
        int sayi = input.nextInt();


        fibonacci(sayi);
    }

    public static void fibonacci (int sayi){

        int num1=0;
        int num2=1;
        int num3;

        if (sayi<47&&sayi>-1){
            for (int i = 0; i <sayi ; i++) {

                System.out.println(num1+" ");
                num3=num1+num2;
                num1=num2;
                num2=num3;
            }
        }else System.out.println("lütfen geçeli bir sayi giriniz");


    }





    //Müşterinin girdiği sayı akdar döner Ör: 25 girdiyse 25 kere toplayarak hesaplar


}
