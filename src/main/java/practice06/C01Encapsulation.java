package practice06;

public class C01Encapsulation {

        /*
    bir class olusturun
    private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor olusturun
    bu variablelara ait getter setter methodlarını olusturun
    toString methodunu olusturun
    parametreli constructer oluşturduğumuzda parametresiz constructerde oluşturmalıyız
    //4-toString methodu bu classtan olusturulan objeyi sout içinde direk yazdırmaya yarar
    //eger toString() methodu yoksa olusan objeyi sout içinde yazdırmaya calıstıgımızda referans
     */



    private String isim;
    private String soyIsim;
    private Integer yaş;


    public C01Encapsulation(String isim, String soyIsim, Integer yaş) {//Bu bir parametreli constructer dir
        if (isim.charAt(0)>='A' && isim.charAt(0)<= 'Z'){


        }else {

            throw new IllegalArgumentException("Isım büyük harf ile başlar");
        }


        this.isim = isim;
        this.soyIsim = soyIsim;

       //if (yaş<0){
       //    System.out.println("Negatifsayı girilemez");
       //}else {
       //    this.yaş = yaş;
       //}
        if(yaş<0){
            throw new IllegalArgumentException("Negatif yas giremezsiniz");
        }else {
            System.out.println(this.yaş = yaş);

        }


    }


    public C01Encapsulation() {//Bu bir parametresisz constructer



    }


    //Gether ve setter methotları oluşturduk

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {

        if (isim.charAt(0)>='A' && isim.charAt(0)<='Z'){//İlk harf büyükse yaz dedik
            this.isim = isim;


        }else {
            throw new IllegalArgumentException("Isim büyük harf ile başlar");
        }




    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public Integer getYaş() {
        return yaş;
    }

    public void setYaş(Integer yaş) {
        if (yaş<0||yaş>110){
            System.out.println("Yaş negatif olamaz");
            System.out.println("Lütfen mantıklı bir yaş değeri giriniz !!!");

        }else{
            this.yaş = yaş;
        }


    }


    // to-String methodu // başka bir class dan sout ile yazdırabilmek için kullanırız bu nu yazmazsak referansını verir bize
//
    @Override
    public String toString() {
        return "C01Encapsulation{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yaş=" + yaş +
                '}';
    }
}


