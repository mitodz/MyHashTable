class MyHash {
    private int p = 1_000_000_007;
    private int x = 263;
    private int m; //размер массива
    private StringNode[] words;

    public MyHash(int m) {
        words = new StringNode[m];
        this.m = m;
    }

    public int getHash(String word) {
        long result = 0;
        for (int i = 0; i < word.length(); i++) {
            result = (result + word.charAt(i) * ((long) Math.pow(x, i) % p)) % p;
        }
        return (int) (result) % m;
    }

    public void add(String word) {
        int hash = getHash(word);
        if (words[hash] == null) {
            words[hash] = new StringNode(word);
        } else if (find(word, words[hash]).equals("no")) {
            words[hash] = new StringNode(word, words[hash]);
        }
    }

    public void del(String word) {
        int hash = getHash(word);
        if (words[hash] == null) return;
        del(word, words[hash], hash);
    }

    public void del(String word, StringNode words, int hash) {
        if (words.isLast()) {
            if (words.getWord().equals(word)) {
                this.words[hash] = null;
            }
        } else if (words.getNext().getWord().equals(word)) {
            words.setNext(null);
        } else {
            del(word, words.getNext(), hash);
        }
    }

    public String find(String word) {
        int hash = getHash(word);
        if (words[hash] == null) return "no";
        return find(word, words[hash]);
    }

    public String find(String word, StringNode words) {
        if (words.getWord().equals(word)) {
            return "yes";
        } else if (!words.isLast()) {
            return find(word, words.getNext());
        }
        return "no";
    }

    public StringNode check(int i) {
        if (words[i] == null) {
            return new StringNode();
        } else return words[i];
    }

    public void printStringNode(StringNode words) {
        if (words.isEmpty()) {
            System.out.println();
        } else {
            System.out.print(words.getWord() + " ");
            if (!words.isLast()) {
                printStringNode(words.getNext());
            }
        }
    }
}
