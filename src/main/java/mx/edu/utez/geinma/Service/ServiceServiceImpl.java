package mx.edu.utez.geinma.Service;

import mx.edu.utez.geinma.Repository.ServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepo serviceRepository;

    @Override

    public Iterable<mx.edu.utez.geinma.Model.Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override

    public Optional<mx.edu.utez.geinma.Model.Service> findById(Long id) {
        return serviceRepository.findById(id);
    }

    @Override

    public mx.edu.utez.geinma.Model.Service save(mx.edu.utez.geinma.Model.Service service) {
        return serviceRepository.save(service);
    }

    @Override

    public void deleteById(Long id) {
        serviceRepository.deleteById(id);
    }


}
