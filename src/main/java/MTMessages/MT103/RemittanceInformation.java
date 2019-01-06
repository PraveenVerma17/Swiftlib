package MTMessages.MT103;

import MTMessages.MT103.Interfaces.ITag;

import java.util.List;

public class RemittanceInformation implements ITag {
  private final static String tag = "70";
  private final static String option  = "";
  private final static String presence = "O";
  private List<String> remittanceInfo;

  public List<String> getRemittanceInfo() {
    return remittanceInfo;
  }

  public void setRemittanceInfo(List<String> remittanceInfo) {
    this.remittanceInfo = remittanceInfo;
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
