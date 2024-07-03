package entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Activity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "uuid", nullable = false, length = -1)
    private String uuid;
    @Basic
    @Column(name = "activated", nullable = false)
    private Short activated;
    @Basic
    @Column(name = "user_id", nullable = true)
    private Long userId;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return Objects.equals(id, activity.id) && Objects.equals(uuid, activity.uuid) && Objects.equals(activated, activity.activated) && Objects.equals(userId, activity.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uuid, activated, userId);
    }
}
