package TUF.PracticeString;

public class LargestOddNumberinString {
    public static void main(String[] args) {
        String number = "7542351161";
        System.out.println(oddNo(number));
    }

    static String OptimalSolution(String str){
        int index = -1; //contains the index of the Odd integer from the end
        int i;//contain the index of first non-zero element
        for (i = str.length()-1; i >= 0; i--) {
            if ((str.charAt(i)-'0')%2 == 1){ //this subtraction convert the char to integer value
                index = i;
                break;
            }
        }

        if(index == -1){
            return "";
        }
        i = 0;
        while (i <= index && str.charAt(i) == '0') i++;

        return str.substring(i,index+1);
    }

    //time complexity O(n^2)
    //space complexity is O(1)
    static long oddNo(String str){
        long number = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String temp = str.substring(i,j+1); // str.subString gives the substring with given range
//                if(!temp.isEmpty()){ //because if i,j if "" this will throw exception
                //Now there wont be an empty string in the temp an substring ranges from (start index to end index + 1)
                    if(Long.parseLong(temp) % 2 != 0){ //parseInt Method is used to convert the String to Integer number;
                        number = Math.max(number,Long.parseLong(temp));
                    }
//                }
            }
        }
        return number;
    }
}
