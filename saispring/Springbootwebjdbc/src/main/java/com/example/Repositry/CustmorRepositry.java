package com.example.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Custmor;

public interface CustmorRepositry extends JpaRepository<Custmor, Integer> {

}
