package code.rakheeb;

//Q.searching in string using linea search
public class LinearSerachInstring {
    static void main(String[] args) {
        String name="rakheeb";
        char target='b';
        System.out.println(search(name,target));
    }
    //method for searching in a string
    static boolean search(String name,char target){
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
