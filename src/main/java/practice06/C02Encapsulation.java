package practice06;

public class C02Encapsulation {

    //Ali, Can, 25 ozelliklerine sahip bir obje olusturunuzz ve yazdırınız
    //objenin yasını 30 olarak guncelleyin
    //parametresiz cons kullanarak 2. bir obje olusturun
    //Ayse, Yilmaz, 40 degerlerini atayın
    //yas ı -5 olarak guncelleyin
    //yas negatif deger alamayacak sekilde set methodunu guncelleyin
    //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
    //isim kucuk harfle baslamayacak sekilde parametreli constructoru guncelleyin

    public static void main(String[] args) {


        C01Encapsulation capsul = new C01Encapsulation("Ali","Can",25);

        System.out.println(capsul.getIsim());
        System.out.println(capsul.getSoyIsim());
        System.out.println(capsul.getYaş());
        capsul.setYaş(30);
        System.out.println(capsul);
        System.out.println(capsul.getYaş());


        C01Encapsulation obj = new C01Encapsulation();
        obj.setIsim("Ayşe");
        System.out.println(obj.getIsim());
        obj.setSoyIsim("Yilmaz");
        System.out.println(obj.getSoyIsim());
        obj.setYaş(40);
        System.out.println(obj.getYaş());
        obj.setYaş(75);
        System.out.println(obj.getYaş());
        System.out.println(obj);






    }


    public C02Encapsulation() {

    }
}
