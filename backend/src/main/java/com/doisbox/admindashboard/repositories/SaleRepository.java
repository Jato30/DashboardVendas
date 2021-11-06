package com.doisbox.admindashboard.repositories;

import com.doisbox.admindashboard.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    
}
