package patterns;

public class Patterns {

    public static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern9(int n){
        pattern7(n);
        pattern8(n);
    }

    public static void pattern10(int n){
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i <= n){
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= 2 * n - 1 - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        int start = 1;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                start = 0;
            } else {
                start = 1;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }

    public static void pattern12(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2 * (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern13(int n){
        int count=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                int p = 'A' + j;
                System.out.print((char) p);
            }
            System.out.println();
        }
    }

    public static void pattern15(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                int p = 'A' + j;
                System.out.print((char) p);
            }
            System.out.println();
        }
    }

    public static void pattern16(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int p = 'A' + i;
                System.out.print((char) p);
            }
            System.out.println();
        }
    }

    public static void pattern17(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i-1; j++) {
                System.out.print(" ");
            }
            int count = 1;
            for (int j = 1; j <= 2 * i + 1; j++) {
                int p = 'A' + (count-1);
                System.out.print((char) p);
                if (j <= i){
                   count++;
                } else {
                    count--;
                }
            }
            System.out.println();
        }
    }

    public static void pattern18(int n){
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i+1; j > 0; j--) {
                int p = 'E' + count-j;
                System.out.print((char) p);
            }
            System.out.println();
            count++;
        }
    }

    public static void pattern19(int n){
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern20(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern21(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1){
                    System.out.print("*");
                } else {
                    if (j == 0 || j == n-1){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern21(5);
    }
}
