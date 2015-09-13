package pengliu.me.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pengliu.me.service.BookService;

import java.util.Map;

@Controller
public class BookController
{
    @Autowired
    private BookService bookService;

    public String showHomePage(Map<String, Object> model)
    {
        model.put("book", bookService.getBook(12));
        return "home";
    }
}
