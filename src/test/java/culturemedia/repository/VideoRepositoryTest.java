package culturemedia.repository;

import culturemedia.model.Video;
import culturemedia.repository.implem.VideoRepositoryImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class VideoRepositoryTest {
    private VideoRepository videoRepository;

    @Test
    void when_FindAll_all_videos_should_be_returned_successfully() {
        List<Video> videos = videoRepository.findAll();
        assertEquals(6, videos.size());
    }

    @Test
    void when_FindByTitle_only_videos_which_contains_the_word_in_the_title_should_be_returned_successfully() {
        List<Video> videos = videoRepository.find("Clic");
        assertEquals(2, videos.size());
    }

    @Test
    void when_FindByDuration_only_videos_between_the_range_should_be_returned_successfully() {
        List<Video> videos = (List<Video>) videoRepository.find(4.5, 5.5);
        assertEquals(3, videos.size());
    }
    @Test
    void when_FindByTitle_does_not_match_any_video_an_empty_list_should_be_returned_successfully() {
        List<Video> videos = videoRepository.find("NonexistentTitle");
        assertEquals(0, videos.size());
    }
    @Test
    void when_FindByDuration_does_not_match_any_video_an_empty_list_should_be_returned_successfully() {
        List<Video> videos = (List<Video>) videoRepository.find(10.0, 15.0);
        assertTrue(videos.isEmpty());
    }
}
