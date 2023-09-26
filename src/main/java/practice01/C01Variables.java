package practice01;

public class C01Variables {
    public static void main(String[] args) {


        //(int) bir variable(yas)  olustur ve yazdır
        //syntax :

        //data turu + variable ismi + atama operatörü + variable değer + ;

             int           yas              =                 27         ;

        System.out.println(yas);


        //(int) bir variable(sayi)  olustur ve yazdır

        int tecrube = 50;

        System.out.println(tecrube);


        //konsola sayi = 50 seklinde yazdır

        System.out.println("sayi = " + tecrube); //variableyi ekiketi(ismiyle) ile yazdırma işlemidir

        System.out.println("tecrube = " + tecrube); // konsola yazdırma işlemi ilk önce veriablesini yazarız daha sonra
        //string yaparız (" ") sadece parantez içindeki gibi

        System.out.println("yas = " + yas );
        
        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala

         int benimYasim =  yas;
        System.out.println("benimYasim = " + benimYasim);


        //String bir variable olusturalım (isim)

        String isim = "can";
        
        //isim variable ını etiketıyle yazdır

        System.out.println("isim = " + isim);
        
        
        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala
        
        String onunIsmi = isim; //burada çift tırnak koymadık çünkü isim zaten bir kod üstte yazdık

        System.out.println("onunIsmi = " + onunIsmi);

        //onunIsmi variable'ını etiketiyle yazdır

        String onunIsm = isim;

        //isim variable'ının degerini guncelle

        isim = "ali" ;

        System.out.println("isim = " + isim);

        int kfk = 70 ;

        System.out.println("sayi = " + kfk);

        //isim ve onunIsmi variable'larını yazdır



        System.out.println("onunIsmi = " + onunIsmi);//onunIsmi = Can
        onunIsmi ="Veli";

        System.out.println("onunIsmi = " + onunIsmi);















































    }

}



