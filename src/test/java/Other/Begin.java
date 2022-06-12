package Other;

import BaseClass.CommonBase;
import org.junit.Test;

public class Begin extends CommonBase {

    @Test
    public  void Game() {
        launchChrome("https://www.facebook.com");
        maxWindow();
        closeWindow();
    }
}
