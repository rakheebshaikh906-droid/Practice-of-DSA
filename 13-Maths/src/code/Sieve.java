package code;

//Q.this are the kunal sir method to find the how many number are prime 0 to n.
public class Sieve {
    static void main(String[] args) {
        int n=40;
        System.out.println(seive(n));
    }
    static int seive(int n){
        if (n <= 2) return 0;
        boolean[] prime = new boolean[n+1];
        int count=0;
        for(int i=2;i*i<=n;i++){
            if(!prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!prime[i]){
                count++;
            }
        }
        return count;
    }
}
