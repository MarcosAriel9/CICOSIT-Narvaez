package mx.edu.utez.geinma.Service;

import mx.edu.utez.geinma.Model.Admin;

import java.util.Optional;

public interface AdminService {

    public Iterable<Admin> findAll();
    public Optional<Admin> findById(Long id);
    public Admin save(Admin admin);
    public void deleteById(Long id);
}
