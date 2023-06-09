package mx.edu.utez.cicosit.Service;

import mx.edu.utez.cicosit.Model.Person;
import mx.edu.utez.cicosit.Repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImpl  implements PersonService{
    @Autowired
    PersonRepo personRepository;

    @Override
    public Iterable<Person> findAll() {
        return personRepository.findAll();
    }

    @Override

    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }

    @Override

    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }


}
