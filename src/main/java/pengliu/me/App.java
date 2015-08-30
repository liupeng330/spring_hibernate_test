package pengliu.me;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pengliu.me.dao.BookDao;
import pengliu.me.model.BookEntity;
import pengliu.me.service.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/persistence.xml");
        BookService bookService = (BookService) ctx.getBean("bookService");

        BookEntity book = new BookEntity();
        book.setId(7);
        book.setName("peng book");
        book.setPrice(123.321);

        bookService.addBook(book);
    }
}
