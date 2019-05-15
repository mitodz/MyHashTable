import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
        int m = sc.nextInt(); //размер таблицы
        int n = sc.nextInt(); //количество запросов
        MyHash book = new MyHash(m);
        for (int i = 0; i < n; i++) {
            String buf = sc.next();
            switch (buf) {
                case "add":
                    book.add(sc.next());
                    break;
                case "del":
                    book.del(sc.next());
                    break;
                case "find":
                    System.out.println(book.find(sc.next()));
                    break;
                case "check":
                    StringNode temp = book.check(sc.nextInt());
                    book.printStringNode(temp);
            }
        }
    }
}
