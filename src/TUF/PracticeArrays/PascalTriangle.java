package TUF.PracticeArrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ls2 = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            ls2.add(generateRow(i));
        }
    }
    static ArrayList<Integer> generateRow(int row){
        int ans = 1;
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        for (int i = 1; i < row; i++) {
            ans = ans * (row-i);
            ans = ans / (i);
            ls.add(ans);
        }
        return ls;
    }
}
