package com.nexus.backend.repository;

import com.nexus.backend.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, String> {
    List<Activity> findByCategory(String category);
    List<Activity> findByFeaturedTrue();
}
