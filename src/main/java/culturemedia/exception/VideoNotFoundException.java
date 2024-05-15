package culturemedia.exception;

public class VideoNotFoundException extends CulturemediaException{

    public VideoNotFoundException (String message){super(message);}


    public VideoNotFoundException (){
        super("Video not found");
    };

}
