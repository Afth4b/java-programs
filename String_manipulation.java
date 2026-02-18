import java.util.Scanner;

public class String_manipulation{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string for manipulation : ");
        String str = sc.nextLine();

        System.out.println("Length of the string is : "+str.length());

        // System.out.println("Enter the index u want to retrieve the character : ");
        // int index = sc.nextInt();
        // char result = str.charAt(index);
        // System.out.println("Character at position "+index+" is : "+result);

        // System.out.println("Enter the index u want to find the unicode : ");
        // index = sc.nextInt();
        // int res = str.codePointAt(index);
        // System.out.println("Unicode of character at position "+index+" is : "+res);

        // System.out.println("Enter the beginning index and endind index to find the substring: ");
        // int beg = sc.nextInt();
        // int end = sc.nextInt();
        // String result = str.substring(beg,end);
        // System.out.println(result);

        System.out.print("Enter another string to compare it : ");
        String str2 = sc.nextLine();
        System.out.println(str.equals(str2));
    }
}