//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public class JavaApplication5{
        int i;
        {
            i=5;
            System.out.println( i);
        }
        static int m;
        static{
           m=0;
            System.out.println(m);
        }

    }
    public static void main(String[] args) {
      new JavaApplication5();
      new JavaApplication5();
    }
}