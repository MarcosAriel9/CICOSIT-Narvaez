package mx.edu.utez.cicosit.Service;

import mx.edu.utez.cicosit.Model.LogBook;
import mx.edu.utez.cicosit.Repository.LogBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LogBookServiceImpl implements LogBookService {

    @Autowired
    LogBookRepo logBookRepository;

    @Override

    public Iterable<LogBook> findAll() {
        return logBookRepository.findAll();
    }

    @Override

    public Optional<LogBook> findById(Long id) {
        return logBookRepository.findById(id);
    }

    @Override

    public LogBook save(LogBook logBook) {
        return logBookRepository.save(logBook);
    }

    @Override

    public void deleteById(Long id) {
        logBookRepository.deleteById(id);
    }


}
