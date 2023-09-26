package practice05.inherirance01;

public class Baby extends Child {

    int kilo =45;


    public static void main(String[] args) {



        method1();
        method2();

        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);

        Baby obj3 = new Baby();
        obj3.method3();
        obj3.method4();
        System.out.println(obj3.yas);// Burada ilk olarak parent ti Child objesine gider o yüzden yaş 10 olur
        System.out.println(obj3.kilo);


        Parent obj4 = new Baby();//
        System.out.println(obj4.yas);
        obj4.method3();


        Child obj5 = new Child();//Obje hangi class tan oluşturulduysa o class ı içinden yukarıya doğru arar
        obj5.method3();
        obj5.method4();





    }




}
