package MTMessages.MT103;
import MTMessages.MT103.Interfaces.ITag;
import MTMessages.MT103.Interfaces.OrderingInstitution;

import java.util.List;

public class OrderingInstitution_D implements OrderingInstitution, ITag {

  private final String tag= "52";
  private final String option = "D";
  private final String presence = "O";
  private String partyIdentifier;

  public String getPartyIdentifier() {
    return partyIdentifier;
  }

  public void setPartyIdentifier(String partyIdentifier) {
    this.partyIdentifier = partyIdentifier;
  }

  public List<String> getNameAndAddress() {
    return nameAndAddress;
  }

  public void setNameAndAddress(List<String> nameAndAddress) {
    this.nameAndAddress = nameAndAddress;
  }

  private List<String> nameAndAddress;
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
