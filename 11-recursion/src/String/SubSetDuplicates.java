package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SubSetDuplicates {
    static void main(String[] args) {
        int[]arr={1,2,2};
        System.out.println(subsetDuplicates(arr));
    }
    static List<List<Integer>>subsetDuplicates(int[]arr) {
        //sort the array
        Arrays.sort(arr);
        //create a new outer list
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i=0;i<arr.length;i++){
            start = 0;
            //if current and previous element will same the s=e+1
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> Internal = new ArrayList<>(outer.get(j));
                Internal.add(arr[i]);
                outer.add(Internal);
            }
        }
        return outer;
    }
}