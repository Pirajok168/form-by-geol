package data.entities;

import lombok.*;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "drilling_line")
public class DrillingLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title")
    private String title;

    //@Lob
    @Column(name = "description",length = 10000)
    private String description;

    @OneToMany(mappedBy = "drillingLine", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @ToString.Exclude
    private Set<Borehole> boreholes = new LinkedHashSet<>();

/* @OneToMany(mappedBy = "drillingLine", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @ToString.Exclude
    private Set<Borehole> boreholes = new LinkedHashSet<>();*/
}