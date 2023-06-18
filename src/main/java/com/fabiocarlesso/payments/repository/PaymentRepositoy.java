package com.fabiocarlesso.payments.repository;

import com.fabiocarlesso.payments.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepositoy extends JpaRepository<Payment, Long> {
}
