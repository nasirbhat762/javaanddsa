public class Factorial {
    public static int fact(int num, int f) {
        
        if (num == 0) {
            return 1;
        }

        f = num * fact(num -1, f);

        return f;
    }

    public static void main(String[] args) {
        int num = 5;

       System.out.println( fact(num , 1));
    }
}
