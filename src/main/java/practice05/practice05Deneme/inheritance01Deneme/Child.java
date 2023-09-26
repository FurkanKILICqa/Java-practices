package practice05.practice05Deneme.inheritance01Deneme;

public class Child extends ParentDeneme {

    int yas =10;

    public static void main(String[] args) {


        //Child class Parent class a extance olduğu için böyle çağırabildim
        method1();
        method2();

        System.out.println("isim = " + isim);
        System.out.println("soyIsim = " + soyIsim);

        isim="veli";//Bu rada amaç zaten Prent a gitmeden kolayca değiştirmektir
        System.out.println("isim = " + isim);

        Child yas1 = new Child();//Instance lar static olmadıkları için direkt isim ile çağırılamazlar bu şekilde...

        yas1.method3();
        yas1.method3();
        System.out.println("yas1.yas = " + yas1.yas);


        ParentDeneme obj2 = new ParentDeneme();//Obje neyden oluşturulduysa oradan aramaya başlar
        System.out.println("obj2.yas = " + obj2.yas);
        obj2.method3();
        obj2.method4();


    }







}
