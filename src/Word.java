public class Word {
    String word_target;
    String work_explain;

    public Word() {
    }

    public Word(String word_target, String work_explain) {
        this.word_target = word_target;
        this.work_explain = work_explain;
    }

    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWork_explain() {
        return work_explain;
    }

    public void setWork_explain(String work_explain) {
        this.work_explain = work_explain;
    }
}
