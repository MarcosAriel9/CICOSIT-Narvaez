package mx.edu.utez.cicosit.Repository;

import mx.edu.utez.cicosit.Model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepo extends JpaRepository<Status, Long> {
}
