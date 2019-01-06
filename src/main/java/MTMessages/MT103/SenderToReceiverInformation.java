package MTMessages.MT103;

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


}
