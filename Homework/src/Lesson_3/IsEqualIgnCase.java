package Lesson_3;

public class IsEqualIgnCase {
    public static void main(String[] args) {
        String word1 = "Same thing", word2 = "saMe Thing";
        String res = word1.equalsIgnoreCase(word2) ? " is equal to ":" is not equal to ";
        System.out.println(word1 + res + word2);
    }
}
