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
@Table(name = "protocol")
public class Protocol {
    @Id
    @Column(name = "id",nullable = false)
    Long id;

    @Column(name = "protocolname",nullable = false,unique = true)
    String protocolName;

    @Column(name = "sponzor",nullable = false)
    String sponzorName;

    @Override
    public String toString() {
        return "Protocol{" +
                "id=" + id +
                ", protocolName='" + protocolName + '\'' +
                ", sponzorName='" + sponzorName + '\'' +
                '}';
    }
}
