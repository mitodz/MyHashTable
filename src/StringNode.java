class StringNode {
    private String word;
    private StringNode next;
    private boolean isFirst;

    public StringNode() {
    }

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

    public boolean isLast() {
        return next==null;
    }

    public boolean isEmpty() {
        return word==null;
    }

    public void setNext(StringNode next) {
        this.next = next;
    }

    public StringNode getNext() {
        return next;
    }
}
