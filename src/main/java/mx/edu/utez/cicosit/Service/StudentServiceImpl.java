package mx.edu.utez.cicosit.Service;

import mx.edu.utez.cicosit.Model.Student;
import mx.edu.utez.cicosit.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepo studentRepository;

    @Override

    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }


}
