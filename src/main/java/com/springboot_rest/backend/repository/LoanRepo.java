package com.springboot_rest.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot_rest.backend.model.LoanApp;

//jparepository-crud
@Repository
public interface LoanRepo extends JpaRepository<LoanApp, Long>{

}

