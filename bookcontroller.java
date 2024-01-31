package com.example.mslabspringboottest.controller;


import com.example.mslabspringboottest.model.book;
import com.example.mslabspringboottest.service.bookservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class bookcontroller {

    private bookservice bs;

    public bookcontroller(bookservice bs) {
        this.bs = bs;
    }

    @GetMapping("/getall")
    public List<book> getall(){
        return bs.getall();
    }
    @GetMapping("/get/{id}")
    public book getbook(@PathVariable String id){
        return bs.getbook(id);
    }
    @PostMapping("/create")
    public book createbk(@RequestBody book bk){
        return bs.create(bk);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id){
        bs.delete(id);
        return "Book deleted";
    }
    @PutMapping("/update/{bookid}")
    public book update(@RequestBody book nbk,@PathVariable String id){
        return bs.update(nbk,id);
    }
    @DeleteMapping("/deleteall")
    public String deleteall(){
        bs.deleteall();
        return "Deleted all files";
    }

}
