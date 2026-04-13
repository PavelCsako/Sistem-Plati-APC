package com.atest.payments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class PaymentService {

    @Autowired
    private TransactionRepository repository;

    // @Async trimite aceasta metoda pe un Thread separat, in fundal
    @Async
    public CompletableFuture<String> processPaymentAsync(PaymentRequest payment, String maskedCard) throws InterruptedException {

        // Printam in consola sa vedem pe ce fir de executie suntem
        System.out.println("⏳ [Thread: " + Thread.currentThread().getName() + "] Trimit datele catre Visa/Mastercard pentru " + payment.getAmount() + "...");

        // Simulam o intarziere a retelei de 3 secunde
        Thread.sleep(3000);

        // Dupa salvam in baza de date
        TransactionRecord record = new TransactionRecord();
        record.setAmount(payment.getAmount());
        record.setCurrency(payment.getCurrency());
        record.setMaskedCard(maskedCard);
        record.setDestinationBank(payment.getDestinationBank());
        java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        record.setTimestamp(java.time.LocalDateTime.now().format(dtf));
        record.setStatus("APPROVED");
        repository.save(record);

        System.out.println("✅ [Thread: " + Thread.currentThread().getName() + "] Plata salvata cu succes in baza de date!");

        String response = "✅ Tranzacție aprobată și SALVATĂ în DB! S-au procesat " + payment.getAmount() + " " + payment.getCurrency() + " de pe cardul " + maskedCard;

        // Returnam raspunsul catre Controller
        return CompletableFuture.completedFuture(response);
    }
}