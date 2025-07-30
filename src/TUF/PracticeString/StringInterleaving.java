package TUF.PracticeString;

public class StringInterleaving {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = "adbecf";
        System.out.println(interleaving2(s1, s2, s3));
    }

    //time complexity O(arr3.length) and space complexity is O(1)
    static boolean interleaving2(String str1,String str2,String str3){
        int j = 0;
        int k = 0;
        for (int i = 0; i < str3.length(); i++) {
            if(i%2 == 0){
                if(str3.charAt(i) == str1.charAt(j)){
                    j++;
                }else{
                    return false;
                }
            }

            if(i%2 == 1){
                if(str3.charAt(i) == str2.charAt(k)){
                    k++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    static boolean interleaving(String str1,String str2,String str3){
        int s = 0;
        int k = 0;
        if(str3.length() != str1.length()+str2.length()) return false;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str3.length(); i++) {
            if(i%2 == 0){
                sb.append(str1.charAt(s));
                s++;
            }

            if(i%2 == 1){
                sb.append(str2.charAt(k));
                k++;
            }
        }
        return str3.contentEquals(sb);
    }
}
