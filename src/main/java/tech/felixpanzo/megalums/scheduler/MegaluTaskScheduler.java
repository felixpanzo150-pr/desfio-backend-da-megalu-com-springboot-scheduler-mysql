package tech.felixpanzo.megalums.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tech.felixpanzo.megalums.service.NotificationService;

import java.time.LocalDateTime;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

@Component
public class MegaluTaskScheduler {

    private static final Logger logger = LoggerFactory.getLogger(MegaluTaskScheduler.class);

    private final NotificationService notificationService;

    public MegaluTaskScheduler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void runTask(){
        var dateTime = LocalDateTime.now();
        logger.info("Running at {}", dateTime);
        notificationService.checkAndSend(dateTime);
    }
}
