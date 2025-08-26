package tech.felixpanzo.megalums.service;

import org.springframework.stereotype.Service;
import tech.felixpanzo.megalums.dto.ScheduleNotificationDto;
import tech.felixpanzo.megalums.repository.NotificationRepository;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository){
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDto dto){
        notificationRepository.save(dto.toNotification());
    }
}
