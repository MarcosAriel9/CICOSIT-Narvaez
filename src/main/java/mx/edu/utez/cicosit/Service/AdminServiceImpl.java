package mx.edu.utez.cicosit.Service;

import mx.edu.utez.cicosit.Model.Admin;
import mx.edu.utez.cicosit.Repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminServiceImpl  implements AdminService {

    @Autowired
    AdminRepo adminRepository;

    @Override
    public Iterable<Admin> findAll() {
        return adminRepository.findAll();
    }

    @Override

    public Optional<Admin> findById(Long id) {
        return adminRepository.findById(id);
    }

    @Override

    public Admin save(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override

    public void deleteById(Long id) {
        adminRepository.deleteById(id);
    }


}
