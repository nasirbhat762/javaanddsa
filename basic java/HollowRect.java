public class HollowRect {
    public static void main(String args []){
          int n = 5;
          int m = 10; 
        for(int i =1 ; i<=n ; i++){
            for(int j = 1 ; j<= m ; j++){
                if(i == 1 || i == n ||  j ==1 || j ==m ){
                   System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
