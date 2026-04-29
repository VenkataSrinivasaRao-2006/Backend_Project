// package com.nexus.backend;

// import com.nexus.backend.entity.Activity;
// import com.nexus.backend.entity.Event;
// import com.nexus.backend.entity.Notification;
// import com.nexus.backend.entity.User;
// import com.nexus.backend.repository.ActivityRepository;
// import com.nexus.backend.repository.EventRepository;
// import com.nexus.backend.repository.NotificationRepository;
// import com.nexus.backend.repository.UserRepository;
// import lombok.RequiredArgsConstructor;
// import lombok.extern.slf4j.Slf4j;
// import org.springframework.security.crypto.password.PasswordEncoder;

// @Component
// @RequiredArgsConstructor
// @Slf4j
// public class DataInitializer implements CommandLineRunner {

//     private final ActivityRepository activityRepository;
//     private final EventRepository eventRepository;
//     private final NotificationRepository notificationRepository;
//     private final UserRepository userRepository;
//     private final PasswordEncoder passwordEncoder;

//     @Override
//     public void run(String... args) {
//         if (activityRepository.count() == 0) {
//             log.info("Initializing sample data for activities...");
//             initializeActivities();
//         }

//         if (eventRepository.count() == 0) {
//             log.info("Initializing sample data for events...");
//             initializeEvents();
//         }

//         if (notificationRepository.count() == 0) {
//             log.info("Initializing sample data for notifications...");
//             initializeNotifications();
//         }

//         if (userRepository.count() == 0) {
//             log.info("Initializing sample users...");
//             initializeUsers();
//         }
//     }

//     private void initializeActivities() {
//         Activity act1 = new Activity(
//             "act-001",
//             "Robotics Workshop",
//             "technology",
//             "Learn to build robots from scratch with expert guidance.",
//             "Our most popular workshop! Hands-on learning for all skill levels.",
//             "Mon, Wed 4-6 PM",
//             "Tech Lab 101",
//             "Dr. Arshad",
//             50,
//             12,
//             "2025-11-15",
//             "2025-12-15",
//             "https://images.unsplash.com/photo-1581091226825-a6a2a5aee158?w=800&q=80",
//             Arrays.asList("robotics", "arduino", "coding"),
//             "active",
//             true
//         );

//         Activity act2 = new Activity(
//             "act-002",
//             "Football Practice",
//             "sports",
//             "Weekly football practice and inter-college tournament preparation.",
//             "Join the Nexus Strikers for training and league games.",
//             "Tue, Thu 5-7 PM",
//             "Main Field",
//             "Coach Vikram",
//             30,
//             25,
//             "2025-10-20",
//             "2026-06-15",
//             "https://images.unsplash.com/photo-1574629810360-7efbbe195018?w=800&q=80",
//             Arrays.asList("sports", "football", "team"),
//             "active",
//             false
//         );

//         Activity act3 = new Activity(
//             "act-003",
//             "Photography Society",
//             "arts",
//             "Capture the world through your lens. Monthly photo walks and studio sessions.",
//             "Art and science of photography. Learn manual controls and lighting.",
//             "Sat 10 AM",
//             "Media Suite 204",
//             "Ms. Priya",
//             20,
//             18,
//             "2025-12-01",
//             "2026-05-30",
//             "https://images.unsplash.com/photo-1516035069371-29a1b244cc32?w=800&q=80",
//             Arrays.asList("arts", "photography", "creative"),
//             "active",
//             true
//         );

//         activityRepository.saveAll(Arrays.asList(act1, act2, act3));
//     }

//     private void initializeEvents() {
//         Event e1 = new Event(
//             "evt-001",
//             "Tech Expo 2026",
//             "2026-03-25",
//             "10:00 AM",
//             "Auditorium Blue",
//             "Annual showcase of innovative student projects and tech innovations.",
//             "technology",
//             "https://images.unsplash.com/photo-1505373877841-8d25f7d46678?w=800&q=80"
//         );

//         Event e2 = new Event(
//             "evt-002",
//             "Music Festival",
//             "2026-04-12",
//             "6:00 PM",
//             "Open Air Theater",
//             "A night of acoustic performances and band battles featuring local talent.",
//             "arts",
//             "https://images.unsplash.com/photo-1459749411177-042180ce673f?w=800&q=80"
//         );

//         eventRepository.saveAll(Arrays.asList(e1, e2));
//     }

//     private void initializeNotifications() {
//         Notification n1 = new Notification(
//             "notif-001",
//             "Registration Successful",
//             "You have successfully registered for the Robotics Workshop.",
//             "2 hours ago",
//             false,
//             "success"
//         );

//         Notification n2 = new Notification(
//             "notif-002",
//             "Upcoming Event",
//             "Don't forget the Tech Expo starts tomorrow at 10 AM.",
//             "Yesterday",
//             true,
//             "info"
//         );

//         notificationRepository.saveAll(Arrays.asList(n1, n2));
//     }

