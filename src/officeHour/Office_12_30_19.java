package officeHour;

public class Office_12_30_19 {
    public static void main(String[] args) {


        //parse methods
        String str1 = "123";
        System.out.println(str1 + 1);// -->>1231
        int result = Integer.parseInt(str1);
        System.out.println(result + 1);//124

        String str2 = "TRUE";
        boolean r1 = Boolean.parseBoolean(str2);
        System.out.println(r1);  // -->>true and it ignores case sensitivity

        String str3 = "FalSe";
        boolean r2 = Boolean.parseBoolean(str3);
        System.out.println(r2); // false

        String str4 = "Akman";
        boolean r3 = Boolean.parseBoolean(str4);
        System.out.println(r3); // false because "Akman" is not true or false

        //value of -->> converting String to wrapper class

        String s1="100.5";
         Double c1= Double.parseDouble(s1);     // auto boxing
        Double c2 = Double.valueOf(s1);
        System.out.println("c1 = " + c1);//100.5
        System.out.println("c1 +1 = " + (c1+1));
        System.out.println("c2 = " + c2); //100.5

    }
}
