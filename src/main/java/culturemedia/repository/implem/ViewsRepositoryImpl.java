package culturemedia.repository.implem;
import java.util.ArrayList;
import java.util.List;
import culturemedia.model.VideoPlayback;
import culturemedia.repository.ViewsRepository;
public abstract class ViewsRepositoryImpl implements ViewsRepository{
    private final List<VideoPlayback> Views;

    public ViewsRepositoryImpl() {
        this.Views = new ArrayList<>();
    }

    @Override
    public VideoPlayback save(VideoPlayback view) {
        this.Views.add( view );
        return view;
    }
}
