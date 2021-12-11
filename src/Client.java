import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
           MyInterface service = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
           Scanner s = new Scanner(System.in);
           String ch = s.nextLine();
           System.out.println(service.reverse(ch));
           ch= s.nextLine();
           System.out.println(service.minChar(ch));
           ch= scanner.nextLine();
           System.out.println(service.upperLower(ch));
           scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
