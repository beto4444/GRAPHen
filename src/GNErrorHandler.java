import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class GNErrorHandler extends BaseErrorListener {

    public GNErrorHandler(GRAPHenApp gn){
        this.gnapp = gn;
    }

    private GRAPHenApp gnapp;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        gnapp.feedbackAreaSB.append("line " + line + ":" + charPositionInLine + " " + msg);
        gnapp.feedbackAreaSB.append('\n');
    }
}