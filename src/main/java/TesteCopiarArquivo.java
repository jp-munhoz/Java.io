import java.io.*;
import java.nio.Buffer;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);

        OutputStream os = System.out;
        Writer wr = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(wr);

        String linha = br.readLine();

        while (linha != null && linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            bw.flush();
            System.out.println(linha);
        }
        br.close();
        bw.close();
    }
}
