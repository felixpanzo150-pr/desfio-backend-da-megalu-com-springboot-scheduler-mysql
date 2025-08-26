package tech.felixpanzo.megalums.service;

import org.springframework.stereotype.Service;
import tech.felixpanzo.megalums.dto.ScheduleNotificationDto;
import tech.felixpanzo.megalums.entity.Notification;
import tech.felixpanzo.megalums.entity.Status;
import tech.felixpanzo.megalums.repository.NotificationRepository;

import java.util.Optional;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository){
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDto dto){
        notificationRepository.save(dto.toNotification());
    }

    public Optional<Notification> findById(Long notificationId){
        return notificationRepository.findById(notificationId);
    }

    public void cancelNotification(Long notificationId){
        var notification = findById(notificationId);

        if (notification.isPresent()){
            notification.get().setStatus(Status.Values.CANCELED.toStatus());
            notificationRepository.save(notification.get());
        }
    }
}
