package site.metacoding.machinetest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class WeatherController {

    @GetMapping("/main")
    public String main() {
        return "main";
    }

}
