package ua.epam;

import java.util.Arrays;

/**
 * Created by Nataliia_Shevtsova on 9/7/2016.
 */
public class MainArray {
    public static void main(String[] args) {

        int[] massForInvert = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Before invertion " + Arrays.toString(massForInvert));

        InvertArr inv = new InvertArr();

        inv.invert(massForInvert);
        System.out.println("After invertion " + Arrays.toString(massForInvert));
    }


    }
