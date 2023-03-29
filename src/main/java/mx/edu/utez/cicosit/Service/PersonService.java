package mx.edu.utez.cicosit.Service;


import mx.edu.utez.cicosit.Model.Person;

import java.util.Optional;

public interface PersonService {
    public Iterable<Person> findAll();
    public Optional<Person> findById(Long id);
    public Person save(Person person);
    public void deleteById(Long id);
}
