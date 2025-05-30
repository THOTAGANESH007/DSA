import java.util.Scanner;

class ArrayEasy{
    private static void printArray(int []a){
        for (int ele:a)
            System.out.print(ele+" ");
    }
    private static void swap(int []a,int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    private static void findLargest(int []a){
        int largest = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>largest)
                largest=a[i];
        }
        System.out.println("Largest element in the array is:"+largest);
    }

    private static void findSecondLargest(int[]a){
        int largest = a[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < a.length; i++) {
            if(a[i]>largest){
                secondLargest = largest;
                largest=a[i];
            }else if(a[i]<largest && a[i]>secondLargest)
                secondLargest = a[i];
        }
        System.out.println("Second Largest element in the array is:"+secondLargest);
    }

    private static void findSecondSmallest(int[]a){
        int smallest = a[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < a.length; i++) {
            if(a[i]<smallest){
                secondSmallest = smallest;
                smallest=a[i];
            }else if(a[i]>smallest && a[i]<secondSmallest)
                secondSmallest = a[i];
        }
        System.out.println("Smallest and Second Smallest elements in the array are:"+smallest+" , "+secondSmallest);
    }

    private static boolean isSortedArray(int a[]){
        for (int i = 1; i < a.length; i++) {
            if(a[i-1]>a[i])
                return false;
        }
        return true;

        /*int n = nums.length;
        int count = 0;
        
        // Check if the array is non-decreasing
        for (int i = 1; i < n; i++)
            if (nums[i - 1] > nums[i])
                count++;
        
        // Check the circular comparison between the last and first elements 
        if (nums[n - 1] > nums[0])
            count++;
        
        // If the count of violations is less than or equal to 1, return true
        return count <= 1;
         */
    }

    private static void removeDuplicatesInPlaceSortedArray(int a[]){
        int j=0;
        for (int i = 1; i < a.length; i++) {
            if(a[i]!=a[j])
                a[++j]=a[i];
        }
        System.out.println(j+1);
        //printArray(a);
    }

    private static void rotateArrayByOnePlace(int[]a){
        int first = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i-1] = a[i];
        }
        a[a.length-1]=first;
        printArray(a);
    }

    private static void reverse(int a[], int start, int end){
        while(start<=end){
            int temp = a[start];
            a[start++]=a[end];
            a[end--]=temp;
        }
    }
    private static void rotateArrayBykPlaces(int []a,int k){
        k=k%a.length;
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        reverse(a,0,a.length-1);
        printArray(a);
    }

    private static void rotateArrayBykPlacesRight(int[]a, int k){
        k=k%a.length;
        k=a.length-k;
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        reverse(a,0,a.length-1);
        printArray(a);
    }

    private static void moveZeroesToEnd(int []a){
        int j=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0){
                swap(a,i,j);
                j++;
            }
        }
        printArray(a);
    }

    private static void unionOfTwoSortedArrays(int a1[], int a2[]){
        int union[] = new int[a1.length+a2.length];
        int i=0;int j=0;int k=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<=a2[j]){
                if(k==0 || union[k-1]!=a1[i])
                    union[k++]=a1[i];
                i++;
            }else{
                if(k==0 || union[k-1]!=a2[j])
                    union[k++]=a2[j];
                j++;
            }
        }

        while(i<a1.length){
            if(k==0 || union[k-1]!=a1[i])
                    union[k++]=a1[i];
            i++;
        }
        while(j<a2.length){
            if(k==0 || union[k-1]!=a2[j])
                    union[k++]=a2[j];
            j++;
        }
        printArray(union);
    }
    
    private static void intersectionOfTwoSortedArrays(int a1[], int a2[]){
        int i=0;int j=0;int k=0;
        int[]interSection = new int[Math.min(a1.length,a2.length)];
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j])
                i++;
            else if(a2[j]<a1[i])
                j++;
            else{
                interSection[k++]=a1[i];
                i++;
                j++;
            }
        }
        printArray(interSection);
    }

    private static void findMissingNumber(int[] nums) {
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor ^= (i+1)^nums[i];
        }
        System.out.println("The missing number in the array is:"+xor);
    }

    public static void findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                maxCount = Math.max(count,maxCount);
            }else
                count=0;
        }
        System.out.println("Maximum consecutive ones are:"+maxCount);
    }

    public static void findSingleNumber(int[] nums) {
        int single = 0;
        for(int i=0; i<nums.length; i++){
            single ^= nums[i];
        }
        System.out.println("The single element in the array is:"+single);
    }

    private static void longestSubArraySumK(int[]a,int k){
        int maxLen=0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i+1; j < a.length; j++) {
                sum += a[j];
                if(sum == k){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        System.out.println("Max Length of the subarray with sum "+k+" is:"+maxLen);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        //1)
        // findLargest(arr);

        //2)
        // findSecondLargest(arr);

        //3)
        // findSecondSmallest(arr);

        //4)
        // String msg=isSortedArray(arr) ? "Array is Sorted" : "Array isNot sorted";
        // System.out.println(msg);

        //5) Note: Elements must be in a sorted order
        // removeDuplicatesInPlaceSortedArray(arr);

        //6) Rotate array by one place ->left
        // rotateArrayByOnePlace(arr);

        //7) Rotate array by k places ->left
        // System.out.println("Enter number of places to shift:");
        // int k = sc.nextInt();
        // rotateArrayBykPlaces(arr,k);

        //8) Rotate array by k places ->right
        // System.out.println("Enter number of places to shift:");
        // int k = sc.nextInt();
        // rotateArrayBykPlacesRight(arr, k);

        //9) Move zeroes to end
        // moveZeroesToEnd(arr);

        //10) Union of two sorted arrays
        // int arr2[] = new int[n];
        // System.out.println("Enter the elements of second array:");
        // for (int i = 0; i < arr2.length; i++) {
        //     arr2[i] = sc.nextInt();
        // }
        // unionOfTwoSortedArrays(arr,arr2);

        //11) Intersection of two sorted arrays
        // intersectionOfTwoSortedArrays(arr,arr2);

        //12) Find the missing number
        // findMissingNumber(arr);

        //13) Maximum consecutive ones
        // findMaxConsecutiveOnes(arr);

        //14)Find the number that appears once, and remaining appears twice
        // findSingleNumber(arr);

        //15) Longest subarray with given sum K
        System.out.println("Enter the max sum:");
        int maxSum = sc.nextInt();
        longestSubArraySumK(arr,maxSum);
        sc.close();
    }
}