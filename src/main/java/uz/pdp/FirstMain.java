package uz.pdp;

public class FirstMain {
    public static void main(String[] args) {

        System.out.println(subsetXORSum(new int[]{1, 3}));
        System.out.println(numberOfEmployeesWhoMetTarget(new int[]{0,1,2,3,4},2));
        System.out.println(interpret("G()(al)"));
    }

    //1863. Sum of All Subset XOR Totals
    public static int subsetXORSum(int[] nums) {
        int xorSum = 0;
        int n = nums.length;
        for (int num : nums) {
            xorSum |= num;
        }
        return xorSum * (1 << (n - 1));
    }

    //2798. Number of Employees Who Met the Target
     public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for (int hour:hours){
            if (hour>=target)
                count++;
        }
        return count;
    }

    //1678. Goal Parser Interpretation
    public static  String interpret(String command) {
            String str="";
            for(int i=0; i<command.length();i++){
                if(command.charAt(i)=='G'){
                    str+='G';
                }
                else if(command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
                    str += "o";
                    i++;
                } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                    str += "al";
                    i += 3;
                }
            }
            return str;
        }



}