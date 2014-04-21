import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Download {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 5; i++) {
            new Download().saveUrl("http://myflex.org/yf/podru/budam" + i +".mp3");
        }
    }

    public void saveUrl(final String urlString) throws IOException {
        URL site;
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        String filename = "";
        try {
            System.out.println("get " + urlString);
            site = new URL(urlString);
            in = new BufferedInputStream(site.openStream());
            filename = site.getFile();
            fout = new FileOutputStream("C:" + site.getFile());

            final byte data[] = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1) {
                fout.write(data, 0, count);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (fout != null) {
                System.out.println("Save file " + filename);
                fout.close();
            }
        }
    }

}
