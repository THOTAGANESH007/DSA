import java.util.*;
class Sorting{
    private static void printArray(int []a){
        for (int ele:a)
            System.out.print(ele+" ");
    }
    private static void swap(int []a,int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    private static void selectionSort(int[] arr){
        //selects the minimums and swaps
        for(int i=0; i<arr.length-1; i++){
            int mini=i;
            for(int j=i;j<arr.length; j++){
                if(arr[j]<arr[mini])
                    swap(arr,j,mini);
            }
        }
        printArray(arr);
    }

    private static void bubbleSort(int[]arr){
        //push the max to the last by adjacent swaps
        for (int i = 0; i <arr.length-1; i++) {
            boolean flag=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                    flag=true;
                }
            }
            if(!flag) break;
        }
        printArray(arr);
    }

    private static void insertionSort(int arr[]){
        //takes an element and places in the correct position
        for (int i = 1; i < arr.length; i++) { // one element is always sorted
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr,j,j-1);
                j--;
            }
        }
        printArray(arr);
    }

    private static void mergeSort(int []arr,int start,int end){
        //divide and conquer
        if(start>=end)return;
        int mid = start+(end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start,mid, end);
    }
    private static void merge(int[]arr,int start,int mid,int end){
        int i=start;
        int j=mid+1;
        int k=0;
        int a[] = new int[end - start + 1];
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j])
                a[k++]=arr[i++];
            else
                a[k++]=arr[j++];
        }

        while(i<=mid)
            a[k++]=arr[i++];
        while(j<=end)
            a[k++]=arr[j++];
        for (int h = 0; h < a.length; h++) { //copying for every method call
            arr[start + h] = a[h];
        }
    }

    private static int partition(int []arr,int start,int end){
        int pivot = arr[start];
        int i=start;
        int j=end;
        while(i<j){
            while(arr[i]<=pivot && i<end)
                i++;
            while(arr[j]>pivot && j>start)
                j--;
            if(i<j)
                swap(arr, i, j);
        }
        swap(arr, start, j);
        return j;
    }
    private static void quickSort(int[]arr,int start,int end){
        //pick a pivot and place it in its correct place in the sorted array
        //smaller on the left and larger on the right
        if(start>=end)
            return;
        int partition = partition(arr, start, end);
        quickSort(arr, start, partition-1);
        quickSort(arr, partition+1, end);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elemnts of the array:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        //1)
        //selectionSort(arr);

        //2)
        //bubbleSort(arr);

        //3)
        //insertionSort(arr);

        //4)
        // mergeSort(arr, 0, arr.length-1);
        // printArray(arr);

        //5)
        // quickSort(arr,0,arr.length-1);
        // printArray(arr);
    }
}