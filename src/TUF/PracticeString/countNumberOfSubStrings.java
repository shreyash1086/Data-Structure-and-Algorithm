package TUF.PracticeString;

public class countNumberOfSubStrings {
    public static void main(String[] args) {
        String a = "abc";
        System.out.println(count2(a));
    }
    //time complexity is O(n^2) and space complexity is O(1)
    static int count(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                count++;
            }
        }
        return count;
    }

    //time O(1) and space O(1)
    static int count2(String str){
        return (str.length()*(str.length()+1)/2);
    }
}
