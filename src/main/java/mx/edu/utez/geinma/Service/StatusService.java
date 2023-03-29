package mx.edu.utez.geinma.Service;



import mx.edu.utez.geinma.Model.Status;

import java.util.Optional;

public interface StatusService {
    public Iterable<Status> findAll();
    public Optional<Status> findById(Long id);
    public Status save(Status status);
    public void deleteById(Long id);
}
