import java.util.Scanner;

public class String_manipulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("\n----- STRING MANIPULATION OPERATIONS -----");

        // 1. length()
        System.out.println("1. Length: " + str.length());

        // 2. toUpperCase()
        System.out.println("2. Uppercase: " + str.toUpperCase());

        // 3. toLowerCase()
        System.out.println("3. Lowercase: " + str.toLowerCase());

        // 4. trim()
        System.out.println("4. Trimmed: " + str.trim());

        // 5. charAt()
        if(str.length() > 0)
            System.out.println("5. Character at index 0: " + str.charAt(0));

        // 6. substring()
        if(str.length() >= 3)
            System.out.println("6. Substring (0 to 3): " + str.substring(0, 3));

        // 7. contains()
        System.out.println("7. Contains 'Java'? " + str.contains("Java"));

        // 8. indexOf()
        System.out.println("8. Index of 'a': " + str.indexOf('a'));

        // 9. lastIndexOf()
        System.out.println("9. Last index of 'a': " + str.lastIndexOf('a'));

        // 10. replace()
        System.out.println("10. Replace 'a' with 'x': " + str.replace('a', 'x'));

        // 11. equals()
        System.out.print("\nEnter another string for comparison: ");
        String str2 = sc.nextLine();
        System.out.println("11. Equals: " + str.equals(str2));

        // 12. equalsIgnoreCase()
        System.out.println("12. Equals Ignore Case: " + str.equalsIgnoreCase(str2));

        // 13. compareTo()
        System.out.println("13. CompareTo: " + str.compareTo(str2));

        // 14. startsWith()
        System.out.println("14. Starts with 'H'? " + str.startsWith("H"));

        // 15. endsWith()
        System.out.println("15. Ends with 'a'? " + str.endsWith("a"));

        sc.close();
    }
}
