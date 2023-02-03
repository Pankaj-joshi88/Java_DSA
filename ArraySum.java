import java.util.Arrays;

public class ArraySum {
static void approach_1(int arr[], int k){

Arrays.sort(arr); 
int i = 0;
int j = arr.length - 1;
while(i < j){
    if(arr[i] + arr[j] == k ){
        System.out.println("Pair Found " + arr[i] +"," + arr[j] );
        return;
    }
    else if(arr[i]+ arr[j] < k){
        i++;

    
}

else if (arr[i] + arr[j] > k){
    j--;
}
}
}
 
    public static void main(String[] args) {
       // int arr[] ={2,5,6,7,9}; 
int k = 16;
 //approach_1(arr,k);   
}
}

