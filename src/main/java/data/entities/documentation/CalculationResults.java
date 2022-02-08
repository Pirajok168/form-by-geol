package data.entities.documentation;

import lombok.*;

import javax.persistence.*;

/**
 * @apiNote первый лист: таблица, находящаяся сразу под {@link Summary}
 */
@Getter
@Setter
@ToString
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "calculation_results")
public class CalculationResults {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String dressing;
    private String dressing10;
    private String dressing11;
    private String dressing12;
    private String dressing13;
    private String dressing14;
    private String dressing15;
    private String dressing16;
    private String dressing17;
    private String dressing2;
    private String dressing3;
    private String dressing4;
    private String dressing5;
    private String dressing6;
    private String dressing7;
    private String dressing8;
    private String dressing9;
    private String h_сh;
    private String h_сh10;
    private String h_сh11;
    private String h_сh12;
    private String h_сh13;
    private String h_сh14;
    private String h_сh15;
    private String h_сh16;
    private String h_сh17;
    private String h_сh18;
    private String h_сh2;
    private String h_сh3;
    private String h_сh4;
    private String h_сh5;
    private String h_сh6;
    private String h_сh7;
    private String h_сh8;
    private String h_сh9;
    @Column(name = "`limit`")
    private String limit;
    @Column(name = "prob_ai")
    private String probAi;
    private String content;
    private String dressing18;
}