public class Book{
    static int totalNoOfBooks;
    String author;
    String title;
    boolean isBorrowed;
    static {
        totalNoOfBooks=0;
    }
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    Book(String isbn){
        this("Unknown","Unknown");
    }
    static  int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else{
        this.isBorrowed=true;
        System.out.println("Enjoy "+this.title+" and other is "+this.author);
        }
    }
    void returnBook(){
        if(isBorrowed){
        this.isBorrowed=false;
        System.out.println("Hope you enjoyed, please leave a review");
        }else{
            System.out.println("this book is already in the library");
        }
    }
    public static void main(String[] args) {
        Book designOfThigs=new Book("Design","Style");
        Book myBook=new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThigs.borrowBook();
        myBook.borrowBook();
        designOfThigs.borrowBook();
        designOfThigs.returnBook();
    }
}