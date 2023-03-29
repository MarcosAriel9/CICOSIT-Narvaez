package mx.edu.utez.cicosit.Service;



import mx.edu.utez.cicosit.Model.Rol;

import java.util.Optional;

public interface RolService {
    public Iterable<Rol> findAll();
    public Optional<Rol> findById(Long id);
    public Rol save(Rol rol);
    public void deleteById(Long id);
}
