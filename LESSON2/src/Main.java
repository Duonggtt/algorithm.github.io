import java.util.*;

public class Main {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        Map<Character, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        key = key.replaceAll("\\s+" , "");
        char character = 'a';
        int i =0;
        System.out.println(key);
        while(map.size() < 26) {
            if(!map.containsKey(key.charAt(i))) {
                map.put(key.charAt(i), character);
                character++;
            }
            i++;
        }
        System.out.println(map);
        for(int j =0;j<message.length();j++) {
            if(message.charAt(j) == ' ') {
                sb.append(" ");
            }else {
                sb.append(map.get(message.charAt(j)));
            }
        }
        System.out.println(sb);
    }
}