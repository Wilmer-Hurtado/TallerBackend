package culturemedia.service.implementation;
import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.model.VideoPlayback;

import java.util.List;
public interface CultureMediaService {
    Video save(Video video);

    VideoPlayback save(VideoPlayback videoReproduction);

    List<Video> findAll() throws VideoNotFoundException;

    List<Video> find(String tittle) throws VideoNotFoundException;

    List<Video> find(Double fromDuration, Double toDuration) throws VideoNotFoundException;
}
