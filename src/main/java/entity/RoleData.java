package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "role_data", schema = "todolist", catalog = "postgres")
public class RoleData {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "name", nullable = false, length = -1)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleData roleData = (RoleData) o;
        return Objects.equals(id, roleData.id) && Objects.equals(name, roleData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
