package mx.edu.utez.geinma.Service;



import mx.edu.utez.geinma.Model.LogBook;

import java.util.Optional;

public interface LogBookService {
    public Iterable<LogBook> findAll();
    public Optional<LogBook> findById(Long id);
    public LogBook save(LogBook logBook);
    public void deleteById(Long id);


}
