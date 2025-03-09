package LeetCode;

public class checkIfPangram{
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        checkIfPangramQ(sentence);
    }
    static void checkIfPangramQ(String sentence) {
        char[] array = sentence.toCharArray();
        for (char j = 'a'; j <= 'z'; j++) {
            int k = 0;
            while(k < array.length) {
                if(j != array[k]){
                    k++;
                }else {

                }
            }
        }
    }
}
