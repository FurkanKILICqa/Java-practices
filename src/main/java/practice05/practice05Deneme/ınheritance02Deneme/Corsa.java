package practice05.practice05Deneme.ınheritance02Deneme;

public class Corsa extends Opel{


    String hiz = "COrsa arabalar maksimum 200 km hız yapabilir";

    String yakit = "Corsa arabalar benzinli veya elektriklidir";

    String model = "Corsa";


    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanır");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5.6 lt yakıt tüketir");
    }

    protected void vitesSayisi(){
        System.out.println("Corsa arabalar 5 viteslidir");

    }


    public static void main(String[] args) {
















    }


}
