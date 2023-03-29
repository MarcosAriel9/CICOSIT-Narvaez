package mx.edu.utez.geinma.Service;


import mx.edu.utez.geinma.Model.Person;

import java.util.Optional;

public interface PersonService {
    public Iterable<Person> findAll();
    public Optional<Person> findById(Long id);
    public Person save(Person person);
    public void deleteById(Long id);
}
