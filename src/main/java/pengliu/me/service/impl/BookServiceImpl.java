package pengliu.me.service.impl;

import org.springframework.transaction.annotation.Transactional;
import pengliu.me.dao.BookDao;
import pengliu.me.model.BookEntity;
import pengliu.me.service.BookService;

//业务逻辑的实现类
@Transactional
public class BookServiceImpl implements BookService
{
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao)
    {
        this.bookDao = bookDao;
    }

    public int addBook(BookEntity book)
    {
        int ret = (Integer) bookDao.save(book);
//        if(ret > 0)
//        {
//            throw new RuntimeException("test for transational");
//        }
        return ret;
    }

    public BookEntity getBook(Integer id)
    {
        return this.bookDao.get(BookEntity.class, id);
    }
}
