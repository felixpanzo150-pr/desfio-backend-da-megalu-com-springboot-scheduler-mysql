package tech.felixpanzo.megalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.EnableScheduling;
import tech.felixpanzo.megalums.entity.Notification;
import tech.felixpanzo.megalums.entity.Status;

import java.time.LocalDateTime;
import java.util.List;

@EnableScheduling
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);
}
