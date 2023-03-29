package mx.edu.utez.cicosit.Service;



import mx.edu.utez.cicosit.Model.Status;

import java.util.Optional;

public interface StatusService {
    public Iterable<Status> findAll();
    public Optional<Status> findById(Long id);
    public Status save(Status status);
    public void deleteById(Long id);
}
