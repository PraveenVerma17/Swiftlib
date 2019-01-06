package MTMessages.MT103;

import MTMessages.MT103.Interfaces.BeneFiciaryCustomer;
import MTMessages.MT103.Interfaces.ITag;

public class BeneficiaryCustomer_A implements BeneFiciaryCustomer, ITag {
  private final static String tag = "59";
  private final static String option  = "A";
  private final static String presence = "M";

  private String account;
  private String identifierCode;

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
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

}
