public class Power {

    public static int calcPower(int n, int p) {
        if (p == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        int power = n * calcPower(n, p - 1); // n^p = n * n^(p-1) 
        return power;
    }

    public static void main(String[] args) {
        int n = 4;
        int p = 3;
        System.out.println(calcPower(n, p));
    }
}
