import java.util.Scanner;

public class DictionaryCommandline {
    DictionaryManagement DM = new DictionaryManagement();

    public void showAllWords() {
        System.out.println("No\t|English\t|Vietnamese");
        for (int i = 0; i < Dictionary.listDictionaries.size(); i++) {
            System.out.println((i + 1) + "\t|" + Dictionary.listDictionaries.get(i).getWord_target()
                    + "\t|" + Dictionary.listDictionaries.get(i).getWork_explain());
        }

    }

    public void dictionaryBasic() {
        DM.insertFromCommandline();
        showAllWords();
    }

    public void DictionaryAdvanced() {
        DM.insertFromFile();
        showAllWords();
        DM.dictionaryLookup();
    }

    public void DictionarySearcher() {
        System.out.println("Enter the word to search: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int lengthWord = line.length();
        if (lengthWord == 1) {
            for (int i = 0; i < Dictionary.listDictionaries.size(); i++) {
                String search = Dictionary.listDictionaries.get(i).getWord_target().substring(0, 1);
                if (line.equals(search)) {
                    System.out.print(Dictionary.listDictionaries.get(i).getWord_target() + "\t");
                }
            }
        }

        if (lengthWord == 2) {
            for (int i = 0; i < Dictionary.listDictionaries.size(); i++) {
                String conditon = Dictionary.listDictionaries.get(i).getWord_target();
                if (conditon.length() >= 2) {
                    String search = Dictionary.listDictionaries.get(i).getWord_target().substring(0,2);
                    if (line.equals(search)) {
                        System.out.print(Dictionary.listDictionaries.get(i).getWord_target() + "\t");
                    }
                }

            }
        }

        if (lengthWord == 3) {
            for (int i = 0; i < Dictionary.listDictionaries.size(); i++) {
                String conditon = Dictionary.listDictionaries.get(i).getWord_target();
                if (conditon.length() >= 3) {
                    String search = Dictionary.listDictionaries.get(i).getWord_target().substring(0, 3);
                    if (line.equals(search)) {
                        System.out.print(Dictionary.listDictionaries.get(i).getWord_target() + "\t");
                    }
                }

            }
        }
        if (lengthWord == 4) {
            for (int i = 0; i < Dictionary.listDictionaries.size(); i++) {
                String conditon = Dictionary.listDictionaries.get(i).getWord_target();
                if (conditon.length() >= 4) {
                    String search = Dictionary.listDictionaries.get(i).getWord_target().substring(0, 4);
                    if (line.equals(search)) {
                        System.out.print(Dictionary.listDictionaries.get(i).getWord_target() + "\t");
                    }
                }

            }
        }

        if (lengthWord == 5) {
            for (int i = 0; i < Dictionary.listDictionaries.size(); i++) {
                String conditon = Dictionary.listDictionaries.get(i).getWord_target();
                if (conditon.length() >= 5) {
                    String search = Dictionary.listDictionaries.get(i).getWord_target().substring(0, 5);
                    if (line.equals(search)) {
                        System.out.print(Dictionary.listDictionaries.get(i).getWord_target() + "\t");
                    }
                }

            }
        }

    }
}
