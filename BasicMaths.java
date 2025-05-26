
import java.util.Scanner;

class BasicMaths{
    private static int countDigits(int num){
        int count = 0;
        while(num>0){
            int lastDigit = num % 10;
            num = num / 10;
            count++;
        }
        return count;
    }

    private static int reverseNumber(int num){
        int reversed = 0;
        while(num > 0){
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num = num / 10;
        }
        return reversed;
    }

    private static void isArmStrongNumber(int num){
        int arm=0;
        int temp = num;
        while (num>0) {
            int digit = num%10;
            num /= 10;
            arm += digit*digit*digit;
        }
        if(temp==arm)
            System.out.println(temp+" is an armstrong number");
        else
            System.out.println(temp+" is not an armstrong number");
    }

    private static void divisors(int num){
        for(int i=1; i*i<=num; i++){
            if(num%i==0){
                System.out.print(i+" ");
                if((num/i) != i)
                    System.out.print(num/i +" ");
            }
        }
    }

    private static void isPrime(int num){
        int count = 0;
        for(int i=1; i*i<=num; i++){
            if(num%i==0){
                count++;
                if((num/i) != i)
                    count++;
            }
        }
        if(count==2)
            System.out.println(num+" is a prime number");
        else
            System.out.println(num+" is not a prime number");
    }

    private static void findGCD(int a, int b){
        int originalA=a;
        int originalB = b;
        while(a>0 && b>0){
            if(a>b)
                a = a%b;
            else
                b = b%a; 
        }
        if(a==0)
            System.out.println("The GCD of "+originalA+"and "+originalB+"is: "+b);
        else
            System.out.println("The GCD of "+originalA+"and "+originalB+"is: "+a);
    }

    private static int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            int lastDigit = num % 10;
            num = num / 10;
            sum += lastDigit;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // 1)
        // int digitCount = countDigits(num);
        // System.out.println("The number of digits in " + num + " is: " + digitCount);
        // System.out.println(Math.floor(Math.log10(num)) + 1);

        // 2)
        // int reversedNum = reverseNumber(num);
        // System.out.println("The reverse of " + num + " is: " + reversedNum);

        // 3)
        // isArmStrongNumber(num);
        
        //4)
        // System.out.println("The divisors of "+num+" are:");
        // divisors(num);
        
        //5)
        // isPrime(num);

        //6)
        //findGCD(num,num);

        //7)
        // System.out.println("The sum of digits of "+num+" are: "+sumOfDigits(num));

    }
}