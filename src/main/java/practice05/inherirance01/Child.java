package practice05.inherirance01;

public class Child extends Parent {


    int yas =10;

    public static void main(String[] args) {

        Parent.method1();

        method1();
        method2();


        System.out.println(isim);//Bu bir static variable dir bu şekilde yazdırılır
        System.out.println(soyisim);

        isim="Veli";//İsmi bu şekilde değiştirebiliriz zaten child class ların amacı kolay bir şekilde değişiklik yapabilme

        Parent objeyimBen = new Parent();

        System.out.println(objeyimBen.yas);
        objeyimBen.method3();
        objeyimBen.method4();


        Child obj2 = new Child();//Yaş variablesi Parent ta da var ama biz child class dan bir obje oluşturduk child yazdırılır
        System.out.println(obj2.yas);
        obj2.method3();
        obj2.method4();


    }















}
