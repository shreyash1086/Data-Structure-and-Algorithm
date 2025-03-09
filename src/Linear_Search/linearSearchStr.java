package Linear_Search;

public class linearSearchStr {
    public static void main(String[] args) {
        String str = "shreyash";
        char[] ch = str.toCharArray();
        char target = 'h';
        System.out.println(linear(ch,target));
    }
    static int linear(char[] ch,char target){
        for (int i = 0; i < ch.length; i++) {
            if(target == ch[i]){
                return i;
            }
        }
        return -1;
    }
}
