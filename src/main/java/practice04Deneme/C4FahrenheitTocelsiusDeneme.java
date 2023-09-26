package practice04Deneme;

import java.util.Scanner;

public class C4FahrenheitTocelsiusDeneme {

    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen fahrenayt cinsinden sıcaklık değeri giriniz");
        double fahrenayt = input.nextDouble();


        double celsius = fahrenayttoCelsius(fahrenayt);//Burayı direkt sout ile de yazdırabilirdik
        System.out.println("fahrenayt = " + fahrenayt);//Girilen fahrenayt değerini giriniz
        System.out.println("celsius = " + celsius);//Hesaplanan değeri yani celsius değerini girer



    }

    private static double fahrenayttoCelsius(double fahrenayt) {//Burada celsius döndürmeli o yüzden void yerine double yazdırdık

        //formül: c = (f-32)/1.8


        double celsius=(fahrenayt-32)/1.8;//Yöntem her zaman verilir sakin ol!!!


        return celsius;
    }
}
