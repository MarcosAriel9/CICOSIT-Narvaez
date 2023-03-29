package mx.edu.utez.geinma.Service;



import mx.edu.utez.geinma.Model.Student;

import java.util.Optional;

public interface StudentService {
    public Iterable<Student> findAll();
    public Optional<Student> findById(Long id);
    public Student save(Student student);
    public void deleteById(Long id);
}
