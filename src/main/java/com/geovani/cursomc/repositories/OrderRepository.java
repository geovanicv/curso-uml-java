package com.geovani.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geovani.cursomc.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{}
