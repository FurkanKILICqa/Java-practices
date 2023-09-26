package practice06.superthis;

public class Parent {

    // Parent isminde bir class olusturunuz
    // Child class'ı, Parent class'a extends ediniz
    // Child class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor'u kullanarak Parent' den ekran cıktısı alınız


    public Parent() {// Parametresiz constructer

        System.out.println("Parent class parametresiz constructer");
    }

    public Parent(int a){
        System.out.println("Parent class tek parametreli constructer");

    }





    public Parent(int a , int b){
       // this();//Parent class daki parametresiz constructeri temsil eder // !!Parent class parametresiz constructer!!
        //this(7);// Bu class taki tek parametreli class ları temsil eder
        System.out.println("Parent class iki parametreli constructer");

    }










}
