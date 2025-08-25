package tech.felixpanzo.megalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.felixpanzo.megalums.entity.Channel;


public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
