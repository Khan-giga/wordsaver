package khan.generator.wordsaver.dto.responseDto;

import khan.generator.wordsaver.entity.Word;

import java.time.LocalDateTime;

/**
 * DTO for {@link Word}
 */
public record ResponseWordDto(Long id, String word, LocalDateTime saveTime) {
}