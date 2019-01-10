package MTMessages.MT103;

import MTMessages.Common.Constants;
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

  public boolean isValid()
  {
    boolean isNameAddressValid = false;
    boolean isPartyIdentifierValid =  false;

    isPartyIdentifierValid = (this.partyIdentifier ==null) ||
            (this.partyIdentifier.length() >=2
                    && this.partyIdentifier.length() <= 37
                    && this.partyIdentifier.matches(Constants.partyIdentifierFormat));


    if(this.nameAddress !=null && this.nameAddress.size() > 0 && this.nameAddress.size() <= 4)
    {
      isNameAddressValid = this.nameAddress.stream().allMatch(line -> line.matches(Constants.nameAddressLineFormat));
    }

    // When both are valid
    return (isPartyIdentifierValid && isNameAddressValid);
  }

}
