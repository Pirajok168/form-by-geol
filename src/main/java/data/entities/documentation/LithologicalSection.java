package data.entities.documentation;

import data.entities.Borehole;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.*;

/**
 * @apiNote Второй и третий листы:
 * Строка из большой таблицы на 2 листа.
 * В документах идет как таблица на 2-й и 3-й листы
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "lithological_section")
public class LithologicalSection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "desc")
    private String desc;

    @Column(name = "from")
    private String from;

    @Column(name = "to")
    private String to;

    @Column(name = "drilling_dimensions")
    private String drillingDimensions;

    @ManyToMany(cascade = CascadeType.DETACH)
    @JoinTable(name = "lithological_section_lithoCardEntities",
            joinColumns = @JoinColumn(name = "lithologicalSection_id"),
            inverseJoinColumns = @JoinColumn(name = "lithoCardEntities_id"))
    @ToString.Exclude
    private Set<LithoCardEntity> lithoCardEntities = new LinkedHashSet<>();

    @Column(name = "composition_of_the_section")
    private String compositionOfTheSection;

    @Column(name = "category_of_rocks")
    private String categoryOfRocks;

    //хз какое там описание. По фотке ничерта не понял, так что оставил так
    private String _8;
    private String _9;
    private String _10;
    private String _11;
    private String _12;
    private String _13;
    private String _14;
    private String _15;
    private String _16;
    private String _17;
    private String _18;

    @ManyToOne(cascade = CascadeType.DETACH, optional = false)
    @JoinColumn(name = "borehole_id", nullable = false)
    private Borehole borehole;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LithologicalSection that = (LithologicalSection) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}