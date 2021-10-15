package metrocs;
import org.junit.jupiter.api.Test;

/**
 * Tests for class HelloAnyone.
 *
 * @author  CS3250 Fall 2021
 * @version 1.0
 */
public class HelloAnyoneTest extends HelloAnyone {
    public static void main(final String[] args) {
        HelloAnyoneTest obj = new HelloAnyoneTest();
        if (args.length == 0) {
            System.out.println(obj.sayGoodbye("Billy!"));
        } else {
            System.out.println(obj.sayHello(args[0]));
        }
    }

    public String sayGoodbye(String toWho){
        String response = "";
        if ((toWho == null) || toWho == "Goodbye!" || toWho == "Hello!"){
            response = toWho;
        }else{
            response = "A special hello to " + toWho;
          }

        return response;

    }
    
}
