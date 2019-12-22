package day32;

public class MethodWithReturnIntro {
    public static void main(String[] args) {

       String name= giveMeMyName();
        System.out.println("name = " + name);
        System.out.println(giveMeMyName());
        int myResult = doubleTheNumber(10);
        System.out.println("myResult = " + myResult);
        System.out.println("the result of doubling 100 is :"+doubleTheNumber(100));

        int add14to16result = add2Numbers(14,16);
        System.out.println("add 14 to 16 result = " + add14to16result);
        System.out.println(add2Numbers(14,16) +5);
    }

    // create a method



    public static int doubleTheNumber(int num){
        System.out.println("I will double the number");
        int result = num*2;
        return result;

    }

public static int add2Numbers (int num1,int num2){

return num1+num2;

}
    // i want  to create a static method called giveMeMyName
    //it returns your name as a result
    public static String giveMeMyName(){

        return "Akman";

    }



}
