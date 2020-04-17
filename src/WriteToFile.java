import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void write() throws IOException {
        File myFile = new File("calories.txt");
        FileWriter myFileWriter = new FileWriter(myFile);
        BufferedWriter myBuff = new BufferedWriter(myFileWriter);
        myBuff.write(ReadFile.splitWords[0] + ";" + ReadFile.splitWords[1]);
        myBuff.close();
    }
}
