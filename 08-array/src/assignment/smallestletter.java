package assignment;
//Q.find smallest leeter greater than target.
public class smallestletter {
     static void main(String[] args) {
        char[]letters={'c','f','g','h','k','l'};
        char target='i';
        System.out.println(nextgreaterletter(letters,target));

    }
    static char nextgreaterletter(char[] letters,char target){
        int start=0;
        int end=letters.length-1;
        while(start<=end){
        int mid=start+(end-start)/2;


            if(target<letters[mid]){
                end=mid-1;
            } else {
                start = mid + 1;

            }
        }
        return letters[start%letters.length];

    }
}
