package culturemedia.repository.implem;
import java.util.ArrayList;
import java.util.List;

import culturemedia.repository.VideoRepository;
import culturemedia.model.Video;


public abstract class VideoRepositoryImpl implements VideoRepository {
    private final List<Video> videos;

    public VideoRepositoryImpl() {
        videos = new ArrayList<>();
    }

    @Override
    public List<Video> findAll() {
        return videos;
    }

    @Override
    public Video save(Video video) {
        this.videos.add( video );
        return video;
    }


    public List<Video> find(String title) {
        List<Video> filteredVideos = null;
        for ( Video video : videos ) {
            if(title.equals( video.tittle() )){
                if(filteredVideos == null){
                    filteredVideos = new ArrayList<Video>();
                }
                filteredVideos.add(video);
            }
        }
        return filteredVideos;
    }

    public List<Video> find(Double fromDuration, Double toDuration) {
        List<Video> filteredVideos = new ArrayList<Video>();
        for ( Video video : videos ) {
            if(video.duration()> fromDuration && video.duration()< toDuration){
                filteredVideos.add(video);
            }
        }
        return filteredVideos;
    }
}
