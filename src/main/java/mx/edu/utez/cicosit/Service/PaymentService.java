package mx.edu.utez.cicosit.Service;


import mx.edu.utez.cicosit.Model.Payment;

import java.util.Optional;

public interface PaymentService {
    public Iterable<Payment> findAll();
    public Optional<Payment> findById(Long id);
    public Payment save(Payment payment);
    public void deleteById(Long id);
}
