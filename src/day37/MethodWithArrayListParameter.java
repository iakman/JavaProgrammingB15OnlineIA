package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {
    public static void main(String[] args) {
        List<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        printAList(nameLst);

        String resultLongest = getLongestElement(nameLst);
        System.out.println("resultLongest = " + resultLongest);

    }

    // create a method that accept  a List of String as argument / parameter and print out
    public static void printAList(  List<String> lst ){
        for (String each : lst) {
            System.out.println("each = " + each);
        }
    }
public static String getLongestElement (List<String> nameLst){
    String longestName = "";   // ornameLst.get(0);
    for (int x = 0; x < nameLst.size(); x++) {
        String currentName = nameLst.get(x);
        //> will give you first longest name if you have more than one
        //>= will give you last longest name if you have more than one
        if (currentName.length() >= longestName.length()){
            longestName=currentName;

        }
    }
   return longestName;
}
}
