package Learning.String_StringBuilder;

public class PrintEvenLengthWords {
    public static void main(String[] args) {
        String str = "What is true meaning of having control over the emotions";
        usingTwoPointer(str);
    }

    static void PrintEvenWords(String str){
        int temp = 0;
        String strTemp = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                strTemp = strTemp+str.charAt(i);
                temp++;
            }else {
                if (temp%2 == 0) {
                    System.out.print(strTemp);
                    strTemp = "";
                    temp = 0;
                    System.out.print(" ");
                }else {
                    System.out.print(" ");
                    strTemp ="";
                    temp = 0;
                }
            }

            if(i == str.length()-1 && temp%2 == 0){
                System.out.println(strTemp);
            }
        }
    }

    static void usingTwoPointer(String str){
        int i=0;
        int j=0;
        StringBuilder temp = new StringBuilder();

        while(j<str.length()){

            if(str.charAt(i) == ' '){
                temp.append(" ");
                i++;
            }

            if(str.charAt(j) != ' ' && j != str.length()-1){
                j++;
            }else{
                if (j == str.length()-1){
                    j++;
                }
                if((i+j)%2 == 0){
                    temp.append(str,i,j);
                    if(j != str.length()){
                        temp.append(" ");
                    }
                }else{
                    temp.append(" ");
                }
                j++;
                i=j;
            }
        }
        System.out.println(temp);
    }

}
