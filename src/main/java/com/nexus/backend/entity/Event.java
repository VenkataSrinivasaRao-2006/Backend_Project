package com.nexus.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "events")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    private String id;

    private String title;
    private String date;
    private String time;
    private String venue;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    private String category;
    private String image;
}
