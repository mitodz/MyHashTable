import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        MyHash book = new MyHash();
        for (int i = 0; i < d; i++) {
            String buf = sc.next();
            switch (buf) {
                case "add":
                    book.add(sc.nextInt(), sc.next());
                    break;
                case "del":
                    book.del(sc.nextInt());
                    break;
                case "find":
                    System.out.println(book.find(sc.nextInt()));
                    break;
            }
        }
    }
}
