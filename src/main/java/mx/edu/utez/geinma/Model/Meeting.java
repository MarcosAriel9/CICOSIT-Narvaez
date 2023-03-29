package mx.edu.utez.geinma.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "meeting")
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "date", nullable = false)
    private Date date;
    @Column(name = "time", nullable = false)
    private Date time;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_status")
    private Status status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_student")
    private Student student;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_service")
    private Service service;
    @OneToMany(mappedBy = "meeting")
    private List<Payment> payments;

    public Meeting() {
    }

    public Meeting(long id, Date date, Date time, Status status, Student student, Service service, List<Payment> payments) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.status = status;
        this.student = student;
        this.service = service;
        this.payments = payments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