//     private void initializeUsers() {
//         User admin = new User(
//             null,
//             "Dr. Rajesh Kumar",
//             "admin@nexus.edu",
//             passwordEncoder.encode("admin123"),
//             "admin"
//         );

//         User student = new User(
//             null,
//             "Rihan",
//             "student@nexus.edu",
//             passwordEncoder.encode("student123"),
//             "student"
//         );

//         userRepository.saveAll(Arrays.asList(admin, student));
//     }
// }

package com.nexus.backend;

import com.nexus.backend.entity.Activity;
import com.nexus.backend.entity.Event;
import com.nexus.backend.entity.Notification;
import com.nexus.backend.entity.User;
import com.nexus.backend.repository.ActivityRepository;
import com.nexus.backend.repository.EventRepository;
import com.nexus.backend.repository.NotificationRepository;
import com.nexus.backend.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
@Slf4j
public class DataInitializer implements CommandLineRunner {

    private final ActivityRepository activityRepository;
    private final EventRepository eventRepository;
    private final NotificationRepository notificationRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {

        if (activityRepository.count() == 0) {
            log.info("Initializing sample data for activities...");
            initializeActivities();
        }

        if (eventRepository.count() == 0) {
            log.info("Initializing sample data for events...");
            initializeEvents();
        }

        if (notificationRepository.count() == 0) {
            log.info("Initializing sample data for notifications...");
            initializeNotifications();
        }

        if (userRepository.count() == 0) {
            log.info("Initializing sample users...");
            initializeUsers();
        }
    }

    private void initializeActivities() {

        Activity act1 = new Activity(
                "act-001",
                "Robotics Workshop",
                "technology",
                "Learn to build robots from scratch with expert guidance.",
                "Our most popular workshop! Hands-on learning for all skill levels.",
                "Mon, Wed 4-6 PM",
                "Tech Lab 101",
                "Dr. Arshad",
                50,
                12,
                "2025-11-15",
                "2025-12-15",
                "https://images.unsplash.com/photo-1581091226825-a6a2a5aee158?w=800&q=80",
                Arrays.asList("robotics", "arduino", "coding"),
                "active",
                true
        );

        Activity act2 = new Activity(
                "act-002",
                "Football Practice",
                "sports",
                "Weekly football practice and inter-college tournament preparation.",
                "Join the Nexus Strikers for training and league games.",
                "Tue, Thu 5-7 PM",
                "Main Field",
                "Coach Vikram",
                30,
                25,
                "2025-10-20",
                "2026-06-15",
                "https://images.unsplash.com/photo-1574629810360-7efbbe195018?w=800&q=80",
                Arrays.asList("sports", "football", "team"),
                "active",
                false
        );

        Activity act3 = new Activity(
                "act-003",
                "Photography Society",
                "arts",
                "Capture the world through your lens. Monthly photo walks and studio sessions.",
                "Art and science of photography. Learn manual controls and lighting.",
                "Sat 10 AM",
                "Media Suite 204",
                "Ms. Priya",
                20,
                18,
                "2025-12-01",
                "2026-05-30",
                "https://images.unsplash.com/photo-1516035069371-29a1b244cc32?w=800&q=80",
                Arrays.asList("arts", "photography", "creative"),
                "active",
                true
        );

        activityRepository.saveAll(Arrays.asList(act1, act2, act3));
    }

    private void initializeEvents() {

        Event e1 = new Event(
                "evt-001",
                "Tech Expo 2026",
                "2026-03-25",
                "10:00 AM",
                "Auditorium Blue",
                "Annual showcase of innovative student projects and tech innovations.",
                "technology",
                "https://images.unsplash.com/photo-1505373877841-8d25f7d46678?w=800&q=80"
        );

        Event e2 = new Event(
                "evt-002",
                "Music Festival",
                "2026-04-12",
                "6:00 PM",
                "Open Air Theater",
                "A night of acoustic performances and band battles featuring local talent.",
                "arts",
                "https://images.unsplash.com/photo-1459749411177-042180ce673f?w=800&q=80"
        );

        eventRepository.saveAll(Arrays.asList(e1, e2));
    }

    private void initializeNotifications() {

        Notification n1 = new Notification(
                "notif-001",
                "Registration Successful",
                "You have successfully registered for the Robotics Workshop.",
                "2 hours ago",
                false,
                "success"
        );

        Notification n2 = new Notification(
                "notif-002",
                "Upcoming Event",
                "Don't forget the Tech Expo starts tomorrow at 10 AM.",
                "Yesterday",
                true,
                "info"
        );

        notificationRepository.saveAll(Arrays.asList(n1, n2));
    }

    private void initializeUsers() {

        User admin = new User(
                null,
                "Dr. Rajesh Kumar",
                "admin@nexus.edu",
                passwordEncoder.encode("admin123"),
                "admin"
        );

        User student = new User(
                null,
                "Rihan",
                "student@nexus.edu",
                passwordEncoder.encode("student123"),
                "student"
        );

        userRepository.saveAll(Arrays.asList(admin, student));
    }
}