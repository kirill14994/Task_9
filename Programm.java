import java.util.Arrays;
import java.util.Random;

public class Programm {
    public static void main(String[] args) {
        
        int[] arr = new int[20];

        Random rd = new Random();
        PyramidSorting sort = new PyramidSorting(arr);

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = rd.nextInt(1, 101);
        }

        System.out.println("Числа до сортировки:" + Arrays.toString(arr));
        System.out.println();
        sort.sorting();
        System.out.println("Числа после сортировки:"+ Arrays.toString(arr));


    }
}
