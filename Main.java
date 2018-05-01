import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream(args[0]);
            ZipInputStream z = new ZipInputStream(fi);

            while (true) {
                ZipEntry entry = z.getNextEntry();
                if (entry == null) return;
                System.out.println(entry.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(2);
        }

    }
}
