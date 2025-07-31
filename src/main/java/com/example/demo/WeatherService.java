package com.example.demo;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author chuan
 * @version 1.0
 * @since 2025/5/11
 */
@Service
public class WeatherService {

    @Tool(description = "根据中国城市名（如石家庄、北京、上海）获取天气预报")
    public String getWeather(String cityName) {
        Map<String, String> mockData = Map.of(
                "石家庄", "晴天",
                "邢台", "晴天",
                "邯郸", "微风",
                "承德", "微雨",
                "唐山", "多云",
                "北京", "小雨",
                "上海", "大雨"
        );
        return mockData.getOrDefault(cityName, "抱歉：未查询到对应城市！");
    }
}
