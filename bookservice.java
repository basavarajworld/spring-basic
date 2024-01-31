package com.example.mslabspringboottest.service;

import com.example.mslabspringboottest.model.book;
import org.springframework.stereotype.Service;
import com.example.mslabspringboottest.repository.bookrepository;

import java.util.List;

@Service
public class bookservice {

    //crud:create,delete,update
    private final bookrepository bookrepo;

    public bookservice(bookrepository bookrepo) {
        this.bookrepo = bookrepo;
    }

    public List<book> getall()
    {
        return bookrepo.findAll();
    }

    public book getbook(String Id)
    {
        return bookrepo.findById(Id).orElse(null);
    }

    public book create(book bk)
    {
        return bookrepo.save(bk);
    }

    public void delete(String id)
    {
        bookrepo.deleteById(id);
    }

    public book update(book bk,String id)
    {
        book b2=bookrepo.findById(id).get();
//        b2.setBookauthor(bk.getBookauthor());
        b2.setBookname(bk.getBookname());
        b2.setBookauthor(bk.getBookauthor());
        bookrepo.save(b2);
        return b2;
    }

    public void deleteall(){
        bookrepo.deleteAll();
    }
}
