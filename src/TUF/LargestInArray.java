package TUF;

public class LargestInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,4,12,7,9,24,7,5};
        int largest = Brute(arr);
//        int largest = optimal(arr);
        System.out.println(largest);
    }

    //Optimal solution - complexity O(n)

    static int optimal(int[] arr){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++ ){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    //Brute Force Method - Complexity O(nlogn)

    static int Brute(int[] arr){
        //In brute force we are going to use the sorting method
        int low = 0;
        int high = arr.length - 1;
        QuickSort(arr,low,high);
        return arr[high];
    }
    static void QuickSort(int[] arr,int low,int high){
        if(low < high){
            int partitionIndex = partition(arr,low,high);
            QuickSort(arr,low,partitionIndex-1);
            QuickSort(arr,partitionIndex+1,high);
        }
    }
    static int partition(int[] arr,int low, int high){
        int pivot = low;
        int i = low;
        int j = high;
        while (i < j){
            while (arr[i] <= arr[pivot] && i <= high-1){
                i++;
            }
            while (arr[j] > arr[pivot] && j >= low-1){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,pivot,j);
        return j;
    }
    static void swap(int[] arr,int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
