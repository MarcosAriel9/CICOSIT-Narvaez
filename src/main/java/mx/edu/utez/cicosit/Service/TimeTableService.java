package mx.edu.utez.cicosit.Service;



import mx.edu.utez.cicosit.Model.TimeTable;

import java.util.Optional;

public interface TimeTableService {
    public Iterable<TimeTable> findAll();
    public Optional<TimeTable> findById(Long id);
    public TimeTable save(TimeTable timeTable);
    public void deleteById(Long id);
}
