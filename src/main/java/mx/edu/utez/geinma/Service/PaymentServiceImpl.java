package mx.edu.utez.geinma.Service;

import mx.edu.utez.geinma.Model.Payment;
import mx.edu.utez.geinma.Repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentRepo paymentRepository;

    @Override

    public Iterable<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override

    public Optional<Payment> findById(Long id) {
        return paymentRepository.findById(id);
    }

    @Override

    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override

    public void deleteById(Long id) {
        paymentRepository.deleteById(id);
    }

}
