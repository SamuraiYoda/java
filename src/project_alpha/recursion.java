package project_alpha;

public class recursion {
    public static int recur(int n ){

        if(n== 1 || n == 0){
            return 1;
        }
        int factorial = n*(recur(n-1));
        return factorial;
    }
    public static int power(int x ,int n){
        if(n ==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int xPownm1 = power(x , n-1);
        int xPown = x* xPownm1;
        return xPown;
    }
    public static int calcPower(int x,int n){
        if (n ==0){
            return 1;
        }
        if (x ==1){
            return 0;
        }
        if(n % 2 ==0){
            return calcPower(x, n/2) * calcPower(x, n/2);
        }else{
            return calcPower(x, n/2) * calcPower(x, n/2) *x;
        }

    }


    public static void fibonacci(int a, int b, int n ){
        if(n ==0){
            return;
        }
        int c = a +b;
        System.out.println(c);
        fibonacci(b , c, n-1);
    }

    public static void towerOfHanoi(int n ,int src, int helper, int dest){
        if(n==1 ){
            System.out.println("transfer disk" + n + "from " + src +"to " +dest);
            return ;
        }
        towerOfHanoi(n-1, src, dest ,helper );
        System.out.println("transfer disk" + n + "from " + src +"to " +dest);
        towerOfHanoi( n-1 , helper, src, dest);

    }

    public static void main(String args []) {
        System.out.println(recur(5));
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        fibonacci(a, b, n - 2);
        System.out.println(power(5, 3));
        System.out.println(calcPower(5, 3));
    }
}

