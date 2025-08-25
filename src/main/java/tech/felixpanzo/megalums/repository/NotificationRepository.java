package tech.felixpanzo.megalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.felixpanzo.megalums.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
