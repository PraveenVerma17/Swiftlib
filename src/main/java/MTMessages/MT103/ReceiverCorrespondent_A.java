package MTMessages.MT103;

import MTMessages.MT103.Interfaces.ITag;
import MTMessages.MT103.Interfaces.ReceiverCorrespondent;

public class ReceiverCorrespondent_A implements ReceiverCorrespondent, ITag {
  private final static String tag = "54";
  private final static String option = "B";
  private final static String presence = "O";
  private String partyIdentifier;
  private String identifierCode;

  public String getPartyIdentifier() {
    return partyIdentifier;
  }

  public void setPartyIdentifier(String partyIdentifier) {
    this.partyIdentifier = partyIdentifier;
  }

  public String getIdentifierCode() {
    return identifierCode;
  }

  public void setIdentifierCode(String identifierCode) {
    this.identifierCode = identifierCode;
  }

  @Override
  public String getTag() {
    return tag;
  }

  @Override
  public String getOption() {
    return option;
  }

  @Override
  public String getPresence() {
    return presence;
  }


}
