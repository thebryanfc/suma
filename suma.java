import java.util.Scanner;
public class suma {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int a=0,b=0,c=0;

        System.out.println("dame un numero");
        a=l.nextInt();
        System.out.println("dame un numero");
        b=l.nextInt();
        c=a+b;
        System.out.println("este es su resultado " +c);
    }
}