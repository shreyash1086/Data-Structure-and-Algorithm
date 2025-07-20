package Learning.Practice;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the ID : ");
        int ID = sc.nextInt();
        System.out.print("enter the department : ");
        String Dept = sc.next();

        switch (ID){
            case 71 ->{
                System.out.println("ID : "+ID);
                switch (Dept){
                    case "CSE" ->{
                        String name = "The girl After in Boards";
                        String ContactNo = "GIRLXXXXXX";
                        System.out.println("Department is : "+Dept);
                        System.out.println("Employee : "+name);
                        System.out.println("Mobile No : "+ContactNo);
                    }
                    case "IT" ->{
                        String name = "ITs Student";
                        String ContactNo = "ITITXXXXXX";
                        System.out.println("Department is : "+Dept);
                        System.out.println("Employee : "+name);
                        System.out.println("Mobile No : "+ContactNo);
                    }
                }

            }
            case 72 ->{
                System.out.println("ID : "+ID);
                switch (Dept) {
                    case "IT" ->{
                        String name = "ITs Student";
                        String ContactNo = "ITITXXXXXX";
                        System.out.println("Department is : "+Dept);
                        System.out.println("Employee : "+name);
                        System.out.println("Mobile No : "+ContactNo);
                    }
                    case "CSE" ->{
                        String name = "CSEs Student";
                        String ContactNo = "CSECSEXXXX";
                        System.out.println("Department is : "+Dept);
                        System.out.println("Employee : "+name);
                        System.out.println("Mobile No : "+ContactNo);
                    }
                }
            }
            case 73 ->{
                System.out.println("ID : "+ID);
                switch (Dept) {
                    case "CSE" ->{
                        String name = "shreyash Damodar";
                        String ContactNo = "9096XXXXXX";
                        System.out.println("Department is : " + Dept);
                        System.out.println("Employee : "+name);
                        System.out.println("Mobile No : "+ContactNo);
                    }
                    case "IT" ->{
                        String name = "monster Lizard";
                        String ContactNo = "MONSXXXXXX";
                        System.out.println("Department is : " + Dept);
                        System.out.println("Employee : "+name);
                        System.out.println("Mobile No : "+ContactNo);
                    }
                }
            }
        }
    }
}
