package mx.edu.utez.geinma.Service;

import mx.edu.utez.geinma.Model.Rol;
import mx.edu.utez.geinma.Repository.RolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    RolRepo rolRepository;

    @Override

    public Iterable<Rol> findAll() {
        return rolRepository.findAll();
    }

    @Override

    public Optional<Rol> findById(Long id) {
        return rolRepository.findById(id);
    }

    @Override

    public Rol save(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override

    public void deleteById(Long id) {
        rolRepository.deleteById(id);
    }


}
