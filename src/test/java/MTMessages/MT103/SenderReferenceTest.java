package MTMessages.MT103;

import org.junit.Test;
import static org.junit.Assert.*;

public class SenderReferenceTest {
  SenderReference objSenderReference = new SenderReference();

  @Test
  public void isValid() {
    objSenderReference.setSenderReference("MMS353532");
    assertTrue(objSenderReference.isValid());
    objSenderReference.setSenderReference("/MMS35352");
    assertFalse(objSenderReference.isValid());
    objSenderReference.setSenderReference("MMS35353//HD");
    assertFalse(objSenderReference.isValid());
    objSenderReference.setSenderReference("MMS35252/");
    assertFalse(objSenderReference.isValid());
    objSenderReference.setSenderReference("MMS355252222424244");
    assertFalse(objSenderReference.isValid());

  }

  @Test
  public void toSwiftString() {
    objSenderReference.setSenderReference("MMS355222");
    String response  =  objSenderReference.toSwiftString();
    String expectedString  = ":20:MMS355222";
    assertNotNull(response);
    assertEquals(response, expectedString);
    objSenderReference.setSenderReference("/MMS35222");
    response = objSenderReference.toSwiftString();
    assertNull(response);
  }


}