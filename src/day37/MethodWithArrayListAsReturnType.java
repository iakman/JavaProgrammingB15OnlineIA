package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {
        System.out.println(getListFrom1ToFinalNumber(10));
        System.out.println(getListFrom1ToFinalNumber(2));
        System.out.println(getListFrom1ToFinalNumber(20));

        List<Integer> myList = getListFrom1ToFinalNumber(25);
        System.out.println("myList = " + myList);

    }

    // create a method that accept a finalNumber as int
    // return an ArrayList of Integer containing numbers
    // starting from 1 till finalNumber
public static List<Integer> getListFrom1ToFinalNumber (int finalNumber ){
    List<Integer> nums = new ArrayList<>();
    for (int numbers = 1; numbers <=finalNumber ; numbers++) {
        nums.add(numbers);
    }
   // System.out.println("nums = " + nums);

return nums;
}

}
