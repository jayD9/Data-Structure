package SortingAlgo;

import java.util.Arrays;

/*
 * Every element is compared with neighbor element and swapped if they are not in order
 *
 * This result in smallest element bubble up at the beginning of the list
 *
 * */
public class BubbleSort2 {

    public static void main(String arg[]){
        int[] data = {4,5,6,2,1,7,10,3,8,9};
        System.out.println(Arrays.toString(data));
        for(int i = 0; i < data.length; i++){
            boolean swapped = false;
            for(int j = data.length-1; j > i;j--){
                if(data[j]<data[j-1]){
                    swapped = true;
                    swap(data,j,j-1);
                }
            }
            System.out.println("i = "+i);
            if(!swapped)
                break;
        }

        System.out.println(Arrays.toString(data));



        // start comparison from starting of the list ?????????????????

    }


    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

/*
 * Complexity = O(N2)
 * Space = O(1) --> In place
 * Stable = Yes --> order of same number is maintained
 * comparison = O(N2)
 * swaps = O(N2)
 * adaptive = Yes (we can break out of the loop by identifying rest of the list is stable)
 * */