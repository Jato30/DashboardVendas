package com.doisbox.admindashboard.repositories;

import com.doisbox.admindashboard.entities.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    
}
