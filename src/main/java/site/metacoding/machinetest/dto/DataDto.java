package site.metacoding.machinetest.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DataDto {
    private DataDto dataDto;
    private Integer currentCount;
    private List<WeatherDto> data;
}
