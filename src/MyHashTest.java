import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashTest {
    private int p = 1_000_000_007;
    private int x = 263;
    private int m = 25; //размер массива

    @Test
    void getHash1() {
        String word = "qaxndhusptgrewo";
        int actual = new MyHash(m).getHash(word);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void getHash2() {
        String word = "uiljkwhypgmfdst";
        int actual = new MyHash(m * 10).getHash(word);
        int expected = 72;
        assertEquals(expected, actual);
    }

    @Test
    void getHash3() {
        String word = "pweiknqgcxazjyh";
        int actual = new MyHash(m * 100).getHash(word);
        int expected = 263;
        assertEquals(expected, actual);
    }

    @Test
    void getHash4() {
        String word = "ilvpygszwdeurjn";
        int actual = new MyHash(m * 1000).getHash(word);
        int expected = 9134;
        assertEquals(expected, actual);
    }

    @Test
    void getHash5() {
        String word = "xnzrvwcutfgbqje";
        int actual = new MyHash(m * 10000).getHash(word);
        int expected = 170995;
        assertEquals(expected, actual);
    }

    @Test
    void getHash6() {
        String word = "kxlcfgpezjmuynv";
        int actual = new MyHash(m * 10000000).getHash(word);
        int expected = 127141737;
        assertEquals(expected, actual);
    }

    @Test
    void getHash7() {
        String word = "aaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa " +
                "sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe " +
                "werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd " +
                "sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer " +
                "weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew " +
                "re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa " +
                "sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer " +
                "weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re " +
                "wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa " +
                "sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa s" +
                "dd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer " +
                "weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr " +
                "swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd " +
                "sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaa" +
                "aaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swe" +
                "drwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd s" +
                "re wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaa" +
                "aaaaaaaaaaa sdd sre wew re wr swedrwe werwer wea";
        int actual = new MyHash(17).getHash(word);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void getHash8() {
        String word = "a";
        int actual = new MyHash(17).getHash(word);
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    void getHash9() {
        String word = "aaaaaaa";
        int actual = new MyHash(17).getHash(word);
        int expected = 14;
        assertEquals(expected, actual);
    }

    @Test
    void getHash10() {
        String word = "aaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer wea";
        int actual = new MyHash(17).getHash(word);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void getHash11() {
        String word = "aaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaa" +
                "aaaaaaa sdd sre wew re wr swedrwe werwer wea";
        int actual = new MyHash(17).getHash(word);
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    void getHash12() {
        String word = "aaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer " +
                "weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa" +
                " sdd sre wew re wr swedrwe werwer wea";
        int actual = new MyHash(17).getHash(word);
        int expected = 16;
        assertEquals(expected, actual);
    }

    @Test
    void getHash13() {
        String word = "aaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe " +
                "werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr " +
                "swedrwe werwer wea";
        int actual = new MyHash(17).getHash(word);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void pow1() {
        long actual = new MyHash(m).pow(x, 15, p);
        long expected = 748754383;
        assertEquals(expected, actual);
    }

    @Test
    void pow2() {
        long actual = new MyHash(m).pow(x, 8, p);
        long expected = 310943811;
        assertEquals(expected, actual);
    }

    @Test
    void pow3() {
        long actual = new MyHash(m).pow(x, 1, p);
        long expected = 263;
        assertEquals(expected, actual);
    }

    @Test
    void pow4() {
        long actual = new MyHash(m).pow(x, 0, p);
        long expected = 1;
        assertEquals(expected, actual);
    }
}