package SortingAlgo;

import java.util.Arrays;

/*
*
* Select one element and compare it with every other element so that
* after the first iteration on 1st position we will get smallest element
*
* */
public class SelectionSort1 {
    public static void main(String arg[]){
        int[] data = {4,5,6,2,1,7,10,3,8,9};
        System.out.println(Arrays.toString(data));
        //iterating to get sorted array at i position
        for(int i = 0; i < data.length; i++){
            //iterating for comparison with all element at j
            for(int j = i+1; j < data.length; j++){
                if(data[j] < data[i]){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
            System.out.println(Arrays.toString(data));
        }
    }
}
