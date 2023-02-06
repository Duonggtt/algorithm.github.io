import java.util.ArrayList;
import java.util.Collections;

public class let {

    public static String removeDigit(String number, char digit) {
        ArrayList<String> list = new ArrayList<>();
        String result = "";
        for(int i = 0;i<number.length();i++) {
            if(number.charAt(i) == digit) {
                list.add(number.substring(0,i)+number.substring(i+1));
            }
        }
        Collections.sort(list);
        result += list.get(list.size() - 1);
        return result;
    }
    public static void main(String[] args) {
        String number = "1231";
        char digit = '1';
        System.out.println(removeDigit(number,digit));
    }
}
