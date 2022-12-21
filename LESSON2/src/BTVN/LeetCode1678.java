package BTVN;

public class LeetCode1678 {

    class Solution {
        public String interpret(String command) {
            String newStr = "";
            for(int i =0;i<command.length();i++){
                if(command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                    newStr += "o";
                    i++;
                }else if(command.charAt(i) == 'G'){
                    newStr += "G";
                }else {
                    newStr += "al";
                    i+=3;
                }
            }
            return newStr;
        }
    }

}
