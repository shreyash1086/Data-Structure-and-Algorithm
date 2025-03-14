package TUF;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,4,45,45,7,12,9,7,5};
//        int secondLargest = brute(arr);
//        int secondLargest = Better(arr);
        int secondLargest = Optimal(arr);
        System.out.println(secondLargest);
    }
//---------brute---------//
    //Brute force Using the sorting method and returning the element before the n-1 th element and greater thant any other elements
    //Complexity is For sorting O(nlogn) and for Loop O(n)
    //complexity = O(n(1+logn))

    static int brute(int[] arr){
        int low = 0;
        int high = arr.length-1;
        QuickSort(arr,low,high);
        int secondLargest = -1;
        for (int i = arr.length-2; i >= 0; i--) {
            if(arr[i] != arr[arr.length-1]){
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }
    static void QuickSort(int[] arr, int low, int high){
        if(low < high){
            int partitionIndex = partition(arr,low,high);
            QuickSort(arr,low,partitionIndex-1);
            QuickSort(arr,partitionIndex+1,high);
        }
    }
    static int partition(int[] arr, int low, int high){
        int pivot = low;
        int i = low;
        int j = high;

        while (i < j){
            while (arr[i] <= arr[pivot] && i <= high-1){
                i++;
            }
            while (arr[j] > arr[pivot] && j >= low+1){
                j--;
            }
            if(i < j){
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
//---------brute---------//

//---------Better---------//

    static int Better(int[] arr){
        int largest = arr[0];
        for (int i=0; i< arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if(secondLargest < arr[i] && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

//---------Better---------//

//---------Optimal---------//x`

    static int Optimal(int[] arr){
        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i]<largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

//---------Optimal---------//

}
