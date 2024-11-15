package khan.generator.wordsaver.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

/**
 * Сущность для сохранения строки в бд
 */
@Getter
@Setter
@Entity
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String word;

    @CreationTimestamp
    @Column
    private LocalDateTime saveTime;

    public Word() {
    }
}
