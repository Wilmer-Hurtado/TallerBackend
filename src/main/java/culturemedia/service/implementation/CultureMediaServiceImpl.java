package culturemedia.service.implementation;
import culturemedia.model.Video;
import culturemedia.model.VideoPlayback;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;

import java.util.List;
public abstract class CultureMediaServiceImpl implements CultureMediaService {
    private VideoRepository videoRepository;
    private ViewsRepository viewsRepository;

    public CultureMediaServiceImpl(VideoRepository videoRepository, ViewsRepository viewsRepository) {
    }

    public List<Video> findAll() {
        return videoRepository.findAll();
    }

    public Video save(Video video)  {
        return videoRepository.save(video);
    }

    public VideoPlayback save(VideoPlayback view)  {
        return viewsRepository.save(view);
    }

}
