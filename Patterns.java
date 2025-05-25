public class Patterns{
    private static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    private static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    private static void pattern5(int n){
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    private static void pattern7(int n){
        for (int i = 1; i <=n; i++) {
            for(int j=1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void pattern8(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int k=1;k<= (2*(n-i)+1); k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void pattern9(int n){
        //Upper half of the diamond
        for (int i = 1; i <=n; i++) {
            for(int j=1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //Lower half of the diamond
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1;k<= (2*(n-i)-1); k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void pattern10(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=1; i<n;i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void pattern11(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println("");
        }
    }

    private static void pattern12(int n){
        for (int i = 1; i <= n; i++) {
            //Left Side
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //Spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //Right Side
            for (int j = 1; j <=i ; j++) {
                System.out.print(i-j+1);
            }
            System.out.println();
        }
    }

    private static void pattern13(int n){
        int k=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(k++ +" ");
            }
            System.out.println("");
        }
    }

    private static void pattern14(int n){
        for (int i = 1; i <= n; i++) {
            int k=65;
            for (int j = 1; j <=i; j++) {
                System.out.print((char)k++ +" ");
            }
            System.out.println("");
        }
    }

    private static void pattern15(int n){
        for(int i=1; i<=n; i++){
            int k=65;
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print((char)k++ +" ");
            }
            System.out.println();
        }
    }

    private static void pattern16(int n){
        int k=65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)k+" ");
            }
            k++;
            System.out.println();
        }
    }

    private static void pattern17(int n){
        
    }

    private static void pattern18(int n){
        for (int i = 0; i < n; i++) {
            int k=65;
            for (int j = 0; j <=i; j++) {
                System.out.print((char)(k+n-i+j-1));
            }
            System.out.println("");
        }
    }

    private static void pattern19(int n){
        
    }

    private static void pattern20(int n){
        
    }
    private static void pattern21(int n){
        
    }
    private static void pattern22(int n){
        
    }
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        //pattern4(5);
        //pattern5(5);
        //pattern6(5);
        //pattern7(5);
        //pattern8(5);
        //pattern9(5);
        //pattern10(5);
        //pattern11(5);
        //pattern12(5);
        //pattern13(5);
        //pattern14(5);
        //pattern15(5);
        //pattern16(5);
        //pattern17(5);
        //pattern18(5);
        //pattern19(5);
        //pattern20(5);
        //pattern21(5);
        //pattern22(5);
    }
}