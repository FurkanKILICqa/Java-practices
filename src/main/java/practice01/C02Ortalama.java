package practice01;

public class C02Ortalama {
    public static void main(String[] args) {

/*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
        ortalama nasıl hesaplanır -> tum sayıları topla, sayı adedine böl
     */

        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;


        System.out.println((num1 + num2 + num3 + num4 + num5) / 5 );


        //ilk once tum sayıların toplamını bulup bir konteyner a koyalım
        double toplam = num1 + num2 + num3 + num4 + num5 ;
        // + işareti sayısal ifadeler arasında kullanılıyorsa matematiksel toplama yapar
        System.out.println("toplam = " + toplam);//609.7

        //toplam / 5 ile ortalamayı bulalım
        double ortalama = toplam / 5 ;
        System.out.println("ortalama = " + ortalama);//121.94000000000001























    }








}
