package data.entities.documentation;

import data.util.LithoCardClassTypeConverter;
import draw.litho.drawables.ILithoDrawable;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

/**
 * @apiNote Вспомогательный класс, содержит класс карточек отрисовки,
 * таблица связана с {@link LithologicalSection} как множество выбранных пользователем типов для {@link draw.litho.LithoCards}
 * LithoCardClassTypeConverter
 */
@Getter
@Setter
@ToString
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "litho_card_entity")
public class LithoCardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Convert(converter = LithoCardClassTypeConverter.class)
    @Column(name = "litho_card", nullable = false, unique = true)
    private Class<? extends ILithoDrawable> lithoCard;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LithoCardEntity that = (LithoCardEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}