import java.util.Scanner;

public class CHAR {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String to be found");
        String string=in.next();
        System.out.println("Enter the character to be found occurance of");
        String substring=in.next();
        int ans=string.length();
        string=string.replace(substring,"");
        ans=ans-string.length();
        System.out.println("Occurance of char   "+ans);

    }
}
