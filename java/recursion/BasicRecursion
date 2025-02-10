package recursion;

public class BasicRecursion {
    public static int sumOfNaturalNos(int n){
        if(n == 0) return 0;
        return n + sumOfNaturalNos(n-1);
    }

    public static int factorialOfNaturalNos(int n){
        if(n == 1) return 1;
        return n * factorialOfNaturalNos(n-1);
    }

    public static int[] reverseArray(int[] a, int start, int end){
        if(start > end) return a;

        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;

        return reverseArray(a,++start,--end);
    }

    public static boolean isPalindrome(String a, int start){
        if (start >= a.length()/2) return true;
        if (a.charAt(start) != a.charAt(a.length()-start-1)) return false;

        return isPalindrome(a,++start);
    }

    public static int fibonacciSeries(int n){
        if (n == 0 || n == 1) return n;
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
    }

    public static void main(String[] args) {
      // printing fibonacci sequence till 5
        for (int i = 0; i < 5; i++) {
            System.out.println(fibonacciSeries(i));
        }
    }
}
