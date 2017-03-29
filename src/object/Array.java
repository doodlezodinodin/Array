package object;

/**
 * Created by alex on 29.03.2017.
 */
public class Array {
    public int[] bubbleSoft(){
        int[] arr = {4, 5, 7, 2, 3, 0, 8, 9, 1, 6};

        //body
        for(int i=arr.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    arr[j]=arr[j]^arr[j+1];   //a=a+b
                    arr[j+1]=arr[j]^arr[j+1]; //b=a-b
                    arr[j]=arr[j]^arr[j+1];   //a=a-b
                }
            }
        }
        return arr;
    }
}
