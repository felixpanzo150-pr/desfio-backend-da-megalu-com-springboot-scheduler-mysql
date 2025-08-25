package tech.felixpanzo.megalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.felixpanzo.megalums.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

}
