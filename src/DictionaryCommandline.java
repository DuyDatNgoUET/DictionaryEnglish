public class DictionaryCommandline {
    DictionaryManagement DM = new DictionaryManagement();

    public void showAllWords() {
        System.out.println("No\t|English\t|Vietnamese");
        for (int i = 0; i < Dictionary.listDictionaries.size(); i++) {
            System.out.println((i+1)+"\t|"+Dictionary.listDictionaries.get(i).getWord_target()
                    +"\t|"+Dictionary.listDictionaries.get(i).getWork_explain());
        }

    }

    public void dictionaryBasic() {
        DM.insertFromCommandline();
        showAllWords();
    }
}
