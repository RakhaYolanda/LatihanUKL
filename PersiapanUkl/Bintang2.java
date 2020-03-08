package PersiapanUkl;

public class Bintang2 {

    public static void main(String[] args) {
        
        int u = 2;
        for (int k = 1; k < 8; k++) {
            for (int d = 1; d <= k; d++) {
                System.out.print(u + "  ");
                u += 2;
            }
            System.out.println();
        }
    }
}
