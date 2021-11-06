package com.doisbox.admindashboard.service;

import java.util.List;

import com.doisbox.admindashboard.dto.SaleDTO;
import com.doisbox.admindashboard.dto.SaleSuccessDTO;
import com.doisbox.admindashboard.dto.SaleSumDTO;
import com.doisbox.admindashboard.entities.Sale;
import com.doisbox.admindashboard.repositories.SaleRepository;
import com.doisbox.admindashboard.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll(); // Solução fraca ESPECÍFICA: traz todos pra memória e a jpa faz um cache para não buscar de novo no banco
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
        return repository.amountGroupedBySeller();
    }
    
    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller(){
        return repository.successGroupedBySeller();
    }
    
}
