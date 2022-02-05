package data.entities.documentation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * @apiNote Четвертый лист: таблица контроля
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "control_table")
public class ControlTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String table1_1_0;
    private String table1_1_1;
    private String table1_1_2;
    private String table1_2_0;
    private String table1_2_1;
    private String table1_2_2;
}