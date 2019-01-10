package MTMessages.MT103;

import MTMessages.Common.Constants;
import MTMessages.MT103.Interfaces.ITag;

public class SendingInstitution implements ITag {
  private final static String tag = "51";
  private final static String option = "A";
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


  public boolean isValid()
  {
    boolean isValid = false;
    boolean isIdentifierCdValid = false;
    boolean isPartyIdentifierValid =  false;

    if(this.identifierCode != null)
    {
      if(this.identifierCode.length() >=8 && this.identifierCode.length() <= 11)
      {
        if(this.identifierCode.toUpperCase().matches(Constants.swiftBicFormat))
        {
          isIdentifierCdValid = true;
        }
      }
    }

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

    // When both are valid
    isValid =  (isPartyIdentifierValid && isIdentifierCdValid);
    return isValid;
  }


}
