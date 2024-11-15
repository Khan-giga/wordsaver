package khan.generator.wordsaver.service.listeners;

import khan.generator.wordsaver.dto.requestDto.RequestWordDto;
import khan.generator.wordsaver.dto.WordPayload;
import khan.generator.wordsaver.service.WordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ConsumerService {

    private final WordService wordService;

    /**
     * Консьюмер для считывания сообщений из топика
     * @param wordPayload принимает данный параметр для дальнейшего сохранения в бд
     */
    @KafkaListener(topics = "words-topic", groupId = "my-consumer-group")
    public void consumer(WordPayload wordPayload) {
        RequestWordDto requestWordDto = new RequestWordDto(wordPayload.getWord());
        wordService.saveWord(requestWordDto);
        log.info("Было прочитано сообщение из кафки, и сохранено в бд");
    }

}
