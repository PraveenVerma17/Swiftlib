package MTMessages.MT103;
import MTMessages.Common.Constants;
import MTMessages.MT103.Interfaces.ITag;
import MTMessages.MT103.Interfaces.OrderingInstitution;

import java.util.List;

public class OrderingInstitution_D implements OrderingInstitution, ITag {

  private final static String tag= "52";
  private final static String option = "D";
  private final static String presence = "O";
  private String partyIdentifier;
  private List<String> nameAndAddress;

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
    boolean isNameAddressValid = false;
    boolean isPartyIdentifierValid =  false;

    isPartyIdentifierValid = this.partyIdentifier ==null||
                              (this.partyIdentifier.length() >=2
                                  && this.partyIdentifier.length() <= 37
                                  && this.partyIdentifier.matches(Constants.partyIdentifierFormat));

    if(this.nameAndAddress !=null && this.nameAndAddress.size() > 0 && this.nameAndAddress.size() <= 4)
    {
      isNameAddressValid =  this.nameAndAddress.stream().allMatch(line -> line.matches(Constants.nameAddressLineFormat));
    }

    // When both are valid
    return (isPartyIdentifierValid && isNameAddressValid);
  }

}
