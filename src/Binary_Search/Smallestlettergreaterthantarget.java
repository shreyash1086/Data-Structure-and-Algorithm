package Binary_Search;

public class Smallestlettergreaterthantarget {
    public static void main(String[] args) {
        char[] arr = {'c','e','f','g'};
        char target = 'g';
        System.out.println(SmallLetter(arr,target));
    }
    static char SmallLetter(char[] arr,char target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
