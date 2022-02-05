package data.entities.documentation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
/**
 * @apiNote Четвертый лист: Акт на остановку скважины
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "shutdown_act")
public class ShutdownAct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String act;
    private String day;
    private String depth;
    private String driller;
    private String geology;
    private String master;
    private String month;
    private String numberAkt;
    private String year;
}