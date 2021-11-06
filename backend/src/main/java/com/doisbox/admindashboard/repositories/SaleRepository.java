package com.doisbox.admindashboard.repositories;

import java.util.List;

import com.doisbox.admindashboard.dto.SaleSuccessDTO;
import com.doisbox.admindashboard.dto.SaleSumDTO;
import com.doisbox.admindashboard.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.doisbox.admindashboard.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
        + " FROM Sale AS obj GROUP BY obj.seller") // Pode ser SQL. Usando aqui JPQL para mapear entre paradigmas orientado a obj -> relacional
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.doisbox.admindashboard.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
        + " FROM Sale AS obj GROUP BY obj.seller") // Pode ser SQL. Usando aqui JPQL para mapear entre paradigmas orientado a obj -> relacional
    List<SaleSuccessDTO> successGroupedBySeller();
    
}
