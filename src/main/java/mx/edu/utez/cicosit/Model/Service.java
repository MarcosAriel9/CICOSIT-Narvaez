package mx.edu.utez.cicosit.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "documents", nullable = false)
    private double documents;

@OneToMany(mappedBy = "service")
    private List<Meeting> meetings;

    public Service() {
    }

    public Service(long id, String name, String description, double documents, List<Meeting> meetings) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.documents = documents;
        this.meetings = meetings;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDocuments() {
        return documents;
    }

    public void setDocuments(double documents) {
        this.documents = documents;
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }




}
