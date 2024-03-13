import java.util.ArrayList;
import java.util.Collections;

class LeaderofArray{
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        int max = arr[n-1];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n-1; i>=0; i--){
            if(arr[i]>= max){
                
                max = arr[i];
                list.add(arr[i]);
            }
        }
        // System.arraycopy(neg,0,neg.length,a,0);
        
        Collections.reverse(list);
        
        return list;
    }
}