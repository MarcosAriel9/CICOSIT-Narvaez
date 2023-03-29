package mx.edu.utez.cicosit.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "logbook")
public class LogBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "action" , nullable = false)
    private String action;
    @Column(name = "time", nullable = false)
    private Date time;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;

    public LogBook() {
    }

    public LogBook(long id, String action, Date time, User user) {
        this.id = id;
        this.action = action;
        this.time = time;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
