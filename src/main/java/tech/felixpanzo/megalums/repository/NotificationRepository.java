package tech.felixpanzo.megalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.EnableScheduling;
import tech.felixpanzo.megalums.entity.Notification;

@EnableScheduling
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
