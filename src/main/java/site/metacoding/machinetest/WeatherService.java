package site.metacoding.machinetest;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;
import site.metacoding.machinetest.domain.Weather;
import site.metacoding.machinetest.domain.WeatherRepository;
import site.metacoding.machinetest.dto.DataDto;
import site.metacoding.machinetest.dto.WeatherDto;

@RequiredArgsConstructor
@Service
public class WeatherService {
    private final WeatherRepository weatherRepository;

    public List<Weather> 다운로드() {
        List<Weather> weathers = new ArrayList<>();
        List<Weather> weatherEntity = new ArrayList<>();

        String key = "eCazEq%2FCP4iBdrQDcQQrLr3rgUrV%2ByZOFRdwxGTrcfeZbe3FqDvkQ6iMAWgeXRDOa%2FABNLYI3Dhz7hzxyUuI4A%3D%3D";

        StringBuffer sb = new StringBuffer();
        sb.append("http://api.odcloud.kr/api/15007097/v1/uddi:e1cdb81d-44d4-40c1-a8d8-f1b311129a54?");
        sb.append("page=1&");
        sb.append("perPage=10&");
        sb.append("serviceKey=");
        sb.append(key);

        try {
            URI uri = new URI(sb.toString());
            RestTemplate rt = new RestTemplate();

            DataDto response = rt.getForObject(uri, DataDto.class);

            List<WeatherDto> weatherDtos = response.getData();

            for (int i = 0; i < weatherDtos.size(); i++) {
                Weather toWeather = Weather.builder()
                        .tm(weatherDtos.get(i).getTm())
                        .thema(weatherDtos.get(i).getThema())
                        .courseId(weatherDtos.get(i).getCourseId())
                        .courseAreaId(weatherDtos.get(i).getCourseAreaId())
                        .courseAreaName(weatherDtos.get(i).getCourseAreaName())
                        .courseName(weatherDtos.get(i).getCourseName())
                        .spotAreaId(weatherDtos.get(i).getSpotAreaId())
                        .spotAreaName(weatherDtos.get(i).getSpotAreaName())
                        .spotName(weatherDtos.get(i).getSpotName())
                        .th3(weatherDtos.get(i).getTh3())
                        .wd(weatherDtos.get(i).getWd())
                        .ws(weatherDtos.get(i).getWs())
                        .sky(weatherDtos.get(i).getSky())
                        .rhm(weatherDtos.get(i).getRhm())
                        .pop(weatherDtos.get(i).getPop())
                        .build();

                weathers.add(toWeather);

                weatherEntity = weatherRepository.saveAllAndFlush(weathers);

                System.out.println("============" + weatherEntity.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
