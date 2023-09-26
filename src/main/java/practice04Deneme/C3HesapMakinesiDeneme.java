package practice04Deneme;

import java.util.Scanner;

public class C3HesapMakinesiDeneme {

    public static void main(String[] args) {

        /*
        Basit 4 islem yapan bir hesap makinesi kodlayınız
        Kullanıcıcn yapacagi islemi islem sembolu ile( +  -  /  *  ) secmesini isteyiniz
        Kullanıcının 2 sayi girmesini isteyiniz
        Girilen islem ve sayilara gore dogru sonucu ekrana yazdırınız
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen yapmak istediğimiz işlemi giriniz +, *, -, / ");

        char islem = input.next().charAt(0);//Burada char ile almamızın sebebi hafızadan tasarruf etmek için

        if (islem== '+' || islem== '-' || islem== '*' || islem== '/' ){

            System.out.println("Lütfen işlem yapmak istediğiniz sayilari giriniz\nBirinci sayi :");
            double sayi1 = input.nextDouble();

            System.out.println("ikinci sayi");
            double sayi2 = input.nextDouble();


            hesapMakinesi(islem,sayi1,sayi2);

        }else System.out.println("Hatali giriş");





    }

    private static void hesapMakinesi(char islem, double sayi1, double sayi2) {

        switch (islem){//Burayı if ilede yapabilirdik ama switch ile hem daha kısa hem daha temiz bir kod yazdık
            case '+':
                System.out.println(sayi1+sayi2);break;

            case '-':
                System.out.println(sayi1-sayi2);break;

            case '*':
                System.out.println(sayi1*sayi2);break;
            case '/':
                System.out.println(sayi1/sayi2);break;
        }


    }

}
