import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(getResult(sc));
    }

    public static String getResult(Scanner sc) {
        int m = sc.nextInt(); //размер таблицы
        int n = sc.nextInt(); //количество запросов
        MyHash book = new MyHash(m);
        StringBuilder sb = new StringBuilder();
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
                    sb.append(book.find(sc.next()));
                    if (i < n - 1) sb.append("\n");
                    break;
                case "check":
                    StringNode temp = book.check(sc.nextInt());
                    sb.append(book.printStringNode(temp));
                    if (i < n - 1) sb.append("\n");
                    book.flush();
                    break;
            }
        }
        return sb.toString();
    }
}
