package practice06.superthis;

public class Child extends Parent {


    public Child(){
        System.out.println("Child class parametresiz constructer");
    }


    public  Child (int a){
       // super(4);
        System.out.println("Child class tek constructer");
    }


    public Child (int a , int b){
        super(4,7);
        System.out.println("Child class iki constructer");
    }

    public static void main(String[] args) {

       Child obj1 = new Child(1,7);

       //Parent teki leri görmek istiyorsan hangi parametreliyi







    }




}
