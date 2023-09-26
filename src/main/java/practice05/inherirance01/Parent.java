package practice05.inherirance01;

public class Parent {

    //Inheritence

    // Parent class'da isim, soyisim adında static variable olusturalım,
    // method1 ve method2 adında static methodlar olusturalım
    // yas adında instance variable olusturalım
    // method3 ve method4 adında instance methodlar olusturalım
    // olusturdugumuz variable ve methodları Child class'dan extends(inharitance) ederek cagıralım



    //String ad ="Ali";//Bu da bir defoult variable dir çünkü başına defoult yazmadık instance methoddur

    protected static String isim ="Ali";//Bu bir static variable dir

    protected static String soyisim = "Can";//bu bir static variable dir

    protected static void method1(){//Bu bir static methoddur

        System.out.println("Parent class static method 1");
    }

    protected static void method2(){

        System.out.println("Parent class static method 2");
    }

    protected int yas = 30;

    protected void method3(){//Bu bir instance method dur

        System.out.println("Parent class instance method 3");


    }

    protected void method4(){
        System.out.println("Parent class instance method 4");

    }





















}



