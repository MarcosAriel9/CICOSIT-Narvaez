package mx.edu.utez.geinma.Repository;

import mx.edu.utez.geinma.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
}
