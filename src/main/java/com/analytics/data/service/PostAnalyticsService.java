package com.analytics.data.service;

import com.analytics.data.dto.CarPostDTO;
import com.analytics.data.entity.BrandAnalyticsEntity;
import org.springframework.stereotype.Service;

@Service
public interface PostAnalyticsService {

    void saveDataAnalytics(CarPostDTO carPostDTO);
}
