package culturemedia.model;
import java.time.LocalDateTime;
public record VideoPlayback(String userFullName, LocalDateTime startPlayingTime,Integer age, Video video) {
}
