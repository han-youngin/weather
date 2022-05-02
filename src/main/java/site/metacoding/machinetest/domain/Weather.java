package site.metacoding.machinetest.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Weather {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(nullable = true)
    private String tm; // 예보시각

    @Column(nullable = true)
    private String thema; // 테마

    @Column(nullable = true)
    private String courseId; // 코스ID

    @Column(nullable = true)
    private String courseAreaId; // 코스 지역ID

    @Column(nullable = true)
    private String courseAreaName; // 코스 지역이름

    @Column(nullable = true)
    private String courseName; // 코스명

    @Column(nullable = true)
    private Integer spotAreaId; // 관광지 지역ID

    @Column(nullable = true)
    private String spotAreaName; // 관광지 지역이름

    @Column(nullable = true)
    private String spotName; // 관광지명

    @Column(nullable = true)
    private Integer th3; // 일 3시간 기온

    @Column(nullable = true)
    private Integer wd; // 풍향

    @Column(nullable = true)
    private Integer ws; // 풍속

    @Column(nullable = true)
    private Integer sky; // 하늘상태

    @Column(nullable = true)
    private Integer rhm; // 습도

    @Column(nullable = true)
    private Integer pop; // 강수확률

    @CreatedDate
    private LocalDateTime createdDate;
    @LastModifiedDate
    private LocalDateTime updateDate;

}
