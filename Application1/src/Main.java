//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  Book book= new Book("Harry Potter",400,"Rowling","Can");
  book.pageSize();
  book.setNumberOfPage(500);
        System.out.println( book.getNumberOfPage());

    }
}