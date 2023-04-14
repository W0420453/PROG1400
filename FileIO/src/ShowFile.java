import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void showFile(String filename) throws IOException, FileNotFoundException {
        int c;

        //create a file object
        File input = new File(filename);

        //Connect to a stream
        FileInputStream in = new FileInputStream(input);

        //do the reading
        while ((c=in.read())!= -1) {
            System.out.print((char) c); //cast the int to char, int is ASCII code
        }
        System.out.println();
        in.close();

    }
}
