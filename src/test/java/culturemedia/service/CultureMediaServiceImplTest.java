package culturemedia.service;
import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.repository.implem.VideoRepositoryImpl;
import culturemedia.repository.implem.ViewsRepositoryImpl;
import culturemedia.service.implementation.CultureMediaService;
import culturemedia.service.implementation.CultureMediaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CultureMediaServiceImplTest {
    CultureMediaService cultureMediaService;
    VideoRepository videoRepository;
    ViewsRepository viewsRepository;
    @BeforeEach
    void init() {
        videoRepository = new VideoRepositoryImpl() {
            @Override
            public Object find(double v, double v1) {
                return null;
            }
        };
        viewsRepository = new ViewsRepositoryImpl();
        cultureMediaService = new CultureMediaServiceImpl(videoRepository, viewsRepository) {

            @Override
            public List<Video> find(Double fromDuration, Double toDuration) throws VideoNotFoundException {
                return null;
            }
        };
    }
    @Test
    void when_FindAll_all_videos_should_be_returned_successfully() throws VideoNotFoundException {
        var video = new Video("01","Título 1","Pelicula",3.5);
        cultureMediaService.save( video );
        List<Video> videos = cultureMediaService.findAll( );
        assertEquals(1, videos.size());
    }

    @Test
    void when_FindAll_does_not_find_any_video_an_VideoNotFoundException_should_be_thrown_successfully() throws VideoNotFoundException{
        assertThrows(VideoNotFoundException.class, () -> {
            cultureMediaService.findAll();
        });
    }
}
