package MTMessages.MT103;

import MTMessages.Common.Constants;
import MTMessages.MT103.Interfaces.ITag;

import java.util.List;

public class SenderToReceiverInformation implements ITag {
  private final static String tag = "72";
  private final static String option  = "";
  private final static String presence = "O";
  private List<String> senderToReceiverInfo;

  public List<String> getSenderToReceiverInfo() {
    return senderToReceiverInfo;
  }

  public void setSenderToReceiverInfo(List<String> senderToReceiverInfo) {
    this.senderToReceiverInfo = senderToReceiverInfo;
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

    if(this.senderToReceiverInfo == null)
    {
      isValid = true;
    }
    else
    {
      if(this.senderToReceiverInfo.size() > 0 && this.senderToReceiverInfo.size() <= 6)
      {
        //Check the first line one to identify the generic type or code type
        boolean isGenericType = true;
        for (String code : Constants.senderToReceiverCd) {
          if(this.senderToReceiverInfo.stream().findFirst().toString().startsWith(code))
          {
            isGenericType = false;
            break;
          }
        }

        if(isGenericType)
        {
          isValid = this.senderToReceiverInfo.stream().allMatch(line -> line.matches(Constants.senderToReceiverGeneric));
        }
        else {

          // This is code type.
          if(this.senderToReceiverInfo.stream().findFirst().toString().matches(Constants.senderToReceiverCode)) {
            isValid = true;
          }

          //Check the line 2- 6 with code and continuation format
          if(this.senderToReceiverInfo.size() > 1)
          {
           isValid = this.senderToReceiverInfo.stream()
                                    .skip(1)
                                    .allMatch(line -> line.matches(Constants.senderToReceiverCont)
                                    || line.matches(Constants.senderToReceiverCode));
          }

        }
      }
    }

    return isValid;
  }

}
