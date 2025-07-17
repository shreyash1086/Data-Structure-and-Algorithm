package TUF.PracticeString;

public class StringtoIntegeratoi {
    public static void main(String[] args) {
        String str = "2147483646";
        System.out.println(atoi2(str));
    }
    static int atoi2(String str){
        int index = 0;
        int res = 0;
        int flag = 1;

        if(str.length() == 0){
            return 0;
        }

        //ignore leadign white spaces
        while(index < str.length() && str.charAt(index) == ' '){
            index+=1;
        }

        //store the sign of number
        if(index < str.length() && (str.charAt(index) == '-' || str.charAt(index) == '+')){
            if(str.charAt(index) == '-'){
                flag = -1;
            }
            index+=1;
        }

        //construct the number digit by digit

        while (index<str.length() && ('0'<=str.charAt(index) && str.charAt(index)<= '9')){
            //overflow and underflow test handling
            if(res > (Integer.MAX_VALUE/10) || (res == Integer.MAX_VALUE/10 && str.charAt(index)- '0' > 7)){
                return flag == 1?Math.min(Integer.MAX_VALUE, res) :Integer.MIN_VALUE;
            }

            //append current digit to the res
            res = res*10+(str.charAt(index)-'0');


            index+=1;
        }

        return res*flag;
    }






//    static int atoi(String str){
//        StringBuilder sb = new StringBuilder();
//        int sign = 1;
//        for(char ch: str.toCharArray()){
//            if(Character.isAlphabetic(ch)){
//                if(sb.isEmpty()){
//                    sb.append("0");
//                }
//                return sign * Math.max(Integer.MIN_VALUE,Math.min(Integer.MAX_VALUE,Integer.parseInt(sb.toString())));
//            }
//            if(ch == ' '){
//                continue;
//            }
//            if(ch == '-'){
//                if(sb.isEmpty()){
//                    sign = -sign;
//                    continue;
//                }else{
//                    return sign * Math.max(Integer.MIN_VALUE,Math.min(Integer.MAX_VALUE,Integer.parseInt(sb.toString())));
//                }
//            }else if(ch == '+'){
//                if(sb.isEmpty()){
//                    continue;
//                }else{
//                    return sign * Math.max(Integer.MIN_VALUE,Math.min(Integer.MAX_VALUE,Integer.parseInt(sb.toString())));
//                }
//            }
//
//            if(Character.isDigit(ch)){
//                sb.append(ch);
//            }
//        }
//        return sign * Math.max(Integer.MIN_VALUE,Math.min(Integer.MAX_VALUE,Integer.parseInt(sb.toString())));
//    }
}
