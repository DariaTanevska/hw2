package hw2;

public class Hw2ex3 {
    public static void main(String[] args) {
    String sentenceString = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";
        int count = 0;
        for (int i = 0; i < sentenceString.length(); i++) {
            if (sentenceString.charAt(i) == 'a' || sentenceString.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println("Кількість букв 'a' в реченні: " + count);


    }
}
