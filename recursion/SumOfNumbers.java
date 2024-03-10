public class SumOfNumbers {
    public static int sumNum(int n){
        if(n < 1){
            return 0;
        }
        int sum = n + sumNum(n-1);
        return sum;

    }
    public static void main(String[] args) {
        int n = 7;

       System.out.println( sumNum(n));
    }
}
