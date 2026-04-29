package com.nexus.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "activities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Activity {

    @Id
    private String id;

    private String title;
    private String category;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    private String shortDesc;
    private String schedule;
    private String venue;
    private String instructor;
    private int capacity;
    private int enrolled;
    
    private String startDate;
    private String endDate;
    private String image;

    @ElementCollection
    @CollectionTable(name = "activity_tags", joinColumns = @JoinColumn(name = "activity_id"))
    @Column(name = "tag")
    private List<String> tags;

    private String status;
    private boolean featured;
}
