import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    private HelloWorld helloWorld;

    @BeforeEach
    public void initSetUP(){
        helloWorld = new HelloWorld();
    }
}