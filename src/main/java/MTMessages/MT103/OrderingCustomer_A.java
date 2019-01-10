package MTMessages.MT103;

import MTMessages.Common.Constants;
import MTMessages.MT103.Interfaces.ITag;
import MTMessages.MT103.Interfaces.OrderingCustomer;

public class OrderingCustomer_A implements OrderingCustomer, ITag {
   private String account;
   private String identifierCode;
   private final static String option = "A";
   private final static String tag = "50";
   private final static String presence = "M";

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
      boolean isAccountValid = false;
      boolean isIdentifierCodeValid = false;

      isAccountValid = this.account == null ||
                        (this.account.length() >= 1
                                && this.account.length() <= 34
                                && this.account.matches(Constants.beniCustomerAcctFormat));


      isIdentifierCodeValid = (this.identifierCode != null
                                  && this.identifierCode.length() >= 8
                                  && this.identifierCode.length() <= 11
                                  && this.identifierCode.matches(Constants.swiftBicFormat));

      return (isAccountValid && isIdentifierCodeValid);
   }

}




