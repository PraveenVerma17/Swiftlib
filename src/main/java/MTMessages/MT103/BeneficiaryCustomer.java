package MTMessages.MT103;

import MTMessages.Common.Constants;
import MTMessages.MT103.Interfaces.BeneFiciaryCustomer;
import MTMessages.MT103.Interfaces.ITag;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.util.List;

public class BeneficiaryCustomer implements BeneFiciaryCustomer, ITag {
  private final static String tag = "59";
  private final static String option =  "";
  private final static String presence = "M";

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

  public boolean isValid()
  {
    boolean isAccountValid =  false;
    boolean isNameAddressValid  = false;
    boolean isValid = false;

    if(this.account == null)
    {
      isAccountValid = true;
    }else
    {
      if(this.account.length() >=1 && this.account.length() <= 34)
      {
        if(this.account.matches(Constants.beniCustomerAcctFormat))
        {
          isAccountValid = true;
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

    return isValid = (isAccountValid && isNameAddressValid);
  }
}
