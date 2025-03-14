package Quick_Sort;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {3,7,1,9,2,5,3,8,7,6};
        System.out.println("before");
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println();
        QuickSort(arr,0,arr.length-1);
        System.out.println("after");
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    static void QuickSort(int[] arr,int low, int high){
        if(low<high){
            int Partition_index = partition(arr,low,high);
            QuickSort(arr,low,Partition_index-1);
            QuickSort(arr,Partition_index+1,high);
        }
    }
    static int partition(int[] arr, int low, int high) {
        int pivot = low;
        int i = low;
        int j = high;
        int sort = 0;
        while (i < j){
            while (arr[i] <= arr[pivot] && i <= high - 1){
                i++;
            }
            while (arr[j] > arr[pivot] && j >= low + 1){
                j--;
            }
            if(i<j){
                sort++;
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
