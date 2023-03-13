import java.io.PrintWriter;
import java.io.File;
public class FileWriter {
    public static void write(String fileName, String s ){
    File file = new File(fileName);
    PrintWriter out = new PrintWriter(file);
    out.println(s);
    out.close();
    }
    public static void main(String[] args) {
        write("abc", "def");
    }
}
