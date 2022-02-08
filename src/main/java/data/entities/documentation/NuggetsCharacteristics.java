package data.entities.documentation;

import lombok.*;

import javax.persistence.*;
/**
 * @apiNote Четвертый лист: таблица характеристик самородков
 */
@Getter
@Setter
@ToString
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nuggets_characteristics")
public class NuggetsCharacteristics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String table2_1_0;
    private String table2_1_1;
    private String table2_1_2;
    private String table2_1_3;
    private String table2_1_4;
    private String table2_2_0;
    private String table2_2_1;
    private String table2_2_2;
    private String table2_2_3;
    private String table2_2_4;
    private String table2_3_0;
    private String table2_3_1;
    private String table2_3_2;
    private String table2_3_3;
    private String table2_3_4;
    private String table2_4_0;
    private String table2_4_1;
    private String table2_4_2;
    private String table2_4_3;
    private String table2_4_4;
}