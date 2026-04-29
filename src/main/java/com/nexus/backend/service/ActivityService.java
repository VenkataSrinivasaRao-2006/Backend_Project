package com.nexus.backend.service;

import com.nexus.backend.entity.Activity;
import com.nexus.backend.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private final ActivityRepository activityRepository;

    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }

    public Optional<Activity> getActivityById(String id) {
        return activityRepository.findById(id);
    }

    public Activity createActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    public void deleteActivity(String id) {
        activityRepository.deleteById(id);
    }

    public List<Activity> getFeaturedActivities() {
        return activityRepository.findByFeaturedTrue();
    }
}
