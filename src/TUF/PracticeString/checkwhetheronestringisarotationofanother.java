package TUF.PracticeString;

public class checkwhetheronestringisarotationofanother {
    public static void main(String[] args) {
        String str = "abcde";
        String goal = "cdeab";
        System.out.println(check(str,goal));
    }

//    Optimal solution
    static boolean Optimal(String str,String goal){
        if(str.length() != goal.length()) return false;
        String combine = str + str; //now combine contains all possible rotations within it
        return combine.contains(goal);
    }
    //Solution 2 - implemented using StringBuilder

    //time complexity is O(n^2) and space complexity is O(n)
    static boolean check2(String str,String goal){
        if(str.equals(goal)) return true;

        StringBuilder sb = new StringBuilder(str); //takes O(n) space
        int n = str.length();

        for (int i = 0; i < n-1; i++) { //time complexity is O(n^2)
            char last = sb.charAt(n-1);//take the last char from stringBuilder
            sb.deleteCharAt(n-1);//delete the last char
            //add it to the front position
            sb.insert(0,last); //time complexity is O(n) Shifts all characters to the right
            str = str.charAt(n-1)+str.substring(0,n-1);
            if(sb.toString().equals(goal)) return true; //time O(n) Converts the entire buffer - O(n)	Compares up to n characters
        }
        return false;
    }

    //Solution 1 - implemented using String
    //time complexity is O(n^2) and space complexity is O(n)
    static boolean check(String str,String goal){
        int n = str.length();
        if(str.equals(goal)) return true;

        for (int i = 0; i < n-1; i++) { //time - O(n-1)
            str = str.charAt(n-1)+str.substring(0,n-1); //space O(n)
//            System.out.println(str);
            if(str.equals(goal)) return true;
        }
        return false;
    }
}
