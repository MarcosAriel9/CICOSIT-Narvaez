package mx.edu.utez.cicosit.Repository;

import mx.edu.utez.cicosit.Model.LogBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogBookRepo extends JpaRepository<LogBook, Long> {
}
