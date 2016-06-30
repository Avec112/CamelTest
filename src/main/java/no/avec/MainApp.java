package no.avec;

import no.avec.builders.MyRouteBuilder;
import org.apache.camel.main.Main;

/**
 * Created by MainApp on 29/06/16.
 */
public class MainApp {

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.addRouteBuilder(new MyRouteBuilder());
        main.run();
    }
}
