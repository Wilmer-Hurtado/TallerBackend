package culturemedia.repository;
import java.util.List;
import culturemedia.model.Video;
public interface VideoRepository<click> {
    List<Video> findAll();
    Video save(Video video);

    List<Video> find(String click);

    click find(double v, double v1);
}
