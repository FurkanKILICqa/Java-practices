package practice04Deneme;

public class C5VarargsDeneme {
    public static void main(String[] args) {

        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olanı yazdıran bir method olusturun
        // bu methodun access modifier'ını public yapıp aynı packagagedeki faklı bir classdan calıstırınız
        //Vararkslar arka planda array kullanır

        String st1 = "Ali";
        String st2 = "Veli";
        String st3 = "Cengiz";
        String st4 = "Ahmet";
        String st5 = "Abdurrezzak";


        enUzunKelime(st1,st2,st3,st4,st5);//Isimleri bir kazanoza koyduk



    }

    public static void enUzunKelime(String...str) {//Bu vararks yapısı çoklu verileri depolamak için kullanılır

        String enUzunKelime ="";

        for (String  each :  str) {//Burada bütün isimleri teker teker karşılaştırdık en uzun kelime ile kıyaslar ve

            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;

            }
        }
        System.out.println(enUzunKelime);



    }


}
