import java.io.*;
import java.util.*;


public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name : ");
        String fileName = sc.nextLine();

        FileOutputStream fos = new FileOutputStream(fileName);

        System.out.print("Enter text : ");
        String text = sc.nextLine();

        fos.write(text.getBytes());
        fos.close();

        FileInputStream fis = new FileInputStream(fileName);

        byte[] b = new byte[fis.available()];
        fis.read(b);
        fis.close();

        String content = new String(b);

        System.out.println("\nFile content : ");
        System.out.println(content);

        sc.close();
    }
}