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
        int count = 0;
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
                    if (count > 0) sb.append("\n");
                    count++;
                    sb.append(book.find(sc.next()));
                    break;
                case "check":
                    StringNode temp = book.check(sc.nextInt());
                    if (count > 0 || (count==0 && temp.isEmpty())) {
                        sb.append("\n");
                    }
                    sb.append(book.printStringNode(temp));
                    book.flush();
                    count++;
                    break;
            }
        }
        return sb.toString();
    }
}
