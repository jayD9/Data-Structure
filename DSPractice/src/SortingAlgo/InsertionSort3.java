package SortingAlgo;

import java.util.Arrays;
/*
 *
 * Select one element and assume it as sorted then add new element to it's correct position
 * continue it till we get sorted list
 *
 * */
public class InsertionSort3 {
    public static void main(String arg[]){
        int[] data = {4,5,6,2,1,7,10,3,8,9};
        // Increasing order

        //iterating to get sorted till the i position
        System.out.println(Arrays.toString(data));
        for(int i = 0; i < data.length -1; i++){
            //iterating from j to 0 to find the correct position of an element
            for(int j = i+1; j > 0; j--){
                if(data[j] < data[j-1]){
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }else{
                    break;
                }
            }
            System.out.println(Arrays.toString(data));
        }


        //Decreasing order
    }
}
