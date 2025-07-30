package TUF.PracticeString;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "0PP";
        System.out.println(check(str));
    }

    //time O(n+n)~O(n) and space O(n)
    static boolean check(String str){

        if(str.length() == 1 || str.length() == 0){
            return true;
        }

        String strn = str.toLowerCase(); //time O(n)
        //space O(n)
        int i = 0;
        int j = str.length()-1;
        while(i<=j){ //time O(n/2) ~ O(n)
            if ((Character.isAlphabetic(strn.charAt(i)) || Character.isDigit(strn.charAt(i))) && (Character.isAlphabetic(strn.charAt(j)) || Character.isDigit(strn.charAt(j)))){
                if(strn.charAt(i) != strn.charAt(j)){
                    return false;
                }else{
                    i++;
                    j--;
                }
            } else{
                if(!(Character.isAlphabetic(strn.charAt(i)) || Character.isDigit(strn.charAt(i)))){
                    i++;
                } else if (!(Character.isAlphabetic(strn.charAt(j)) || Character.isDigit(strn.charAt(j)))) {
                    j--;
                }
            }
        }
        return true;
    }
}
