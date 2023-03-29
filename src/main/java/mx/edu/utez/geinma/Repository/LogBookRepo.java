package mx.edu.utez.geinma.Repository;

import mx.edu.utez.geinma.Model.LogBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogBookRepo extends JpaRepository<LogBook, Long> {
}
