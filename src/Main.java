import java.util.*;

public class Main {

    public static void main(String[] args) {
        {
            String originalTex = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n" + "\n";
            Map<Character, Integer> text = new HashMap<>();
            for (int i = 0; i < originalTex.length(); i++) {
                String lowerTex = originalTex.toLowerCase();
                char character = lowerTex.charAt(i);
                if (Character.isLetter(character)) {
                    if (text.containsKey(character)) {
                        Integer valueChar = text.get(character) + 1;
                        text.put(character, valueChar);
                    } else {
                        text.put(character, 1);
                    }
                }
            }
            Collection<Character> collection = text.keySet();
            Integer charMax1 = Collections.max(text.values());
            Integer charMin1 = Collections.min(text.values());
            for (Character key : collection) {
                Object kek = text.get(key);
                if (key != null) {
                    if (charMin1.equals(kek)) {
                        Character ok = key;
                        System.out.println("Реже всего встречалась буква: "+ ok + ". Она встречалась: " + charMin1 + " раз.");
                    }
                    if (charMax1.equals(kek)) {
                        Character ok = key;
                        System.out.println("Чаще всего встречалась буква: "+ ok + ". Она встречалась: " + charMax1 + " раз.");
                    }
                }
            }
        }
    }
}
