package Java.Strings;

public class SuffleWords {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));

    }

    // public static String sortSentence(String s) {
    // String newStr = "";

    // String[] array = s.split(" ");
    // String[] value = new String[array.length];

    // for (String string : array) {
    // int index = string.charAt(string.length()-1) - '1';
    // value[index] = string.substring(0, string.length() - 1);
    // }

    // for (String string : value) {
    // newStr += string + " ";
    // }
    // return newStr.trim();

    // }

    public static String sortSentence(String s) {
        String newStr = "";

        String[] array = s.split(" ");
        String[] value = new String[array.length];

        for (String string : array) {
            String intVal = string.replaceAll("[^0-9]", "");
            int index = Integer.parseInt(intVal);
            value[index - 1] = string.replaceAll("[0-9]", "");
        }

        for (String string : value) {
            newStr += string + " ";
        }
        return newStr.trim();

    }
}
