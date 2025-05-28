import java.util.*;
class BasicHashing{
    private static void findCount(int a[]){
        HashMap<Integer,Integer> map= new HashMap<>();
        //creating a HashMap
        for(int ele:a){
            if(!map.containsKey(ele)){
                map.put(ele,1);
            }else{
                map.put(ele,map.get(ele)+1);
            }
        }

        for(int key:map.keySet()){
            System.out.println(key+" occurs "+map.get(key)+" times in the array");
        }
    }

    private static void findMostFrequentElement(int []a){
        HashMap<Integer,Integer> map= new HashMap<>();
        //creating a HashMap
        for(int ele:a){
            if(!map.containsKey(ele)){
                map.put(ele,1);
            }else{
                map.put(ele,map.get(ele)+1);
            }
        }

        int maxFreq = Integer.MIN_VALUE;
        int element = 0;
        for(int key:map.keySet()){
            int elementFreq = map.get(key);
            if(elementFreq>maxFreq || (elementFreq==maxFreq && key<element)){ //returns the smallest element
                maxFreq = elementFreq;
                element = key;
            }
        }
        System.out.println("Most Frequent Element in the array is:"+element);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        //Enter the elements
        System.out.println("Enter the Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();        
        }
        //1)Frequency
        //findCount(arr);
        
        //2)Highest Frequency
        //findMostFrequentElement(arr);
        sc.close();
    }
}