package mx.edu.utez.geinma.Service;


import mx.edu.utez.geinma.Model.Payment;

import java.util.Optional;

public interface PaymentService {
    public Iterable<Payment> findAll();
    public Optional<Payment> findById(Long id);
    public Payment save(Payment payment);
    public void deleteById(Long id);
}
