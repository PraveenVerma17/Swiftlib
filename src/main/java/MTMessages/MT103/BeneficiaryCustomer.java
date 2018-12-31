package MTMessages.MT103;

import MTMessages.MT103.Interfaces.BeneFiciaryCustomer;
import MTMessages.MT103.Interfaces.ITag;

import java.util.List;

public class BeneficiaryCustomer implements BeneFiciaryCustomer, ITag {
  private final String tag = "59";
  private final String option =  "";
  private final String presence = "M";
  private String account;
  private List<String> nameAddress;

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
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
}
