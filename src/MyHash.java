class MyHash {
    private int p = 1_000_000_007;
    private int x = 263;
    private int m; //размер массива
    private StringNode[] words;

    public MyHash(int m) {
        words = new StringNode[m];
    }

    public int getHash(String word) {
        long result = 0;
        for (int i = 0; i < word.length(); i++) {
            result += (word.charAt(i) * Math.pow(x, i)) % p;
        }
        return (int)(result % m);
    }

    public void add(String word) {
        int hash = getHash(word);
        if ()
    }

    public void del(String word) {
        int hash = getHash(word);
        if (words[hash] == null) return;
        words[hash] = null;
    }

    public String find(String word) {
        int hash = getHash(word);
        if (words[hash] == null) return "no";
        return find(word, words[hash]);
    }

    public String find (String word, StringNode words) {
        if (words.getWord().equals(word)){
            return "yes";
        } else if (!words.isLast()){
            find(word, words.getNext());
        }
        return "no";
    }
}
