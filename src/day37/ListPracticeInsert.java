package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeInsert {
    public static void main(String[] args) {

        List<Integer> lst2=new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        System.out.println("lst2 = " + lst2);
        // insert 100 right after 34==we dont know where is 34 ;
        lst2.add(lst2.indexOf(34)+1,100);
        System.out.println("after inserting 100 to  lst2 = " + lst2);

        // add five 100 in front of 44
        // output -->>100 100 100 100 100 44
//        lst2.add(0,100);
//        lst2.add(0,100);
//        lst2.add(0,100);
//        lst2.add(0,100);
//        lst2.add(0,100);
//
//        System.out.println("lst2 = " + lst2);//lst2 = [100, 100, 100, 100, 100, 44, 14, 34, 100, 41, 19]
        for (int i = 1; i <=5 ; i++) {
            lst2.add(0,100);
        }
        System.out.println("lst2 = " + lst2);



    }
}
