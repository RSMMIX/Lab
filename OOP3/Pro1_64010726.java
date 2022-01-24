public class Pro1_64010726 {

    static boolean isPrime(int n){
        if(n < 2) return false;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    } 

    static boolean isPalindrome(int n){
        return (n == reverse(n));
    }

    static int reverse(int n){
      int number = 0;
      while(n > 0){
          number *= 10;
          number += n % 10;
          n /= 10;
      }
      return number;
    } 

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; count < 100; i++) {
            if(isPalindrome(i) && isPrime(i)){
                count++;
                System.out.print(i);
                if (count % 10 == 0) {
                    System.out.println();
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        
    }
}
