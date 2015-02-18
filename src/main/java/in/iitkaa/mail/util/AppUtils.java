package in.iitkaa.mail.util;

import java.io.*;

/**
 * @author Alok
 * @since 17-02-2015
 */
public abstract class AppUtils {

    /**
     *
     * @param file
     * @return
     * @throws IOException
     */
    public static String readFile(File file) throws IOException {
        StringBuilder fileContent = new StringBuilder();
        InputStreamReader streamReader = new InputStreamReader(new FileInputStream(file));
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        String line = bufferedReader.readLine();
        while(line != null) {
            fileContent.append(line).append(System.getProperty("line.separator"));
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return fileContent.toString();
    }
}
