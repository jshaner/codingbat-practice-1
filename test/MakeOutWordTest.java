import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MakeOutWordTest {

  static final String[] makeoutWordParams = {

      //TODO figure out how to arrange the params
      "<<>>", "Yay",
      "<<>>", "WooHoo",
      "[[]]", "word",
      "HHoo", "Hello",
      "abyz", "YAY"
  };

  static final String[] makeoutWordExpected = {
      "<<Yay>>",
      "<<WooHoo>>",
      "[[word]]",
      "HHHellooo",
      "abYAYyz"
  };


  @Test
  void makeOutWord() {
    for (int i = 0; i < makeoutWordParams.length; i++) {
      String actual = HelloName.helloName(makeoutWordParams[i]);
      assertEquals(makeoutWordExpected[i], actual);
    }
  }
}