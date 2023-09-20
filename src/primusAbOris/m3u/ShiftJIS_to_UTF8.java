package primusAbOris.m3u;

import java.nio.charset.Charset;
import java.nio.file.*;
import java.io.IOException;

public class ShiftJIS_to_UTF8 {
    public static void main(String[] args) {
        String inputFileName = "in0.m3u";
        String outputFileName = "in.m3u"; // ready to throw into M3U_reformat

        try {
            // Read the file using Shift-JIS encoding and write it back with UTF-8 encoding
            Files.write(
                Paths.get(outputFileName),
                new String(Files.readAllBytes(Paths.get(inputFileName)), Charset.forName("Shift-JIS"))
                    .getBytes(Charset.forName("UTF-8"))
            );
            
            System.out.println("File encoding changed to UTF-8 and saved to " + outputFileName);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
