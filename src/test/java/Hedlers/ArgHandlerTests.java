package Hedlers;

import WebWordCounterApp.Exceptions.AppBadArgumentException;
import WebWordCounterApp.Handlers.ArgHandler;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArgHandlerTests {

    private final String URL = "https://www.simbirsoft.com/";

    private final String PATH = "/Users/rustam/Dropbox/java/java_code/simbirsoft/WebWordsCounter/out.html";

    private final String UKEY = "-u";

    private final String OKEY = "-o";

    @Test(expected = AppBadArgumentException.class)
    public void whenArgsNull () throws AppBadArgumentException {
        String[] input = null;
        new ArgHandler(input);
    }

    @Test(expected = AppBadArgumentException.class)
    public void whenArgsEmpty () throws AppBadArgumentException {
        String[] input = new String[] {};
        new ArgHandler(input);
    }

    @Test(expected = AppBadArgumentException.class)
    public void whenUrlNotSet () throws AppBadArgumentException {
        String[] input = new String[] {UKEY, OKEY, PATH};
        new ArgHandler(input);
    }

    @Test(expected = AppBadArgumentException.class)
    public void whenPathNotSet () throws AppBadArgumentException {
        String[] input = new String[] {UKEY, URL, OKEY};
        new ArgHandler(input);
    }

    @Test
    public void whenArgsFull () throws AppBadArgumentException {
        String[] input = new String[] {UKEY, URL, OKEY, PATH};
        ArgHandler args = new ArgHandler(input);
        assertEquals(args.getUrl(), URL);
        assertEquals(args.getPath(), PATH);
    }

}
