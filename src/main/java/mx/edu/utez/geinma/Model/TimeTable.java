package mx.edu.utez.geinma.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "timetable")
public class TimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "date", nullable = false)
    private Date date;
    @Column(name = "start_time", nullable = false)
    private Date startTime;
    @Column(name = "end_time", nullable = false)
    private Date endTime;

    @OneToMany(mappedBy = "timeTable")
    private List<Window> windows;

    public TimeTable() {
    }

    public TimeTable(long id, Date date, Date startTime, Date endTime, List<Window> windows) {
        this.id = id;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
          this.windows = windows;
    }

}
