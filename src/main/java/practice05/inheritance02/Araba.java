package practice05.inheritance02;

public class Araba {


    // Araba, Opel, Corsa adında farklı class'lar olusturunuz.
    // Opel class'ı Araba class'ına baglı olacak
    // Corsa class'ı Opel class'ına baglı olacak
    // Araba class'ına genel bilgileri, variable ve method olarak yazınız.
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.
    // Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.
    //Bütün objeler için ortak olanra için static kullanılır ama instance daha fazla tercih edilir çünkü kolay değiştirilebirir

    //Bu class a tüm aarabalar için ortak olan özellikler girilir

    //Bunları method olarak da tanımlayabilirdik burada hepsini görmek için ve soruda oyle istiyor müşteri daima haklıdır

    String hareket = "Arabalar teker ile hareket eder";

    String marka = "Arabalar üretildikleri markaya sahiptir";

    String hiz = "Arabalar motor gücüne göre hareket eder";

    String yakit = "Arabalar farklı türde yakıtlar kullanırlar";

    //Tüm arabalar için ortak özellikleri birde method olarak yazalım



    protected void motor(){
        System.out.println("Arabalar farklı markalarda motor kullanırlar");

    }

    protected void yakittuketimi(){
        System.out.println("Arabalar motor gücüne ve yakit türüne göre yakit kullanılır");

    }


























}
