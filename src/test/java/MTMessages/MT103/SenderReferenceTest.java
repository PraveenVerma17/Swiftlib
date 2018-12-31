package MTMessages.MT103;

import org.junit.Test;

import static org.junit.Assert.*;

public class SenderReferenceTest {

  @Test
  public void isValid() {
    SenderReference objSenderReference = new SenderReference();
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
}