import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("lorem2.txt");
        Writer writer = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(writer);

        bw.write("Ola mundo");
        bw.newLine();
        bw.write("ola quase mundo");


        bw.close();
    }
}
