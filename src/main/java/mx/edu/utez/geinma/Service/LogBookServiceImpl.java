package mx.edu.utez.geinma.Service;

import mx.edu.utez.geinma.Model.LogBook;
import mx.edu.utez.geinma.Repository.LogBookRepo;
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
