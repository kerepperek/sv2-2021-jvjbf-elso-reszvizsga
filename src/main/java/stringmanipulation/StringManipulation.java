package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s) {
        String result = "";

        for (int idx = 0; idx < s.length(); idx += 2) {
            result += s.charAt(idx);
        }
        return result;
    }
}
