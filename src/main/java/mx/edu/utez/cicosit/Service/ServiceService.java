package mx.edu.utez.cicosit.Service;


import mx.edu.utez.cicosit.Model.Service;

import java.util.Optional;

public interface ServiceService {
    public Iterable<Service> findAll();
    public Optional<Service> findById(Long id);
    public Service save(Service service);
    public void deleteById(Long id);
}
