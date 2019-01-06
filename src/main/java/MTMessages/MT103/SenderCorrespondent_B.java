package MTMessages.MT103;

import MTMessages.MT103.Interfaces.ITag;
import MTMessages.MT103.Interfaces.SenderCorrespondent;

public class SenderCorrespondent_B implements SenderCorrespondent, ITag {
  private final static String tag = "53";
  private final static String option  = "B";
  private final static String presence = "O";
  private String partyIdentifier;
  private String location;

  public String getPartyIdentifier() {
    return partyIdentifier;
  }

  public void setPartyIdentifier(String partyIdentifier) {
    this.partyIdentifier = partyIdentifier;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
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
