package com.example.swfinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class APIController {
    private final SightRepository sightRepository;
    @Autowired
    private SightService sightService;
    public APIController(SightRepository sightRepository) {
        this.sightRepository = sightRepository;
    }
    @RequestMapping("/SightAPI")
    public List<Sight> find(@RequestParam String zone) {
        try {
            // 根據區域從MongoDB中檢索資料
            return sightService.findByZone(zone);
        } catch (Exception e) {
            System.err.println("查詢時發生錯誤：" + e.getMessage());
            return null;
        }
    }
}
