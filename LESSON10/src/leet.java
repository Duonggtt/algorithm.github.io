import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leet {
    public static boolean halvesAreAlike(String s) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        int mid = s.length() / 2;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i<mid;i++){
            if(list.contains(s.charAt(i))) {
                count1++;
            }
        }
        for(int i = mid;i<s.length();i++){
            if(list.contains(s.charAt(i))) {
                count2++;
            }
        }
        if(count1 != count2) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("Ieai"));
    }
}
