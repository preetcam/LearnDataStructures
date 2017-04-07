package com.udemy.datastructures.arrayList;
import java.util.ArrayList;

/**
 * ArrayList
 *
 * 1: Create
 * 2: Display
 * 3: Size
 * 4: Delete element
 * 5: Contains
 */
public class ArrayListSimple {

    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList();

        arr.add("S");
        arr.add("I");
        arr.add("M");
        arr.add("P");
        arr.add("L");
        arr.add("E");
        arr.add(" ");
        arr.add("A");
        arr.add("R");
        arr.add("R");
        arr.add("A");
        arr.add("Y");
        arr.add("L");
        arr.add("I");
        arr.add("S");
        arr.add("T");

        System.out.println("ArrayList : "+arr);
        System.out.println("Size : "+ arr.size());
        System.out.println("Remove element E" + arr.remove("E"));
        System.out.println("New arraylist "+ arr);
        System.out.println("Remove element at 4th index" + arr.remove(4));
        System.out.println("New arraylist "+ arr);

        // Check if arraylist contains A
        System.out.println("Check if arraylist contains A : "+ arr.contains("A"));
        
    }

}
