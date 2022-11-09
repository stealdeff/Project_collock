import java.util.Scanner;

public class Facade {
    int result;

    public String fake()
    {
        String k;
        System.out.println("Enter correct type of operation(1 or 2)");
        Scanner in = new Scanner(System.in);
        k = in.next();
        if(k!="*"&& k!="+"&& k!="/"&& k!="-") {
            k= fake();
        }
        return k;
    }

    public Facade()
    {
        String k;
        System.out.println("Enter type of the operation(+ || * ||-|| /)");
        Scanner in = new Scanner(System.in);
        k = in.next();
        if(k!="*"&& k!="+"&& k!="/"&& k!="-") {
            k= fake();
        }
        if (k == "+")
        {
            int a, b;
            a = Integer.parseInt(in.next());
            b = Integer.parseInt(in.next());
            result = new Calculator().summ(a, b);
        }
        if(k == "-")
        {
            int a, b;
            a = Integer.parseInt(in.next());
            b = Integer.parseInt(in.next());
            result = new Calculator().minus(a, b);
        }
        if(k == "*")
        {
            int a, b;
            a = Integer.parseInt(in.next());
            b = Integer.parseInt(in.next());
            result = new Calculator().mult(a, b);
        }
        if(k == "/")
        {
            int a, b;
            a = Integer.parseInt(in.next());
            b = Integer.parseInt(in.next());
            result = new Calculator().divide(a, b);
        }
    }
}






