import java.awt.print.Book;

public class BookStackADT {
    private book[] booksArray;
    private int top;

    public BookStackADT(int totalBooks)
    {
        booksArray = new book[totalBooks];
        top = -1;
    }

    void display()
    {
        for (book book1 : booksArray) {
            if(book1 != null)
            {
                System.out.println(book1.getBookName());
            }
        }
    }

    public void push(book book1)
    {
        if(top != booksArray.length - 1)
        {
            top++;
            booksArray[top] = book1;
        }
    }

    public book pop()
    {
        book temp =null;
        if(top != -1)
        {
            temp = booksArray[top];
            top--;
        }
        return temp;
    }

    public static void main(String[] args) {
        BookStackADT stack = new BookStackADT(10);
        stack.display();
        book book1 = new book();
        book1.setBookAuthor("DB");
        book1.setBookEdition(2);
        book1.setBookName("Data Structures");
        stack.push(book1);
        System.out.println(stack.pop() + " is removed");
    }

}

class book
{
    private String BookName;
    private String BookAuthor;
    private int BookEdition;
    private double BookPrice;

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public int getBookEdition() {
        return BookEdition;
    }

    public void setBookEdition(int bookEdition) {
        BookEdition = bookEdition;
    }

    public double getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(double bookPrice) {
        BookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return ("(" + BookName + ", " + BookAuthor + ", " + BookEdition + ", " + BookPrice + ")");
    }
}
