package Learning.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //Array is a collection of datatypes like primitive object complex datatype;

//        syntax
//        datatype variablename = new Datatype[size]

//        int[] arr = new int[5]; // the declaration is done at compile time and the array object (heap object) is created at runtime
//        assigning memory at runtime is called as Dynamic memory allocation

//        arr[0] = 24;
//        arr[1] = 25;
//        arr[2] = 26;
//        arr[3] = 55;
//        arr[4] = 78;

//        System.out.println(Arrays.toString(arr)); //  use this method we should add the util Arrays package exetrnally
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        for(int y : arr){
//            System.out.println(y);
//        }

//        int[] arr2 = {2,1,4,5,4,5,6};
//        System.out.println(Arrays.toString(arr2));

//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }

//        for(int x : arr2){
//            System.out.println(x);
//        }
        Scanner sc = new Scanner(System.in);

//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//        }
//
//        for(int x : array){
//            System.out.println(x);
//        }

        //passing array in a function

        int[] arrr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arrr));
        change(arrr);
        System.out.println(Arrays.toString(arrr));
    }
    static void change(int[] arr){
        arr[2] = 45;
        arr[6] = 101;
    }
}
