package com.domain.repository;

import com.domain.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

//    1.method--> sql ----> derive query
//    2.sql - @Query
//    3.JPQL - @Query
}
