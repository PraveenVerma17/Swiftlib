package MTMessages.MT103;

import MTMessages.Common.Constants;
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


  public boolean isValid()
  {
    boolean isAccountValid =  false;
    boolean isIdentifierCodeValid  = false;
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

    if(this.identifierCode !=null)
    {
      if(this.identifierCode.length() >=8 && this.identifierCode.length() <= 11)
      {
         if(this.identifierCode.matches(Constants.swiftBicFormat))
         {
           isIdentifierCodeValid = true;
         }
      }
    }

    return isValid = (isAccountValid && isIdentifierCodeValid);
  }

}
