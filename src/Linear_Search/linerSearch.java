package Linear_Search;

public class linerSearch {
    public static void main(String[] args) {
        int[] array = {12,45,78,56,23,-45,-89,44,45};
        int target = 23;
        int ans = search(array,target);
        System.out.println(ans);
    }
    //search in the array - return index if item found
    //otherWise return -1
    static int search(int[] array,int val){
//        check if elements are present in array if not then pehli fursat main nikal lo
        if(array.length == 0){
            return -1;
        }
        // if want to return index of element use this method
//        for (int i = 0; i < array.length; i++) {
////            check for element at every index if it is = target
//            if(array[i] == val){
//                return i;
//            }
//        }

        //if want to return element use below method
        for(int element: array){
            if(element == val){
                return element;
            }
        }
//        this line will if none of the return statement above executed
//        hence the target not found
        return -1;
    }
}
