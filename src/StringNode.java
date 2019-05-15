class StringNode {
    private String word;
    private boolean isLast = true;
    private boolean isEmpty = true;
    private StringNode next;

    public StringNode() {
    }

    public StringNode(String word) {
        this.word = word;
        isEmpty = false;
    }

    public StringNode(String word, StringNode next) {
        this.word = word;
        this.next = next;
        isLast = false;
        isEmpty = false;
    }

    public String getWord() {
        return word;
    }

    public boolean isLast() {
        return isLast;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setNext(StringNode next) {
        this.next = next;
        if (next == null) isLast = true;
    }

    public StringNode getNext() {
        return next;
    }
}
