import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day4Exercises3 {

    static void writefile(String name, String text){
        try {
            FileWriter myWriter = new FileWriter(name);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void readfile(String name){
        File file = new File(name);
        try {
            Scanner finput = new Scanner(file);
            while (finput.hasNextLine()) {
                System.out.println(finput.nextLine());
            }
            finput.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
    public static void main(String[] args) {
        writefile("test.txt", "lololol");
        readfile("test.txt");
    }
}