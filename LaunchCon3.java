class Books{
    private String authorName;
    private String bookName;
    private double cost;

    Books(String authorName, String bookName, double cost){
        this(" narayana");
        System.out.println("param constructur");
        this.authorName=authorName;
        this.bookName=bookName;
        this.cost=cost;
    }
    Books(String authorName){
        this();
        System.out.println("one param consturctur");
        this.authorName=authorName;

    }
    Books(){
        System.out.println(" zero param");
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public double getCosst() {
        return cost;
    }
    public void setCosst(double cosst) {
        this.cost = cosst;
    }
    
}

public class LaunchCon3 {
    public static void main(String [] args){
        Books book1= new Books("nithin ", "java book" , 4747.4);
        System.out.println(book1.getAuthorName());
        System.out.println(book1.getBookName());
        System.out.println(book1.getCosst());
        

    }
    
}
