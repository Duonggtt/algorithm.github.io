import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class test {

    public static void main(String[] args) {
        String s = "foobar";
        System.out.println(percentageLetter(s,'o'));
    }

    public static int percentageLetter(String s, char letter) {
        int count = 0;
        for(int i = 0;i<s.length();i++) {
            if(s.charAt(i) == letter) {
                count++;
            }
        }
        return (int) Math.floor(((double)count / (double)s.length()) * 100);
    }

    public static int calPoints(String[] operations) {
        int sum = 0;
        int j =0;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0;i<operations.length;i++) {
            if(operations[i].equals("C")) {
                nums.remove(nums.get(j-1));
                j--;
            }else if(operations[i].equals("D")) {
                nums.add(nums.get(j-1) * 2);
                j++;
            }else if(operations[i].equals("+")) {
                nums.add((nums.get(j-1) + nums.get(j-2)));
                j++;
            }else {
                nums.add(Integer.valueOf(operations[i]));
                j++;
            }
        }
        for(Integer num : nums) {
            sum += num;
        }
        return sum;
    }

}
