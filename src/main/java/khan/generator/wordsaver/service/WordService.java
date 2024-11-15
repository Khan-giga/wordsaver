package khan.generator.wordsaver.service;

import khan.generator.wordsaver.dto.requestDto.RequestWordDto;
import khan.generator.wordsaver.dto.responseDto.ResponseWordDto;

public interface WordService {
    ResponseWordDto saveWord(RequestWordDto request);
}
