import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    static String read(String path) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        }
        return content.toString();
    }
    public static void main(String[] args) {
        try {
            // Using your specific file path
            String fullContent = read("D:\\Eclipse_IDE_2025_12R\\eclipse\\latest_workspace\\Java_IOOP_Course\\34_L27_L33\\src\\test.txt");
            System.out.print(fullContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}