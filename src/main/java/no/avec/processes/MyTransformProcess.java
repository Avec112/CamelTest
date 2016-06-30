package no.avec.processes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created by avec on 29/06/16.
 */
public class MyTransformProcess implements Processor {
    public void process(Exchange exchange) throws Exception {
        String in = exchange.getIn().getBody(String.class);
//        return (T)(in + ", world").toUpperCase();
        exchange.getOut().setBody((in + ", world!").toUpperCase());
        exchange.getOut().setHeaders(exchange.getIn().getHeaders());
    }
}
