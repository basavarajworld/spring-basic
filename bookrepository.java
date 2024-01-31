package com.example.mslabspringboottest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.mslabspringboottest.model.book;
@Repository
public interface bookrepository extends JpaRepository<book,String> {

}
