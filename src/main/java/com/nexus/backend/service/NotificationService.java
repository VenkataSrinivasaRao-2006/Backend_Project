package com.nexus.backend.service;

import com.nexus.backend.entity.Notification;
import com.nexus.backend.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public Notification createNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    public void markAsRead(String id) {
        notificationRepository.findById(id).ifPresent(notif -> {
            notif.setRead(true);
            notificationRepository.save(notif);
        });
    }

    public void deleteNotification(String id) {
        notificationRepository.deleteById(id);
    }
}
