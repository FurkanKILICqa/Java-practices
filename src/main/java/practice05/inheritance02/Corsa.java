package practice05.inheritance02;

public class Corsa extends Opel {

    String hiz = "COrsa arabalar maksimum 200 km hız yapabilir";

    String yakit = "Corsa arabalar benzinli veya elektriklidir";

    String model = "Corsa";


    @Override
    protected void motor() {
        System.out.println("Corsa arabalar çevreci motor kullanır");
    }


    @Override
    protected void yakittuketimi() {
        System.out.println("Corsa arabalar 2.6 litre yakıt tüketir");
    }
    protected void vitessayisi(){

        System.out.println("Corsalar 5 viteslidir");

    }

    //COrsa model arabanın belirgin özelliklerini yazdık

    public static void main(String[] args) {

        //Corsa objesi

        Corsa c1 = new Corsa();
        System.out.println(c1.hiz);//Kendi classın dan geldi
        System.out.println(c1.model);//kendi classın dan geldi
        System.out.println(c1.yakit);//Knedi classın dan geldi

        System.out.println(c1.hareket);//Araba clasından gelir

        System.out.println(c1.marka);//Opel calss dan geldi

        System.out.println(c1.sirketMerkezi);//Opel class dan gelir

        c1.motor();//Corsadan gelir

        Opel arb2 = new Corsa();//Burada opeli de Corsa ya seçebiliriz çünkü Corsa opelin çocuğudur
        // Burada obje arb2 Corsa ise constructer dır Consructer datanın childlerinden seçilebilri Soldaki sağdakinden düyük olacak
        System.out.println("arb2.hareket = " + arb2.hareket);//Arabadan gelir
        System.out.println("arb2.hiz = " + arb2.hiz);//Opelden gelir
        System.out.println("arb2.yakit = " + arb2.yakit);//Buradaki yakit Corsadan değil arabadan gelsi

        System.out.println("arb2.marka = " + arb2.marka);//Opleden gelir

        arb2.motor();//İlk önce motoru bı-ulur sonra override edildimi bapar "Opel" den başlar "Corsa" ya kadar bakar


        //Consructer datanın childlerinden seçilebilri Soldaki sağdakinden düyük olacak

        arb2.garanti();//Opel class dan geldi

        arb2.yakittuketimi();//Override edildiği için corsa dan gelir override edilmeseydi Araba classından gelecekti

        //arb2.vitessayisi //Opelden aramaya başladı orada bulamayınca hata verdi objeyi Opel yerine Corsadan başlasaydık
        //o zaman bulabilirdik


        Araba arb3 = new Corsa();//Data türü Araba Constructeri ise Corsa dır

        System.out.println("arb3.hareket = " + arb3.hareket);//Arabadan gelir

        System.out.println("arb3.hiz = " + arb3.hiz);//Araba dan gelir

        System.out.println("arb3.yakit = " + arb3.yakit);//Araba dan gelir

        arb3.motor();//Corsa dan gelir

        arb3.yakittuketimi();//Corsadan gelir

        //arb3.garanti //Arama herzaman yukarıya doğru olur aşağıdan yukarıya olmaz

        Araba arb4 = new Opel(); //Herzaman soldan sağa doğru gider

        System.out.println(arb4.hiz);//Araba dan gelir
        System.out.println(arb4.yakit);//Araban gelir

        arb4.motor();//Opel clasından gelir ilk önce abarada buldu sonra override edildimi diye baktı sonra
        arb4.yakittuketimi();//Araba class ından gelir






    }


}
