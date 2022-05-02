package site.metacoding.machinetest.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WeatherDto {

    private String tm; // 예보시각
    private String thema; // 테마
    private String courseId; // 코스ID
    private String courseAreaId; // 코스 지역ID
    private String courseAreaName; // 코스 지역이름
    private String courseName; // 코스명
    private Integer spotAreaId; // 관광지 지역ID
    private String spotAreaName; // 관광지 지역이름
    private String spotName; // 관광지명
    private Integer th3; // 일 3시간 기온
    private Integer wd; // 풍향
    private Integer ws; // 풍속
    private Integer sky; // 하늘상태
    private Integer rhm; // 습도
    private Integer pop; // 강수확률

}
