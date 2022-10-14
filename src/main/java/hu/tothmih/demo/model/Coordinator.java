package hu.tothmih.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "coordinator")
public class Coordinator {
    @Id
    @Column(name = "id",nullable = false)
    Long id;

    @Column(name = "coordinatorname",nullable = false,unique = true)
    String coordinatorName;

    @Override
    public String toString() {
        return "Coordinator{" +
                "id=" + id +
                ", coordinatorName='" + coordinatorName + '\'' +
                '}';
    }
}
