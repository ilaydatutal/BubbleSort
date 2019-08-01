package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] arr = {1, 5, 7, 9,34, 44, 0};
	int i, j;

	for(i = 0; i < arr.length; i++)
        for(j = 0; j < arr.length-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
