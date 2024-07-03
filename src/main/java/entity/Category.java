package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Category {
    @Basic
    @Column(name = "title", nullable = false, length = -1)
    private String title;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "user_id", nullable = false)
    private Long userId;
    @Basic
    @Column(name = "completed_count", nullable = true)
    private Long completedCount;
    @Basic
    @Column(name = "uncompleted_count", nullable = true)
    private Long uncompletedCount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCompletedCount() {
        return completedCount;
    }

    public void setCompletedCount(Long completedCount) {
        this.completedCount = completedCount;
    }

    public Long getUncompletedCount() {
        return uncompletedCount;
    }

    public void setUncompletedCount(Long uncompletedCount) {
        this.uncompletedCount = uncompletedCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(title, category.title) && Objects.equals(id, category.id) && Objects.equals(userId, category.userId) && Objects.equals(completedCount, category.completedCount) && Objects.equals(uncompletedCount, category.uncompletedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, id, userId, completedCount, uncompletedCount);
    }
}
