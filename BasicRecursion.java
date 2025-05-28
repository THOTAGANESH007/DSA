import java.util.Scanner;

public class BasicRecursion {

    private static int nthFabinacciNumber(int n){
        if(n<=1)
            return n;
        return nthFabinacciNumber(n-1)+nthFabinacciNumber(n-2);
    }

    private static void printName(int n){
        if(n<=0)
            return;
        System.out.println("Tiger");
        printName(n-1);
    }

    private static void print1ToN1(int i,int n){
        if(n<=0)
            return;
        System.out.print(i+" ");
        print1ToN1(i+1, n-1);
    }

    private static void print1ToN2(int i,int n){
        if(n<=0)
            return;
        print1ToN2(i-1, n-1);
        System.out.print(i+" ");
    }

    private static void print1ToNinReverse1(int i,int n){
        if(n<=0)
            return;
        print1ToNinReverse1(i+1,n-1);
        System.out.print(i+" ");
    }

    private static void print1ToNinReverse2(int i,int n){
        if(n<=0)
            return;
        System.out.print(i+" ");
        print1ToNinReverse2(i-1,n-1);
    }

    private static int sumOfNnumbers1(int i,int n){
        if(n<=0)
            return i;
        return sumOfNnumbers1(i+n, n-1);
    }

    private static int sumOfNnumbers2(int n){
        if(n<=0)
            return n;
        return n+sumOfNnumbers2(n-1);
    }

    private static int factorial(int n){
        if(n<=1)
            return 1;
        return n*factorial(n-1);
    }

    private static void swap(int []a,int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    private static int[] reverseArray(int startIndex,int size,int[]a){
        if(startIndex>=size/2)
            return a;
        swap(a,startIndex,size-startIndex-1);
        return reverseArray(startIndex+1, size, a);
    }

    private static boolean isPalindrome(int startIndex,String s){
        int n=s.length();
        if(startIndex>=n/2)
            return true;
        if(s.charAt(startIndex) != s.charAt(n-startIndex-1))
            return false;
        return isPalindrome(startIndex+1, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        
        //1)
        //System.out.println(n+"th fabinacci number is:"+nthFabinacciNumber(n));

        //2)
        // printName(n);

        //3)
        // print1ToN1(1,n); //->1
        // print1ToN2(n,n); //->2

        //4)
        // print1ToNinReverse1(1,n); //->1
        // print1ToNinReverse2(n,n); //->2

        //5)
        // System.out.println("The sum of "+n+" numbers is: "+sumOfNnumbers1(0,n)); //->1
        // System.out.println("The sum of "+n+" numbers is: "+sumOfNnumbers2(n)); //->2

        //6)
        // System.out.println("The factorial of "+n+" is:"+factorial(n));

        //7)
        // int arr[] = new int[n];
        // System.out.println("Enter the elements of the array:");
        // for(int i=0; i<arr.length; i++){
        //     arr[i]= sc.nextInt();
        // }
        // int revArr[]=reverseArray(0,n,arr);

        //Printing the reversed Array
        // for(int num:revArr)
        //     System.out.print(num+" ");

        //8)
        // String str = sc.nextLine();
        // boolean isPalindrome = isPalindrome(0, str.toLowerCase());
        // if(!isPalindrome)
        //     System.out.println(str+" is not palindrome");
        // else
        //     System.out.println(str+" is a palindrome");
        sc.close();
    }
}
