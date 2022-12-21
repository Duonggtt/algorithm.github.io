import java.util.*;

public class Main {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String[] keys = key.split(" ");
        String message = "vkbs bs t suepuv";
        String[] messages = message.split(" ");
        String abc = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<messages.length;i++){
            for(int j=0;j<keys.length;j++){
                if(messages[i].equals(keys[j])) {
                    sb.append(abc.charAt(j));
                    sb.append(" ");
                    System.out.println(sb);
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}