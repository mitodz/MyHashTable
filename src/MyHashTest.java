import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashTest {
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
        String word = "aaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer weaaaaaaaaaaaaaaa sdd sre wew re wr swedrwe werwer wea";
        int actual = new MyHash(17).getHash(word);
        int expected = 0;
        assertEquals(expected, actual);
    }
}