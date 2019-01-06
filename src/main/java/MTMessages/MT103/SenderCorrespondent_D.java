package MTMessages.MT103;

import MTMessages.MT103.Interfaces.ITag;
import MTMessages.MT103.Interfaces.SenderCorrespondent;

import java.util.List;

public class SenderCorrespondent_D implements SenderCorrespondent, ITag {

  private final static String tag = "53";
  private final static String option = "D";
  private final static String presence = "O";
  private String partyIdentifier;
  private List<String> nameAddress;

  public String getPartyIdentifier() {
    return partyIdentifier;
  }

  public void setPartyIdentifier(String partyIdentifier) {
    this.partyIdentifier = partyIdentifier;
  }

  public List<String> getNameAddress() {
    return nameAddress;
  }

  public void setNameAddress(List<String> nameAddress) {
    this.nameAddress = nameAddress;
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
