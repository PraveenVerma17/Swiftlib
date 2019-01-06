package MTMessages.MT103;

import MTMessages.Common.Constants;
import MTMessages.MT103.Interfaces.ITag;

public class SenderReference implements ITag {
  private final static String tag = "20";
  private final static String option = "";
  private final static String presence = "M";
  private String senderReference;

  public String getSenderReference() {
    return senderReference;
  }

  public void setSenderReference(String senderReference) {
    this.senderReference = senderReference;
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
    boolean indValid = false;
    if(this.senderReference !=null)
    {
      if(!this.senderReference.startsWith("/") && !this.senderReference.endsWith("/") && !this.senderReference.contains("//"))
      {
          if(this.senderReference.length() > 0 && this.senderReference.length() <= 16)
          {
              if(this.senderReference.matches(Constants.senderReferenceFormat))
            {
              indValid = true;
            }
          }
      }
    }

    return indValid;
  }

  public String toSwiftString()
  {
     if(this.isValid())
     {
       return String.format("%s%s%s%s", Constants.tagStart, this.getTag(), Constants.tagEnd, this.getSenderReference());
     }
     else
       return null;
  }

}
