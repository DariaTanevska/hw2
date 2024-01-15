package hw2;

public class Hw2ex2 {
    public static void main(String[] args) {
        String text = "Testing, is my favourite job";
        text = text.replaceAll("[,]", "");
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word + " - " + word.length());
        }



        String str1 = "Testing";
        String str2 = "is my favourite job";
        if (str1.length () > str2.length ()) {
            System.out.println (true);
        } else {
            System.out.println (false);
        }



    }
}