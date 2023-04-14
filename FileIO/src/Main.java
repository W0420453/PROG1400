import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.ObjectInputFilter;

public class Main {
    public static void main(String[] args) {
        String txt = "Hello world!";
        System.out.println(txt);

        File myObj = new File("test.txt");

        if(myObj.exists())
        {
            System.out.println("File Name: " + myObj.getName());
            System.out.println("Absolute Path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
        }
        else {
            System.out.println("The file does not exist.");
        }

        ///////////////////////////////////////////////////////////////////////////////
        System.out.println("\n-------------------------------------------\n");
        try {
            String filename = "test.txt";
            ShowFile.showFile(filename);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: "+ e);
        } catch (IOException e) {
            System.out.println("IOException: "+e);
        }

        ///////////////////////////////////////////////////////////////////////////////
        System.out.println("\n-------------------------------------------\n");

        ConfigWriter writeObject = new ConfigWriter();


    }

}