package MTMessages.MT103;

import MTMessages.Common.Constants;
import MTMessages.MT103.Interfaces.ITag;
import MTMessages.MT103.Interfaces.IntermediaryInstitution;

import java.util.List;

public class IntermediaryInstitution_D implements IntermediaryInstitution, ITag {
  private final static String tag = "56";
  private final static String option ="D";
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

  public boolean isValid()
  {
    boolean isValid = false;
    boolean isNameAddressValid = false;
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

    if(this.nameAddress !=null && this.nameAddress.size() > 0 && this.nameAddress.size() <= 4)
    {
      for (String line :this.nameAddress) {
        if(line !=null && line.matches(Constants.nameAddressLineFormat))
        {
          isNameAddressValid = true;
        }else
        {
          isNameAddressValid = false;
          break;
        }
      }
    }

    // When both are valid
    isValid =  (isPartyIdentifierValid && isNameAddressValid);
    return isValid;
  }
}
