package ua.epam;

/**
 * Created by Nataliia_Shevtsova on 9/7/2016.
 */
public class InvertArray {

    public static void invert(int[] arr) {

        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - 1 - k];
            arr[arr.length - 1 - k] = tmp;
        }

    }

    public static void invertArray(int[] arr){
        for(int k = arr.length/2;k>0;k--){
            int tmp =arr[k];
            arr[k]= arr[arr.length-k];
            arr[arr.length-k] =tmp;
            System.out.println(Arrays.toString(arr));
        }
    }

}
