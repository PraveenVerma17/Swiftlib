package MTMessages.MT103;

import MTMessages.Common.Constants;
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

  public boolean isValid()
  {
    boolean isLocationValid = false;
    boolean isPartyIdentifierValid =  false;

    //Check Party identifier validity
    isPartyIdentifierValid = this.partyIdentifier == null ||
            (this.partyIdentifier.length() >=2
                    && this.partyIdentifier.length() <= 37
                    && this.partyIdentifier.matches(Constants.partyIdentifierFormat));


    //Check location validity
    isLocationValid =  this.location == null ||
            (this.location.length() >= 1
                    && this.location.length() <=35
                    && this.location.matches(Constants.locationFormat));


    // When both are valid
    return (isPartyIdentifierValid && isLocationValid);
  }

}
