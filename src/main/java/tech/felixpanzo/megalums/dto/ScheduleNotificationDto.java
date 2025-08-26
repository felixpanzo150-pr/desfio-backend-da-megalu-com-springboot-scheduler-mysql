package tech.felixpanzo.megalums.dto;

import tech.felixpanzo.megalums.entity.Channel;
import tech.felixpanzo.megalums.entity.Notification;
import tech.felixpanzo.megalums.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDto(LocalDateTime dateTime,
                                      String destination,
                                      String message,
                                      Channel.Values channel) {
    public Notification toNotification(){
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus()
        );
    }
}
