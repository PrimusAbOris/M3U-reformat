package primusAbOris.m3u;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class M3U_reformat {
    public static void main(String[] args) {
        String inputFileName = "in.m3u";
        String outputFileName = "out.m3u";

        // INPUT FILE MUST BE UTF-8. Confirm and convert to it using VSCode, Notepad++, Notepad, etc.
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName, StandardCharsets.UTF_8));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName, StandardCharsets.UTF_8))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Extract the filename from each line and write it to the output file
                String filename = extractFilename(line);
                writer.write(filename);
                writer.newLine();
            }

            System.out.println("Filenames extracted and written to " + outputFileName);

        } catch (IOException e) {
            System.err.println("Error reading or writing files: " + e.getMessage());
        }
    }

    private static String extractFilename(String filePath) {
        // Split the filePath using the file separator (either / or \)
        String[] parts = filePath.split("[\\\\/]");
        // if you want:
        System.out.println(parts[parts.length - 1]);
        // The last part of the split will be the filename
        return parts[parts.length - 1];
    }
}
