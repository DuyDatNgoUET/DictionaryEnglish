import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {
    public void insertFromCommandline() {

        // type amount word
        int countWord;
        Scanner typeCountWord = new Scanner(System.in);
        System.out.print("Number of vocabulary: ");
        countWord = typeCountWord.nextInt();

        // type word E V
        Dictionary dic = new Dictionary();
        dic.typeWord(countWord);
    }

    // Insert from file
    public void insertFromFile() {
        try {
            File inFile = new File("sourceEV.txt");
            FileReader fileReader = new FileReader(inFile);

            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;
            while ((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    // Lookup word E-V
    public void dictionaryLookup() {

    }
}
