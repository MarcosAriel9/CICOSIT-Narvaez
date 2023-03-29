package mx.edu.utez.cicosit.Service;

import mx.edu.utez.cicosit.Model.Admin;

import java.util.Optional;

public interface AdminService {

    public Iterable<Admin> findAll();
    public Optional<Admin> findById(Long id);
    public Admin save(Admin admin);
    public void deleteById(Long id);
}
