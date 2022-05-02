package site.metacoding.machinetest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.machinetest.domain.Weather;
import site.metacoding.machinetest.domain.WeatherRepository;

@RequiredArgsConstructor
@RestController
public class WeatherApiController {

    private final WeatherService weatherService;
    private final WeatherRepository weatherRepository;

    @GetMapping("/")
    public ResponseDto<?> download() {
        List<Weather> weatherEntity = weatherService.다운로드();
        return new ResponseDto<>(1, "성공", weatherEntity);
    }

    @GetMapping("/weather/show")

    public ResponseDto<?> main() {
        List<Weather> weatherEntity = weatherRepository.findAll();
        System.out.println(weatherEntity);

        return new ResponseDto<>(1, "성공", weatherEntity);
    }
}
