package project_alpha;

public class TowerOfHanoi {
    public static void Tower(int n, int src, int helper, int dest){
        if(n==1){
            System.out.println("transfer " + n + " from " + src + " to " + dest);
        }
        else {
            Tower(n-1, src, dest, helper);
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            Tower(n-1, helper, src, dest);
        }
    }

    public static void main(String args[]){
        int n = 3;
        int sourceTower = 100;
        int auxiliaryTower = 200;
        int destinationTower = 300;

        Tower(n, sourceTower, auxiliaryTower, destinationTower);
    }
}
