package MTMessages.MT103;

import MTMessages.MT103.Interfaces.ITag;
import MTMessages.MT103.Interfaces.ThirdReimbursementInstitution;

import java.util.List;

public class ThirdReimbursementInstitution_D implements ThirdReimbursementInstitution, ITag {
  private final static String tag = "55";
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
