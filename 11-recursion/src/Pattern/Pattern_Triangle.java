package Pattern;

public class Pattern_Triangle {
    static void main(String[] args) {
        pattern(4,0);
        pattern2(4,0);
    }

    //last to first
    static void pattern(int r,int c){
        //base case
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            pattern(r,c+1);
        }else{
            //print the next line
            System.out.println();
            pattern(r-1,0);
        }
    }

    //first to last
    static void pattern2(int r,int c){
        //base case
        if(r==0){
            return;
        }
        if(c<r){
            pattern2(r,c+1);
            System.out.print("*");
        }else {
            pattern2(r - 1, 0);
            System.out.println();
        }
    }
}