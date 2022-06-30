import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;

public class Day4Exercises2 {
    static void getFilesDirectories(String url){
        File folder = new File(url);
        String[] files = folder.list();
        for (String f : files){
            System.out.println(f);
        }
    }

    static void getFilesByExtension(String url, String extension){
        File folder = new File(url);
        String[] files = folder.list();
        for (String f : files){
            if(f.endsWith(extension)){
                System.out.println(f);
            }
        }
    }

    static boolean ifExists(String url){
        File path = new File(url);
        if(path.exists()){
            return true;
        } else {
            return false;
        }
    }
    static boolean hasRWPermission(String url){
        File path = new File(url);
        if (path.canRead() && path.canWrite()){
            return true;
        } else {
            return false;
        }
    }

    static boolean isDirectory(String url){
        File path = new File(url);
        if (path.isDirectory()){
            return true;
        } else {
            return false;
        }
    }
    static boolean hasSameContents(String url1, String url2){
        File path1 = new File(url1);
        File path2 = new File(url2);
        if(path1.equals(path2)){
            return true;
        } else {
            return false;
        }
    }

    static String lastModified(String url){
        File file = new File(url);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(file.lastModified());
    }

    static void printLength(String url){
        File file = new File(url);
        long bytes = file.length();
        long kilobytes = file.length() / 1024;
        long megabytes = kilobytes / 1024;
        System.out.println("In bytes: " + bytes);
        System.out.println("In kilobytes: " + kilobytes);
        System.out.println("In megabytes: " + megabytes);
    }


    public static void main(String[] args){
        System.out.println("Contents:");
        getFilesDirectories("C://users/user/Documents");
        System.out.println("\nFiles ending with extension:");
        getFilesByExtension("C://users/user/Documents", ".ini");
        System.out.println("\nIfExists:");
        System.out.println(ifExists("C://users/user/Documents"));
        System.out.println("\nHas Read/Write permission:");
        System.out.println(hasRWPermission("C://users/user/Documents"));
        System.out.println("\nIs directory?");
        System.out.println(isDirectory("C://users/user/Documents"));
        System.out.println("\n2 file comparison");
        System.out.println(hasSameContents("C://users/user/Documents/", "C://users/user/"));
        System.out.println("\nLast modified of a random file:");
        System.out.println(lastModified("C://users/user/Documents/Default.rdp"));
        System.out.println("\nSize of a random file:");
        printLength("C://users/user/Documents/desktop.ini");

    }
}
