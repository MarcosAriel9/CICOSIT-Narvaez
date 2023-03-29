package mx.edu.utez.geinma.Service;



import mx.edu.utez.geinma.Model.TimeTable;

import java.util.Optional;

public interface TimeTableService {
    public Iterable<TimeTable> findAll();
    public Optional<TimeTable> findById(Long id);
    public TimeTable save(TimeTable timeTable);
    public void deleteById(Long id);
}
