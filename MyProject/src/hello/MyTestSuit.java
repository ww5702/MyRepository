package hello;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MyClassMedianTest.class, MyClassOtherTest.class })
public class MyTestSuit {

}
