package khan.generator.wordsaver.service;

import khan.generator.wordsaver.converter.WordConverter;
import khan.generator.wordsaver.dto.requestDto.RequestWordDto;
import khan.generator.wordsaver.dto.responseDto.ResponseWordDto;
import khan.generator.wordsaver.entity.Word;
import khan.generator.wordsaver.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class WordServiceImpl implements WordService {

    private final WordRepository wordRepository;
    private final WordConverter wordConverter;

    /**
     * Метод предназначенный для сохранения строк в бд
     * @param request принимает запрос
     * @return ResponseWordDto
     */
    @Override
    @Transactional
    public ResponseWordDto saveWord(RequestWordDto request) {
        Word word = wordConverter.convert(request);
        wordRepository.save(word);
        log.info("Сущность была успешно сохранена");
        return wordConverter.convert(word);
    }

}
