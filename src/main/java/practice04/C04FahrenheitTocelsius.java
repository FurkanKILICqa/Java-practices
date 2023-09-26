package practice04;

import java.util.Scanner;

public class C04FahrenheitTocelsius {

    public static void main(String[] args) {


        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir fahrenahit değeri girin");
        double fahrenayt = input.nextDouble();
        System.out.println(fahrenayt);

        double celsius = fahrenaytToCelsius(fahrenayt);
        System.out.println(celsius);


    }

    public static double fahrenaytToCelsius(double fahrenayt) {//Voidler yeni data üretmez void olmayanlar buraya hangi datayı
        //yazdıysak onu üretir
        // formül: c = (f-32)/1.8

        double celsisus = (fahrenayt-32) /1.8;//Formül verilir


        return celsisus;
    }

}
