public class TurnStringtoChar {

    public static void main(String[] args) {
        String name = "Vlad";
        char[] q = turnStringtoChar(name);
        System.out.println(q);
    }

    public static char[] turnStringtoChar(String name) {
        char[] letters = {'V', 'l', 'a', 'd'};

        for (int i = 0; i < name.length(); i++) {
            letters[i] = name.charAt(i);
        }

        return letters;
    }

}