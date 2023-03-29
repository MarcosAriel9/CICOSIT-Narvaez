package mx.edu.utez.geinma.Repository;

import mx.edu.utez.geinma.Model.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTableRepo extends JpaRepository<TimeTable, Long> {
}
