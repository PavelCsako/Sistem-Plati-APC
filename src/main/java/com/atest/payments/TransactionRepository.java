package com.atest.payments;

import org.springframework.data.jpa.repository.JpaRepository;

// Acest fisier stie automat sa faca operatiuni de salvare, stergere, cautare in baza de date
public interface TransactionRepository extends JpaRepository<TransactionRecord, Long> {
}