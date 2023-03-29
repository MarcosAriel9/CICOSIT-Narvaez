package mx.edu.utez.cicosit.Repository;

import mx.edu.utez.cicosit.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
}
