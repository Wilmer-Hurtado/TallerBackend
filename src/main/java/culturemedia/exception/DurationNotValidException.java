package culturemedia.exception;
import java.text.MessageFormat;

import org.apache.logging.log4j.message.Message;
public class DurationNotValidException extends CulturemediaException {
    public DurationNotValidException (String tittle, Double Duration) {
        super(MessageFormat.format("Duration not valid for title: {0} duration {1} ",tittle,
                Duration));

    }
}
