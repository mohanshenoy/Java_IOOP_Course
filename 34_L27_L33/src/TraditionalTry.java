import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TraditionalTry {

    static String read(String path) throws IOException {
        BufferedReader br = null;
        StringBuilder content = new StringBuilder();
        try {
            br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
            return content.toString();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.err.println("Failed to close reader: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            String fullContent = read("D:\\Eclipse_IDE_2025_12R\\eclipse\\latest_workspace\\Java_IOOP_Course\\34_L27_L33\\src\\test.txt");
            System.out.print(fullContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}