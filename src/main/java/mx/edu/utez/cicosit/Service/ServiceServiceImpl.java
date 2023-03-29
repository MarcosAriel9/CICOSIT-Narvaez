package mx.edu.utez.cicosit.Service;

import mx.edu.utez.cicosit.Repository.ServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepo serviceRepository;

    @Override

    public Iterable<mx.edu.utez.cicosit.Model.Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override

    public Optional<mx.edu.utez.cicosit.Model.Service> findById(Long id) {
        return serviceRepository.findById(id);
    }

    @Override

    public mx.edu.utez.cicosit.Model.Service save(mx.edu.utez.cicosit.Model.Service service) {
        return serviceRepository.save(service);
    }

    @Override

    public void deleteById(Long id) {
        serviceRepository.deleteById(id);
    }


}
