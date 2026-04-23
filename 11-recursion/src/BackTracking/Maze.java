package BackTracking;

import java.util.ArrayList;

public class Maze {
    static void main(String[] args) {
        //System.out.println(count(3,3));
        //path("",3,3);
        //System.out.println(pathReturn("",3,3));
        //System.out.println(countDia(3,3));
        //System.out.println(diagonalReturn("",3,3));

        boolean[][]board={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        //recursion call for pathRestriction
        pathRestriction("",board,0,0);
    }
    //count the path
    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
    //Print the path
    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            //recursive call
            path(p+'D',r-1,c);
        }
        if(c>1){
            //recursive call
            path(p+'R',r,c-1);
        }
    }
    //returning in the arrayList
    static ArrayList<String>pathReturn(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        if(r>1){
            ans.addAll(pathReturn(p+'D',r-1,c));
        }
        if(c>1){
            ans.addAll(pathReturn(p+'R',r,c-1));
        }
        return ans;
    }
    //Diagonal path
    //Q.count Diagonal path
    static int countDia(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=countDia(r-1,c);
        int diagonal=countDia(r-1,c-1);
        int right=countDia(r,c-1);
        return left+diagonal+right;
    }

    //Q.print the diagonal path
    static ArrayList<String>diagonalReturn(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        if( r>1 && c>1){ //this condition for diagonal form
            ans.addAll(diagonalReturn(p+'D',r-1,c-1));
        }
        if(r>1){//this for right form
            ans.addAll(diagonalReturn(p+'V',r-1,c));
        }
        if(c>1){//this for down form
            ans.addAll(diagonalReturn(p+'H',r,c-1));
        }
        return ans;
    }
    //Maze with obstacles
    static void pathRestriction(String p,boolean[][]maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathRestriction(p+'R',maze,r+1,c);
        }
        if(c<maze.length-1){
            pathRestriction(p+'D',maze,r,c+1);
        }
    }
}
