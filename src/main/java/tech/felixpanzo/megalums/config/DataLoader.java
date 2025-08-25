package tech.felixpanzo.megalums.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import tech.felixpanzo.megalums.entity.Channel;
import tech.felixpanzo.megalums.entity.Status;
import tech.felixpanzo.megalums.repository.ChannelRepository;
import tech.felixpanzo.megalums.repository.StatusRepository;

import java.util.Arrays;

@Configuration
public class DataLoader implements CommandLineRunner {

    private final ChannelRepository channelRepository;
    private final StatusRepository statusRepository;

    public DataLoader(ChannelRepository channelRepository, StatusRepository statusRepository) {
        this.channelRepository = channelRepository;
        this.statusRepository = statusRepository;
    }

    public void run(String... args) throws Exception {
        Arrays.stream(Channel.Values.values())
                .map(Channel.Values::toChannel)
                .forEach(channelRepository::save);

        Arrays.stream(Status.Values.values())
                .map(Status.Values::toStatus)
                .forEach(statusRepository::save);
    }
}
