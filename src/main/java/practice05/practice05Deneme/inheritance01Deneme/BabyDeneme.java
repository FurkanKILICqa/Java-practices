package practice05.practice05Deneme.inheritance01Deneme;

public class BabyDeneme extends Child {//Bu bir multilevel inheritance class içinde class


    int kilo = 45;//Bu bir ınstance variable dir çünkü static mi belitmedik


    public static void main(String[] args) {

       method1();
       method2();
       System.out.println("isim = " + isim);
       System.out.println("soyIsim = " + soyIsim);

        BabyDeneme obj3 = new BabyDeneme();
        obj3.method3();
        obj3.method4();
        System.out.println("obj3.yas = " + obj3.yas);//Aşağıdan yukarıya sıra ile arar o yüzden yaş 30 değil 10 dur
        System.out.println("obj3.kilo = " + obj3.kilo);


        Child obj4 = new Child();
        System.out.println("obj4.yas = " + obj4.yas);
        //obj4.kilo//Bu method baby class ta olduğu için bu class taki obje yi tanımaz







    }






}
