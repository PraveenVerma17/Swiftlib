package MTMessages.MT103;

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

}




