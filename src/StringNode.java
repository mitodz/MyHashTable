class StringNode {
    private String word;
    private StringNode next;
    private boolean isFirst = true;


    public StringNode() {
    }

    public StringNode(String word) {
        this.word = word;
    }

    public StringNode(String word, StringNode next) {
        this.word = word;
        this.next = next;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public String getWord() {
        return word;
    }

    public boolean isLast() {
        return next == null;
    }

    public boolean isEmpty() {
        return word == null;
    }

    public void setNext(StringNode next) {
        this.next = next;
    }

    public void setLast() {
        this.next = null;
    }

    public StringNode getNext() {
        return next;
    }

    public void setFirstOrNot(boolean first) {
        isFirst = first;
    }
}
