import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
