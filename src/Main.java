import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
