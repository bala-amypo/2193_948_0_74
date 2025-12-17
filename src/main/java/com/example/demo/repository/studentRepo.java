package com.example.demo.repository;

import org.springframework.data.jpa.repository.jpaRepository;
import org.springframework.stereotype.*;
import com.example.demo.entity.studentEntity;

public interface student extends jpaRepository<studentEntity,long>{

}