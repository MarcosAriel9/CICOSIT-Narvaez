package mx.edu.utez.geinma.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToOne(mappedBy = "status")
    private Payment payment;

    @OneToOne(mappedBy = "status")
    private Window window;

    public Status() {
    }

    public Status(long id, String description, Payment payment, Window window) {
        this.id = id;
        this.description = description;
        this.payment = payment;
        this.window = window;
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

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }



}
