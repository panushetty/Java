public class Solution {
    public static void main(String[] args) {
        int sum=0;
        String num="";
        String base="abc123xyz";
        for (int i=0;i<base.length();i++){
            if(Character.isDigit(base.charAt(i)))
            {
                if(i<base.length()-1 && Character.isDigit(base.charAt(i+1))){
                    num+=base.charAt(i);
                    System.out.println("Num is now"+num);
                }
                else{
                    num+=base.charAt(i);
                    sum+=Integer.parseInt(num);
                    num="";
                    System.out.println("Sum is now"+sum);

                }
            }

        }
        System.out.println(sum);
    }

}
