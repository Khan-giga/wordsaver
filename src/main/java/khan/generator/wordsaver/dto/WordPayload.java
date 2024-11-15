package khan.generator.wordsaver.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Класс для приема строки в json формате
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WordPayload {
    private String word;
}
