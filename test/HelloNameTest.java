import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloNameTest {


  static final String[] helloNameParams = {
      "Alice",
      "X",
      "Dolly",
      "Alpha",
      "Omega",
      "Goodbye",
      "ho ho ho",
      "xyz!",
      "Hello"
  };

  static final String[] helloNameExpected = {
      "Hello Alice!",
      "Hello X!",
      "Hello Dolly!",
      "Hello Alpha!",
      "Hello Omega!",
      "Hello Goodbye!",
      "Hello ho ho ho!",
      "Hello xyz!!",
      "Hello Hello!"
  };


  @Test
  void helloName() {

//    HelloNameTest nametest = new HelloNameTest();
    for (int i = 0; i < helloNameParams.length; i++) {
      String actual = HelloName.helloName(helloNameParams[i]);
      assertEquals(helloNameExpected[i], actual);
    }
  }
}