package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Stat {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "completed_total", nullable = true)
    private Long completedTotal;
    @Basic
    @Column(name = "uncompleted_total", nullable = true)
    private Long uncompletedTotal;
    @Basic
    @Column(name = "user_id", nullable = true)
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompletedTotal() {
        return completedTotal;
    }

    public void setCompletedTotal(Long completedTotal) {
        this.completedTotal = completedTotal;
    }

    public Long getUncompletedTotal() {
        return uncompletedTotal;
    }

    public void setUncompletedTotal(Long uncompletedTotal) {
        this.uncompletedTotal = uncompletedTotal;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stat stat = (Stat) o;
        return Objects.equals(id, stat.id) && Objects.equals(completedTotal, stat.completedTotal) && Objects.equals(uncompletedTotal, stat.uncompletedTotal) && Objects.equals(userId, stat.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, completedTotal, uncompletedTotal, userId);
    }
}
