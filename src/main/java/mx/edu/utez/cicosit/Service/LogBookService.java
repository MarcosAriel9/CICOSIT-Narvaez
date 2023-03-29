package mx.edu.utez.cicosit.Service;



import mx.edu.utez.cicosit.Model.LogBook;

import java.util.Optional;

public interface LogBookService {
    public Iterable<LogBook> findAll();
    public Optional<LogBook> findById(Long id);
    public LogBook save(LogBook logBook);
    public void deleteById(Long id);


}
