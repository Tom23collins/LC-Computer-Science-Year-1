public class EuclidsAlgorithm {
    
    public static void main(String args[]) {
        int r1 = 221;
        int r2 = 195;
        System.out.println("r1 is: " + r1);
        System.out.println("r2 is: " + r2);
        int count = 3;

        while (r2 != 0) {
            int k = modNumbers(r1, r2);
            System.out.println("r" + count + " is: " + k);
            count++;
            r1 = r2;
            r2 = k;
        }

        System.out.println("The greatest common divisor is: " + r1);
    }

    public static int modNumbers(int r1, int r2) {
        return r1 % r2;
    }
    
}