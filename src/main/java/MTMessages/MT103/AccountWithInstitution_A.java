package MTMessages.MT103;

import MTMessages.MT103.Interfaces.AccountWithInstitution;
import MTMessages.MT103.Interfaces.ITag;

public class AccountWithInstitution_A implements AccountWithInstitution, ITag {
  private final String tag = "57";
  private final String option  = "A";
  private final String presence = "O";

  private String partyIdentifier;
  private String identifierCode;

  /**
   * @apiNote get the party identifier value
   */

  public String getPartyIdentifier() {
    return partyIdentifier;
  }

  /**
   * @param partyIdentifier
   * @apiNote setting the party identifier value
   */
  public void setPartyIdentifier(String partyIdentifier) {
    this.partyIdentifier = partyIdentifier;
  }

  public String getIdentifierCode() {
    return identifierCode;
  }

  public void setIdentifierCode(String identifierCode) {
    this.identifierCode = identifierCode;
  }

  /**
   * @return tag value as 57
   */
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
