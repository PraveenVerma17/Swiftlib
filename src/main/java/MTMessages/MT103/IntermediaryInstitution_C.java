package MTMessages.MT103;

import MTMessages.Common.Constants;
import MTMessages.MT103.Interfaces.ITag;
import MTMessages.MT103.Interfaces.IntermediaryInstitution;

public class IntermediaryInstitution_C  implements IntermediaryInstitution, ITag {
  private final static String tag = "56";
  private final static String option = "C";
  private final static String presence = "O";
  private String partyIdentifier;

  public String getPartyIdentifier() {
    return partyIdentifier;
  }

  public void setPartyIdentifier(String partyIdentifier) {
    this.partyIdentifier = partyIdentifier;
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

  public boolean isValid()
  {
    boolean isValid = false;

    if(this.partyIdentifier !=null){
      if(this.partyIdentifier.length() >=2 && this.partyIdentifier.length() <= 37)
      {
        if(this.partyIdentifier.matches(Constants.partyIdentifierFormat))
        {
          isValid = true;
        }
      }
    }
    return isValid;
  }
}
