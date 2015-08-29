package pengliu.me.service.impl;

import pengliu.me.dao.BookDao;
import pengliu.me.model.BookEntity;
import pengliu.me.service.BookService;

//业务逻辑的实现类
public class BookServiceImpl implements BookService
{
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao)
    {
        this.bookDao = bookDao;
    }

    public int addBook(BookEntity book)
    {
        return (Integer) bookDao.save(book);
    }
}
