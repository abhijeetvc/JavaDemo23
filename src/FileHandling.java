import java.io.*;

// FileWriter and FileReader
public class FileHandling {

    File f=new File("/Users/abhi/Desktop/filehandling/testfile.txt");

    public void writeToFile() throws IOException {

        String str="Hi, How are you?";

        FileWriter fw=new FileWriter(f);
        fw.write(str);
        fw.close();
        System.out.println("Data written to the file...");

    }

    public void readFromFile() throws IOException {
        FileReader fr=new FileReader(f);
        int charData;
        while((charData=fr.read())!=-1){
            System.out.print((char)charData);
        }
    }
    public static void main(String[] args) throws IOException {
       FileHandling fh=new FileHandling();
       fh.readFromFile();
    }
}

