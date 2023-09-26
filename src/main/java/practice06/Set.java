package practice06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {

        // Verilen bir array'den tekrar eden elemanları silip
        // unique elemanlardan olusan bir array haline donusturen method olusturun
        // int arr[]={1,2,2,3,4,4,5};

        // Setler tekrarlı eleman barındırmaz


        int arr[] = {1, 2, 2, 3, 4, 4, 5, 2, 0, 6, 4};

        arr = benzersiz(arr);
        System.out.println("son hali");
        System.out.println(Arrays.toString(arr));


    }

    private static int[] benzersiz(int[] arr) {

        HashSet<Integer> tekrarsiz = new HashSet<>();// Arrydeki elemanları yazdıracağımız yer

        for (int w : arr) {
            tekrarsiz.add(w);

        }

        System.out.println(tekrarsiz);// [0, 1, 2, 3, 4, 5, 6]


        int[] arr2 = new int[tekrarsiz.size()];


        int idx = 0;
        for (Integer w : tekrarsiz) {
            arr2[idx] = w;

            idx++;

        }


        System.out.println(Arrays.toString(arr2));

        return arr2;
    }
    }



