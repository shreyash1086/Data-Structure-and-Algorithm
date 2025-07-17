package TUF.PracticeArrays;

public class Findthemissingnumberinanarray {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int N = 5;
        System.out.println(kaam(arr));
    }

    //Time complexity is O(n) and space complexity is O(1)
    //Will not give the answer if the missing element is (N-1)th element
    static int Approach1(int[] arr,int N){
        int i = 1;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] == i){
                i++;
            }else {
                return i;
            }
        }
        return -1;
    }

    //This method return the solution but not optimal
    //time complexity - worst is O(n^2)
    //space complexity is O(1)
    static int Approach2(int[] arr,int N){
        for (int i = 1; i <= N; i++) {
            int flag = 0;
            for (int j = 0; j < N-1; j++) {
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return i;
            }
        }
        return -1;
    }

    //Solving using Mapping;
    //Here we are mapping the element form arr to MapArray
    //Initially all the elements of the MapArrays are zero
    //then we Map arr elements into the MapArray by converting O to 1
    //Using the element value from array as an index in MapArray

    //Time complexity is O(N) + O(N-1)
    //Space complexity is O(N+1)
    static int Approach3(int[] arr,int N){
        int[] MapArray = new int[N+1];

        for (int i = 0; i < N-1; i++) {
            MapArray[arr[i]] = 1;
        }

        for (int i = 1; i <= N; i++) {
            if(MapArray[i] == 0){
                return i;
            }
        }
        return -1;
    }

    //Optimal solution - 1
    //Solving by using Sum Method
    //Time complexity is O(n) and space complexity is O(1)
    static int sum(int[] arr,int N){
        int sum = (N * (N+1))/2; // this will return the sum of the N elements that are supposed to be in array
        int arrSum = 0;
        for (int i = 0; i < N-1; i++) {
            arrSum = arrSum + arr[i];
        }
        return sum-arrSum;
    }

    //Optimal solution - 2
    //Solving by using XOR method

    //Time complexity is O(n) + O(n)
    //Space complexity is O(1)
    static int xor(int[] arr,int N){
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 1; i <= N; i++) {
            xor1 = xor1 ^ i;
        }

        for (int i = 0; i < N-1; i++) {
            xor2 = xor2 ^ arr[i];
        }

        return xor1^xor2;
    }

    //Optimizing loops in xor

    //Only one loop is required
    static int xorOpt(int[] arr,int N){
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < N-1; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1); // will add from 1 to N-1
        }
        xor1 = xor1 ^ N; // will add the N

        return xor1^xor2; //return the element which is not present
    }

    static int kaam(int[] nums){
        int n = nums.length + 1;
        int xor1 = 0;
        int xor2 = 0;

        for(int i = 0; i < n-1; i++){
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ i;
        }
        xor1 = xor1 ^ n-1 ^ n;
        return xor1 ^ xor2;
    }
}
