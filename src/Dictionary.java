import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
    public static ArrayList<Word> listDictionaries = new ArrayList<Word>();



    // type new word E and V
    public void typeWord(int countWord){
        for(int i=0;i<countWord;i++){
            Word w = new Word();
            Scanner sc1 = new Scanner(System.in);
            String wordE = sc1.nextLine();
            w.setWord_target(wordE);
            Scanner sc2 = new Scanner(System.in);
            String wordV = sc2.nextLine();
            w.setWork_explain(wordV);
            listDictionaries.add(w);
        }
    }


}
