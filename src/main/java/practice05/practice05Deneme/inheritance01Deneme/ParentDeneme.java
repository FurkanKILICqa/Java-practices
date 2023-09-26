package practice05.practice05Deneme.inheritance01Deneme;

public class ParentDeneme {

    // Parent class'da isim, soyisim adında static variable olusturalım,
    // method1 ve method2 adında static methodlar olusturalım
    // yas adında instance variable olusturalım
    // method3 ve method4 adında instance methodlar olusturalım
    // olusturdugumuz variable ve methodları Child class'dan extends(inharitance) ederek cagıralım


    protected static String isim= "Ali";//Bu bir static variable dir static method değildir methodların süslü parantezi olur

    protected static String soyIsim = "CAN";


    protected static void method1(){//Bu bir static method dur//void sadece burada yazdırmaya yarar return kullanılmaz

        System.out.println("Parent slass static method1");

    }

    protected static void method2(){

        System.out.println("Parent class static method2");

    }


    //Bu bir instance variable dir
    protected int yas =30;//Instance variable veya methodlar da static yazmıyorsak o bir instance dir



    protected void method3(){


        System.out.println("Parent class instance method3");
    }

    protected void method4(){

        System.out.println("Parent class instance method4");
    }











}
