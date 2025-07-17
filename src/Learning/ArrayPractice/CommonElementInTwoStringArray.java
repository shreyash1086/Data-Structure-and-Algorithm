package Learning.ArrayPractice;

public class CommonElementInTwoStringArray {
    public static void main(String[] args) {
//        int[] first = {1,3,5,9,15};
//        int[] second = {3,6,9,11,12};
//        commonElementInteger(first,second);

        String[] first = {"shreyash","kunal","buddha","Osho"};
        String[] second = {"Attadip","karuna","deep","osho","buddha"};

        commonElementString(first,second);

    }

    static void commonElementString(String[] first,String[] second){
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if(first[i].equalsIgnoreCase(second[j])){
                    System.out.println("Common Element is "+first[i].toLowerCase());
                }
            }
        }
    }

    static void commonElementInteger(int[] first, int[] second){
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if(first[i] == second[j]){
                    System.out.println("Common Element is "+first[i]);
                }
            }
        }
    }
}
