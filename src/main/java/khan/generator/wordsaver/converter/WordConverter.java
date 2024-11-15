package khan.generator.wordsaver.converter;

import khan.generator.wordsaver.dto.requestDto.RequestWordDto;
import khan.generator.wordsaver.dto.responseDto.ResponseWordDto;
import khan.generator.wordsaver.entity.Word;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface WordConverter {
    Word convert(RequestWordDto requestWordDto);
    ResponseWordDto convert(Word word);
}
