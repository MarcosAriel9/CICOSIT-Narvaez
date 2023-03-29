package mx.edu.utez.cicosit.Service;



import mx.edu.utez.cicosit.Model.Student;

import java.util.Optional;

public interface StudentService {
    public Iterable<Student> findAll();
    public Optional<Student> findById(Long id);
    public Student save(Student student);
    public void deleteById(Long id);
}
