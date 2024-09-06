package com.example.swfinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SightServiceImplement implements SightService{
    @Autowired
    private SightRepository sightRepository;
    @Override
    public List<Sight> findByZone(String zone){
        return sightRepository.findByZone(zone);
    };

}
