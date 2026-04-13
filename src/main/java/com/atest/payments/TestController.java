package com.atest.payments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@CrossOrigin // asa interfata va comunica cu serverul
@RestController
public class TestController {

    // Telecomanda pentru a extrage tranzacțiile
    @Autowired
    private TransactionRepository repository;

    // procesează plățile în fundal
    @Autowired
    private PaymentService paymentService;

    // Ruta pentru verificarea statusului
    @GetMapping("/status")
    public String checkStatus() {
        return "✅ Sistemul de plati APC este gata de tranzactii!";
    }

    // Ruta pentru afișarea istoricului
    @GetMapping("/transactions")
    public Iterable<TransactionRecord> getAllTransactions() {
        return repository.findAll();
    }

    // 3. Ruta (asincrona) pentru procesarea unei plăți noi
    @PostMapping("/process")
    public CompletableFuture<String> processPayment(@RequestBody PaymentRequest payment) throws InterruptedException {

        if (payment.getAmount() <= 0) {
            return CompletableFuture.completedFuture("Eroare: Suma tranzactiei trebuie sa fie mai mare decat 0.");
        }

        if (payment.getAmount() > 5000) {
            return CompletableFuture.completedFuture("Eroare: Suma depaseste limita maxima de 5000 RON per tranzactie.");
        }

        if (payment.getCardNumber() == null || payment.getCardNumber().length() != 16) {
            return CompletableFuture.completedFuture("Eroare: Numarul de card este invalid. Trebuie sa contina 16 cifre.");
        }

        String maskedCard = "**** **** **** " + payment.getCardNumber().substring(12);

        return paymentService.processPaymentAsync(payment, maskedCard);
    }
}