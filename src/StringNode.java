class StringNode {
    private String word;
    private boolean isLast = true;
    private StringNode next;

    public StringNode(String word) {
        this.word = word;
    }

    public StringNode(String word, StringNode next) {
        this.word = word;
        this.next = next;
        isLast = false;
    }

    public String getWord() {
        return word;
    }

    public boolean isLast() {
        return isLast;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setNext(StringNode next) {
        this.next = next;
        isLast = false;
    }

    public StringNode getNext() {
        return next;
    }
}
