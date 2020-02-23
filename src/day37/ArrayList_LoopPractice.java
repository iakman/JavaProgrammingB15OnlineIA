package day37;

import java.util.ArrayList;

public class ArrayList_LoopPractice {
    public static void main(String[] args) {
        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        System.out.println("nameLst = " + nameLst);

        // find the longest one
        String longestName = "";   // ornameLst.get(0);
        for (int x = 0; x < nameLst.size(); x++) {
            String currentName = nameLst.get(x);
            //> will give you first longest name if you have more than one
            //>= will give you last longest name if you have more than one
            if (currentName.length() >= longestName.length()){
                longestName=currentName;

            }
        }
        System.out.println("longestName = " + longestName);

        // how do i get the concatenation of all longest words if there are more
        // first find the longest word and get the char count
        // then loop through each name

        for (int i = 0; i < nameLst.size(); i++) {
            if (nameLst.get(i).length()== longestName.length() ){
                System.out.println("longest word =  "+nameLst.get(i));
            }

        }
// length     :  counting the elements inside array , it's a property of array object
        // last element of an array :  arr[arr.length-1]
        // length()   :  counting the characters inside String , it's a method of String object
        // last char of a String :  str.charAt( str.length() -1 )
        // size()     :  counting the elements inside ArrayList object, , it's a method of List Object
        // last element of an arrayList :  lst.get( lst.size()-1 )

        // HOW DO WE USE FOR EACH LOOP TO GO THROUGH EACH ITEMS
        System.out.println("-------------------");
        for (String currentName : nameLst) {
            System.out.println("currentName = " + currentName);
        }

    }
}
