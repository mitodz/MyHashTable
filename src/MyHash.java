class MyHash {
    private int p = 1_000_000_007;
    private int x = 263;
    private int m; //размер массива
    private StringNode[] words;

    public MyHash(int m) {
        words = new StringNode[m];
    }

    public long getHash(String word) {
        long result = 0;
        for (int i = 0; i < word.length(); i++) {
            result += (word.charAt(i) * Math.pow(x, i)) % p;
        }
        return result % m;
    }

    public void add(StringNode word) {
        words[number] = name;
    }

    public void del(int number) {
        if (words[number] == null) return;
        words[number] = null;
    }

    public String find(int number) {
        if (words[number] == null) return "not found";
        return words[number];
    }
}
