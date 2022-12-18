package tasks;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello";
        char[] carray = str.toCharArray();
        System.out.println("The string is: " + str);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print("Duplicate Characters in above string are: " + carray[j]);
                    break;
                }
            }
        }
    }
}