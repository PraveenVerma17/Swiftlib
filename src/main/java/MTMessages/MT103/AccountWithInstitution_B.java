package MTMessages.MT103;

import MTMessages.Common.Constants;
import MTMessages.MT103.Interfaces.AccountWithInstitution;
import MTMessages.MT103.Interfaces.ITag;

public class AccountWithInstitution_B implements AccountWithInstitution, ITag {
  private final static String tag = "57";
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

  public boolean isValid()
  {
    boolean isValid = false;
    boolean isLocationValid = false;
    boolean isPartyIdentifierValid =  false;

    if(this.partyIdentifier ==null){
      isPartyIdentifierValid = true;
    }else
    {
      if(this.partyIdentifier.length() >=2 && this.partyIdentifier.length() <= 37)
      {
        if(this.partyIdentifier.matches(Constants.partyIdentifierFormat))
        {
          isPartyIdentifierValid = true;
        }
      }
    }

    if(this.location == null)
    {
      isLocationValid = true;
    }else
    {
      if(this.location.length() >= 1 && this.location.length() <=35) {
        if (this.location.matches(Constants.locationFormat)) {
          isLocationValid = true;
        }
      }
    }

    // When both are valid
    isValid =  (isPartyIdentifierValid && isLocationValid);
    return isValid;
  }

}
