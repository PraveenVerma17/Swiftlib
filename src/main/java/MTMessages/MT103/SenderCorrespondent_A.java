package MTMessages.MT103;

import MTMessages.Common.Constants;
import MTMessages.MT103.Interfaces.ITag;
import MTMessages.MT103.Interfaces.SenderCorrespondent;

public class SenderCorrespondent_A implements SenderCorrespondent, ITag {
  private final static String tag = "53";
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
    boolean isIdentifierCdValid = false;
    boolean isPartyIdentifierValid =  false;

    //Check Identifier code validity
    isIdentifierCdValid = (this.identifierCode != null
            && this.identifierCode.length() >=8
            && this.identifierCode.length() <= 11
            && this.identifierCode.toUpperCase().matches(Constants.swiftBicFormat));

    //Check PartyIdentifier validity
    isPartyIdentifierValid = (this.partyIdentifier == null) ||
            (this.partyIdentifier.length() >=2
                    && this.partyIdentifier.length() <= 37
                    && this.partyIdentifier.matches(Constants.partyIdentifierFormat));


    // When both are valid
    return (isPartyIdentifierValid && isIdentifierCdValid);
  }

}
