package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.Objects;

@Entity
@Table(name = "category", schema = "todolist", catalog = "postgres")
@NoArgsConstructor
@Getter
@Setter
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Category {
    @Basic
    @Column(name = "title", nullable = false, length = -1)
    private String title;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id") //по каким полям связаны эти два объекта foreign key
    private UserData userData;

    @Basic
    @Column(name = "completed_count", updatable = false)
    //поле не будет обновляться (высчитывается автоматически в триггерах)
    private Long completedCount;

    @Basic
    @Column(name = "uncompleted_count", updatable = false)
    private Long uncompletedCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return title;
    }
}
