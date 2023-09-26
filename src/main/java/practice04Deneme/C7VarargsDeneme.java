package practice04Deneme;

public class C7VarargsDeneme {

    public static void main(String[] args) {

    /*
        Bir okuldaki ogrencilerden ders secmesi isteniyor.
        Alınann ders saati sayısının 12'yi gecmemesi isteniyor.
        Buna gore;
        Asagida ders saatleri verilen derslerden istediginiz kadar secin.
        Sectiginiz bu derslerin saatleri toplamı 12'yi gecerse "Limiti astiniz";
        12'yi gecmezse "Islem basariyla tamamlandi" mesajini veren bir method olusturunuz
        Matematik :4 saat
        Geometri : 2 saat
        Fizik : 3 saat
        Kimya : 3 saat
        Biyoloji : 3 saat
        Edebiyat : 2 saat
        Tarih : 2 saat
        Cografya : 2 saat

         */


        int mat = 4;
        int geo = 2;
        int fiz = 3;
        int kim = 3;
        int bio = 3;
        int edeb = 2;
        int tarih = 2;
        int cogr = 2;

        OgrenciDersSecimi(mat, geo, fiz, kim);

        //OgrenciDersSecimi(mat, geo, fiz, kim, bio, edeb, tarih, cogr);


    }

    private static void OgrenciDersSecimi(int...desrler) {

        int sum =0;

        for ( int w : desrler) {
            sum = sum +w;

        }
        if (sum>12){
            System.out.println("Ders seçimi limitinizi aştınız");


        }else System.out.println("Ders kaydınız başarı ile tamamlanmıştır");





    }


}
