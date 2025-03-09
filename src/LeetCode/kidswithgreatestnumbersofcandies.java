package LeetCode;


//solved on leetcode



import java.util.ArrayList;
import java.util.List;

public class kidswithgreatestnumbersofcandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
//        int large = kidsWithCandies(candies,extraCandies);
//        System.out.println(large);
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int large = 0;
        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] > large){
                large = candies[i];
            }
        }
        ArrayList<Boolean> List = new ArrayList<Boolean>();
        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies > large){
                List.add(true);
            }
            else {
                List.add(false);
            }
        }
        return List;
    }
}
