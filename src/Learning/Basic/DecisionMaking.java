package Learning.Basic;

public class DecisionMaking {
    public static void main(String[] args) {
        //if statement

        if(false){
            System.out.println("kay kamach");
        }

        //if else
        if(false){
            System.out.println("shreyash");
        }else{
            System.out.println("pappu");
        }

        //if nested

        if(true){
            System.out.println("true");
            if(true){
                System.out.println("true2");
                if(true){
                    System.out.println("true3");
                }
            }
        }

        //if else if

        if(false){
            System.out.println("shreyash");
        }else if(false){
            System.out.println("developer");
        }else{
            System.out.println("pappu");
        }

        //Switch case

        int number = 5;

        switch (number){
            case 4:
                System.out.println("number is 4");
                break;
            case 7:
                System.out.println("number is 7");
                break;
            default:
                System.out.println("no case matches");
        }
    }
}
