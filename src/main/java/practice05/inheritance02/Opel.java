package practice05.inheritance02;

public class Opel extends Araba {

    //Daha spesifik

        String hiz = "Opel arabalar maksimum hız yaparlar";

        String marka = "Opel";

        String sirketMerkezi = "Almanya";



        protected void garanti (){
            System.out.println("Opel arabalar 2 yıl garantilidir ");
        }


    @Override
    protected void motor() {
        System.out.println("Opel arabalar Opel marka motor kullanır");
    }












}
