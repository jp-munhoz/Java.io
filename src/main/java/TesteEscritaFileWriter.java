import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("lorem2.txt");

        fw.write("Hello ma friends");
        fw.write(System.lineSeparator());
        fw.write("Fala ae meu chapa!");

        fw.close();
    }
}
