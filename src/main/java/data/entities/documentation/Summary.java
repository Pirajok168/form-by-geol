package data.entities.documentation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * @apiNote первый лист: описание скважины
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "summary")
public class Summary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String altitudeMark;
    private String azimuth;
    private String borehole;
    private String casingDepth;
    private String compositionRocks;
    private String coordinates;
    private String distanceFromTheMouth;
    private String distanceFromTheRiverbed;
    private String downUp;
    private String drillingDiameterM;
    private String drillingDiameterMM;
    private String drillingRig;
    private String end;
    private String flushing;
    private String fromTheLine;
    private String fromTheWell;
    private String geologist;
    private String groundFrom;
    private String groundFrom2;
    private String groundTo;
    private String groundTo2;
    private String line;
    private String passed;
    private String passedOrStopped;
    private String permafrostFrom;
    private String permafrostFrom2;
    private String permafrostTo;
    private String permafrostTo2;
    private String region;
    private String rightLeft;
    private String riverValley;
    private String start;
    private String surveyor;
    private String system;
    private String totalDepth;
    private String tributary;
    private String typeOfPlacer;
    private String waterLevel;
    private String waterLevelStop;
}