class StringNode {
    private String word;
    private StringNode next;

    public StringNode(String word) {
        this.word = word;
    }

    public StringNode(String word, StringNode next) {
        this.word = word;
        this.next = next;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setNext(StringNode next) {
        this.next = next;
    }
}
