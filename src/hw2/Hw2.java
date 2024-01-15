package hw2;

public class Hw2 {
    public static void main(String[] args) {

        String textString = "This line that i want to cut, cause it is too long";
        System.out.println("The length of the string textString = " + textString.length());

        //"This line that i want to cut, cause"
        String textString2 = textString;
        System.out.println(textString2.substring(0, 35));
        System.out.println("The length of the string textString2 = " + textString2.length());

        //it is perfect
        String textString3 = textString2.substring(0, textString2.length()-14).concat("it is perfect");
        System.out.println(textString3);
        System.out.println("The length of the string textString3 = " + textString3.length());


    }
}
