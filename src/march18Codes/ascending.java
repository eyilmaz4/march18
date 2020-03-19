package march18Codes;

import java.util.Arrays;

public class ascending {
    public static void main(String[] args) {
        int [] arr={1,5,8,2,9,11};
        int temp=0;
        for(int i=0; i<arr.length/2; i++){
            for(int j=0; j<arr.length/2; j++){
            if(arr[i]<arr[i+1]){
                temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}}
