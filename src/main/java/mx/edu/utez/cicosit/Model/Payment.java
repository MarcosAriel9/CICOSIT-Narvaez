package mx.edu.utez.cicosit.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "amount", nullable = false)
    private double amount;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_status")
    private Status status;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_meeting")
    private Meeting meeting;

    public Payment() {
    }

    public Payment(long id, double amount, Date date, String description, Meeting meeting, Status status) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.meeting = meeting;
        this.status = status;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }



}
