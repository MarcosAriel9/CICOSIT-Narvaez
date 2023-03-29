package mx.edu.utez.geinma.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "enrollment", nullable = false)
    private String enrollment;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;

    @OneToMany(mappedBy = "student")
    private List<Meeting> meetings;

    public Student() {
    }

    public Student(long id, String enrollment, String description, User user, List<Meeting> meetings) {
        this.id = id;
        this.enrollment = enrollment;
        this.description = description;
        this.user = user;
        this.meetings = meetings;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }

}
