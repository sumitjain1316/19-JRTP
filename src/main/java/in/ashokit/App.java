package in.ashokit;


public class App 
{
    public static void main( String[] args )
    {
    	Book book = new Book();
    	book.setBookAuthor("Rod Johnoson");
    	book.setBookId("12345");
    	book.setBookName("Hibernate");
    	book.setBookPrice("400");
    	book.setBookEdition("First");
        System.out.println( "Hello Books Record Updated!!" );
    }
}
