package practice05.practice05Deneme.ınheritance02Deneme;

public class Araba {


    // Araba, Opel, Corsa adında farklı class'lar olusturunuz.
    // Opel class'ı Araba class'ına baglı olacak
    // Corsa class'ı Opel class'ına baglı olacak
    // Araba class'ına genel bilgileri, variable ve method olarak yazınız.
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.
    // Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.

    //Tüm arabalar için ortak özellikleri tanımlayalım



    String hareket = "Arabalar teker ile hareket eder";

    String hiz = "Arabalar motor gucune göre hız yapar";

    String yakit = "Arabalar farklı yakıtlar kullanılabilir";

    String marka = "Arabalar uretildikleri markaya sahiptir";


    protected void motor(){
        System.out.println("Arabalar farklı markalarda motor kullanırlar");

    }

    protected void yakitTuketimi(){

        System.out.println("Arabalar motor gücüne ve yakit türüne göre yakit kullanılır");
    }









}
