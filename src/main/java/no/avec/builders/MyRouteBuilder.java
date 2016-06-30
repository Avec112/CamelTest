package no.avec.builders;

import no.avec.processes.MyTransformProcess;
import org.apache.camel.Exchange;
import org.apache.camel.Expression;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created by avec on 29/06/16.
 */
public class MyRouteBuilder extends RouteBuilder {
    public void configure() throws Exception {
        from("file://inputdir/?delete=true")
                .log(LoggingLevel.INFO, "Transfering files...")
                .process(new MyTransformProcess())
//                .transform(body().append(", world!"))
//                .transform(new Expression() {
//                    public <T> T evaluate(Exchange exchange, Class<T> aClass) {
//                        String in = exchange.getIn().getBody(String.class);
//                        return (T)(in + ", world").toUpperCase();
////                        return (T)exchange.getIn().getBody(String.class).toUpperCase();
//                    }
//                })
                .to("file://outputdir");

    }
}
