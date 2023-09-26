package practice3;

import java.util.Scanner;

public class Chatgpt {

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 5 elemanlı bir array oluşturulması ve elemanların kullanıcıdan alınması
            int[] array = new int[5];
            for (int i = 0; i < array.length; i++) {
                System.out.print((i+1) + ". elemanı giriniz: ");
                array[i] = scanner.nextInt();
            }

            // Arrayin yazdırılması
            System.out.print("Array: ");
            for (int eleman : array) {
                System.out.print(eleman + " ");
            }
            System.out.println();

            // Arrayin elemanlarının ortalamasının hesaplanması
            int toplam = 0;
            for (int eleman : array) {
                toplam += eleman;
            }
            double ortalama = (double) toplam / array.length;
            System.out.println("Ortalama: " + ortalama);

            // Ortalamadan büyük olan elemanların yazdırılması
            System.out.println("Ortalamadan büyük elemanlar:");
            for (int eleman : array) {
                if (eleman > ortalama) {
                    System.out.println(eleman);
                }
            }

            // Arrayin elemanlarının işaretlerinin değiştirilmesi
            for (int i = 0; i < array.length; i++) {
                array[i] = -array[i];
            }

            // Değiştirilmiş arrayin yazdırılması
            System.out.print("İşaretleri değiştirilmiş array: ");
            for (int eleman : array) {
                System.out.print(eleman + " ");
            }
        }
    }
}
