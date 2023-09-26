package practice04Deneme;

import java.util.ArrayList;
import java.util.Arrays;

public class C2ArrayListDeneme {

    public static void main(String[] args) {

        // Verilen bir array'den tekrar eden elemanları silip
        // tekrarsız elemanlardan olusan bir array haline donusturun
        //  int arr[]={1,2,2,3,4,4,5};


        int arr [] = {1,2,2,3,4,4,5};

        ArrayList<Integer> number =new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!number.contains(arr[i])){

                number.add(arr[i]);

            }

        }
        System.out.println(number);

        int[] brr = new  int [number.size()];

        for (int i = 0; i <number.size() ; i++) {

            brr[i]= number.get(i);

        }
        System.out.println(Arrays.toString(brr));



        arr=brr;//Arr arrayini brr arryine atadık

        System.out.println("arr:" + Arrays.toString(arr));




























    }

}
