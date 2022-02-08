package data.entities;

import data.entities.documentation.*;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "borehole")
public class Borehole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title")
    private String title;

    //@Lob
    @Column(name = "description",length = 10000)
    private String description;

   /* @ManyToOne(optional = false)
    @JoinColumn(name = "drilling_line_id", nullable = false)
    private DrillingLine drillingLine;*/

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "summary_id")
    private Summary summary;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "calculation_results_id")
    private CalculationResults calculationResults;

    @OneToMany(mappedBy = "borehole", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @ToString.Exclude
    private Set<LithologicalSection> lithologicalSections = new LinkedHashSet<>();

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "control_table_id")
    private ControlTable controlTable;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "nuggets_characteristics_id")
    private NuggetsCharacteristics nuggetsCharacteristics;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "completed_act_id")
    private CompletedAct completedAct;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "shutdown_act_id")
    private ShutdownAct shutdownAct;

    @ManyToOne(cascade = CascadeType.DETACH, optional = false)
    @JoinColumn(name = "drilling_line_id", nullable = false)
    private DrillingLine drillingLine;

    //region equals and hash code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Borehole borehole = (Borehole) o;
        return id != null && Objects.equals(id, borehole.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
    //endregion
}