package mx.edu.utez.cicosit.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "window")
public class Window {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_status")
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_time_table")
    private TimeTable timeTable;

    public Window() {
    }

    public Window(long id, String description, Status status, TimeTable timeTable) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.timeTable = timeTable;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TimeTable getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(TimeTable timeTable) {
        this.timeTable = timeTable;
    }





}
