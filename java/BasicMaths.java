public class BasicMaths {
    public static void main(String[] args) {
        System.out.println(reverseNumber(123));
        System.out.println(reverseNumber(456));
    }

    public static int countDigits(int n){
//        int count = 0;
//        while(n > 0){
//            n = n/10;
//            count++;
//        }
        return String.valueOf(n).length();
    }

    public static int reverseNumber(int n){
        int res = 0;
        while(n > 0){
            res = (res * 10) + n % 10;
            n = n/10;
        }
        return res;
    }

    public static boolean checkPalindrome(int n){
        return n == reverseNumber(n);
    }

    public static boolean checkAmrstrongNumber(int n){
        int res = 0;
        int k = countDigits(n);
        while(n > 0){
            res += Math.pow(n % 10,k);
            n = n/10;
        }
        return res == n;
    }

    public static void printAllDivisors(int n){
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (n/i != i){
                    System.out.println(n/i);
                }
            }
        }
    }

    public static boolean checkPrime(int n){
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int hcf(int n1, int n2){
        //Euclidean algorithm
        if (n1 == 0) return n2;
        if (n2 == 0) return n1;
        if (n1 == n2) return n1;

        if (n1 > n2){
            return hcf(n1-n2,n2);
        }
        return hcf(n1,n2-n1);
    }
}
