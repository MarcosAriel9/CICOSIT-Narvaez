package mx.edu.utez.geinma.Service;

import mx.edu.utez.geinma.Model.Status;
import mx.edu.utez.geinma.Repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StatusServiceImpl  implements StatusService{
    @Autowired
    StatusRepo statusRepository;

    @Override

    public Iterable<Status> findAll() {
        return statusRepository.findAll();
    }

    @Override

    public Optional<Status> findById(Long id) {
        return statusRepository.findById(id);
    }

    @Override

    public Status save(Status status) {
        return statusRepository.save(status);
    }

    @Override

    public void deleteById(Long id) {
        statusRepository.deleteById(id);
    }

}
