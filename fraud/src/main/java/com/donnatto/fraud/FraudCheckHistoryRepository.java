package com.donnatto.fraud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory, Integer> {
}
