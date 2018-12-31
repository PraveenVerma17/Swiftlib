package MTMessages.MT103;

import MTMessages.MT103.Enums.DetailsOfChargeCode;
import MTMessages.MT103.Interfaces.ITag;

public class DetailsOfCharge implements ITag {
  private final String tag = "71";
  private final String option = "A";
  private final String presence = "M";
  private DetailsOfChargeCode detailsOfChargeCode;

  public DetailsOfChargeCode getDetailsOfChargeCode() {
    return detailsOfChargeCode;
  }

  public void setDetailsOfChargeCode(DetailsOfChargeCode detailsOfChargeCode) {
    this.detailsOfChargeCode = detailsOfChargeCode;
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
