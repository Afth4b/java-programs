import java.io.File;
import java.util.Scanner;

public class subDirFiles{
    static void listFiles(File dir){
        File[] files = dir.listFiles();

        if(files != null) {
            for(File f : files) {
                System.out.println(f.getName());

                if(f.isDirectory()) {
                    listFiles(f);
                }
            }
        }
    }

    static boolean searchFile(File dir, String name) {
        File[] files = dir.listFiles();

        if(files != null) {
            for (File f : files) {

                if(f.isFile() && f.getName().equals(name)) {
                    System.out.println("Found at: "+ f.getAbsolutePath());
                    return true;
                }

                if(f.isDirectory()) {
                    if(searchFile(f, name)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory path : ");
        String path = sc.nextLine();

        File dir = new File(path);

        if(dir.exists() && dir.isDirectory()) {
            System.out.println("\nFiles and folders : ");
            listFiles(dir);

            System.out.print("\nEnter file name to search : ");
            String name = sc.nextLine();

            if(!searchFile(dir, name)){
                System.out.println("file not found");
            }
        }else{
            System.out.println("Invalid path");
        }

        sc.close();
    }
}