import java.io.*;
public class ConfigWriter {
    String newline = System.getProperty("line.separator");


    public ConfigWriter() {
        try {
            File file = new File("Highscore.txt");
            System.out.println("Filename has been Located: " + file.getName());
            /*
            file.setReadOnly();
            System.out.println("File: " + file.getName() + " | has been set to read only");
            file.setReadable(true);
            System.out.println("File: " + file.getName() + " | can now be read");
            */
            FileOutputStream fs = new FileOutputStream(file);
            write(fs, "Username = CoolName");
            write(fs, "Score = 3004");
        } catch (IOException e) {
            System.out.println("Cannot write to file");
            System.out.println(e.getStackTrace());
        }
    }

    private void write(FileOutputStream stream, String output) throws IOException {
        output = output + newline;
        //output = output + "\n";
        byte[] data = output.getBytes();
        stream.write(data, 0, data.length);
    }
}
