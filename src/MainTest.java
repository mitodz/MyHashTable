import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getResult1() {
        Scanner sc = new Scanner("5\n" +
                "12\n" +
                "add world\n" +
                "add HellO\n" +
                "check 4\n" +
                "find World\n" +
                "find world\n" +
                "del world\n" +
                "check 4\n" +
                "del HellO\n" +
                "add luck\n" +
                "add GooD\n" +
                "check 2\n" +
                "del good");
        String actual = new Main().getResult(sc);
        String expected = "HellO world \n" +
                "no\n" +
                "yes\n" +
                "HellO \n" +
                "GooD luck ";
        assertEquals(expected,actual);
    }

    @Test
    void getResult2() {
        Scanner sc = new Scanner("4\n" +
                "8\n" +
                "add test\n" +
                "add test\n" +
                "find test\n" +
                "del test\n" +
                "find test\n" +
                "find Test\n" +
                "add Test\n" +
                "find Test");
        String actual = new Main().getResult(sc);
        String expected = "yes\n" +
                "no\n" +
                "no\n" +
                "yes";
        assertEquals(expected,actual);
    }

    @Test
    void getResult3() {
        Scanner sc = new Scanner("3\n" +
                "12\n" +
                "check 0\n" +
                "find help\n" +
                "add help\n" +
                "add del\n" +
                "add add\n" +
                "find add\n" +
                "find del\n" +
                "del del\n" +
                "find del\n" +
                "check 0\n" +
                "check 1\n" +
                "check 2");
        String actual = new Main().getResult(sc);
        String expected = "\n" +
                "no\n" +
                "yes\n" +
                "yes\n" +
                "no\n" +
                "\n" +
                "add help \n";
        assertEquals(expected,actual);
    }

    @Test
    void getResult4() {
        Scanner sc = new Scanner("4\n" +
                "8\n" +
                "add test\n" +
                "del test\n" +
                "find test\n" +
                "del test\n" +
                "find test\n" +
                "find Test\n" +
                "add Test\n" +
                "check 0\n"+
                "check 1");
        String actual = new Main().getResult(sc);
        String expected = "no\n" +
                "no\n" +
                "no\n" +
                "Test \n";
        assertEquals(expected,actual);
    }

}