package khan.generator.wordsaver.repository;

import khan.generator.wordsaver.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {
}
