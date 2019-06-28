import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {

    Dictionary dic = new Dictionary();

    public void insertFromCommandline() {

        // type amount word
        int countWord;
        Scanner typeCountWord = new Scanner(System.in);
        System.out.print("Number of vocabulary: ");
        countWord = typeCountWord.nextInt();

        // type word E V
        dic.typeWord(countWord);
    }

    // Insert from file
    public void insertFromFile() {
        try {

            File inFile = new File("sourceEV.txt");
            FileReader fileReader = new FileReader(inFile);

            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] output = line.split("\t");
                Word w = new Word();
                w.setWord_target(output[0]);
                w.setWork_explain(output[1]);

                Dictionary.listDictionaries.add(w);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Lookup word E-V
    public void dictionaryLookup() {
        System.out.println("search word : ");
        Scanner sc = new Scanner(System.in);
        String searchWord = sc.nextLine();
        for (int i = 0; i < Dictionary.listDictionaries.size(); i++) {
            if (Dictionary.listDictionaries.get(i).getWord_target().equals(searchWord)) {
                System.out.println(Dictionary.listDictionaries.get(i).getWord_target() + "\t"
                        + Dictionary.listDictionaries.get(i).getWork_explain());
            }
        }
    }

    // Add Word to list
    public void addWord() {
        Word w = new Word();
        Scanner sc1 = new Scanner(System.in);
        String targetWord = sc1.nextLine();
        w.setWord_target(targetWord);
        Scanner sc2 = new Scanner(System.in);
        String explainWord = sc1.nextLine();
        w.setWork_explain(explainWord);
        Dictionary.listDictionaries.add(w);
    }

    // Delete Word in list
    public void deleteWord(String delete) {
        for (int i = 0; i < Dictionary.listDictionaries.size(); i++) {
            if (Dictionary.listDictionaries.get(i).getWord_target().equals(delete)) {
                Dictionary.listDictionaries.remove(i);
            }
        }
    }

    // Change an Word in list
    public void setWord(String changeWord) {
        for (int i = 0; i < Dictionary.listDictionaries.size(); i++) {
            if (Dictionary.listDictionaries.get(i).getWord_target().equals(changeWord)) {
                System.out.print("edit word : ");

                Word w = new Word();
                Scanner sc1 = new Scanner(System.in);
                String targetWord = sc1.nextLine();
                w.setWord_target(targetWord);
                Scanner sc2 = new Scanner(System.in);
                String explainWord = sc1.nextLine();
                w.setWork_explain(explainWord);

                Dictionary.listDictionaries.set(i, w);

            }
        }
    }

    // Export To File
    public void dictionaryExportToFile() {
        try {
            File outFile = new File("sourceEV.txt");
            FileWriter fileWriter = new FileWriter(outFile);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (int i = 0; i < Dictionary.listDictionaries.size(); i++) {
                writer.write(Dictionary.listDictionaries.get(i).getWord_target() + "\t" +
                        Dictionary.listDictionaries.get(i).getWork_explain() + "\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
