package TUF.PracticeString;

public class sumofbeutyofallsubstrings {
    public static void main(String[] args) {
        System.out.println(OptBeauty("aabcb"));
    }


    //Writting optimal codes
    //time complexity is O(n^2) and space complexity is O(n)
    static int OptBeauty(String str){
        int len = str.length();
        int ans = 0;
        for (int i = 0; i < len; i++) {
            int[] hash = new int[26];
            int max =0;
            int min =500;
            for (int j = i; j < len; j++) {
                hash[str.charAt(j)-'a']++;
                max=Math.max(max,hash[str.charAt(j)-'a']);
                min=findMin(hash);
                ans+=(max-min);
            }
        }
        return ans;
    }
    static int findMin(int[] arr){
        int min = 500;
        for (int i = 0; i < 26; i++) {
            if(arr[i]!=0) min=Math.min(min,arr[i]);
        }
        return min;
    }

    //this code
    //time O(n^2) and space O(M)
    static int beauty(String str){
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                res = res+sum(str,i,j);
            }
        }
        return res;
    }
    static int sum(String str,int i,int j){
        String temp = str.substring(i,j+1);
        int[] ch = new int[125];
        for (int k = 0; k < temp.length(); k++) {
            ch[temp.charAt(k)] += 1;
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int x: ch){
            if(x>0){
                max =Math.max(max,x);
                min=Math.min(min,x);
            }
        }
        return max-min;
    }
}
