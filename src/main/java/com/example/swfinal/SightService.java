package com.example.swfinal;

import java.util.List;

public interface SightService {
    List<Sight> findByZone(String zone);
}
