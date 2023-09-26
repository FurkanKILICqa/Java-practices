package practice05.practice05Deneme.ınheritance02Deneme;

public class Opel  extends Araba{

    String hiz = "Opel arabalar maksimum 220 kilometre hız yapar";

    String marka = "Opel";

    String sirketMerkezi = "Almanya";


    @Override
    protected void motor() {
        System.out.println("Opel marka arabalar Opel marka motor kullanır");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Opel arabalar 2 yıl garantilidir");
    }



}
