package mx.edu.utez.cicosit.Repository;

import mx.edu.utez.cicosit.Model.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTableRepo extends JpaRepository<TimeTable, Long> {
}
