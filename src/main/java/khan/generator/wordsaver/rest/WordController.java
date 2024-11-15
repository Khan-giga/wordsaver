package khan.generator.wordsaver.rest;

import khan.generator.wordsaver.dto.requestDto.RequestWordDto;
import khan.generator.wordsaver.dto.responseDto.ResponseWordDto;
import khan.generator.wordsaver.service.WordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class WordController {

    private final WordService wordService;

    @PostMapping("/save")
    public ResponseEntity<ResponseWordDto> saveWord (@RequestBody RequestWordDto requestWordDto) {
        ResponseWordDto responseTextDto = wordService.saveWord(requestWordDto);
        return ok(responseTextDto);
    }

}
