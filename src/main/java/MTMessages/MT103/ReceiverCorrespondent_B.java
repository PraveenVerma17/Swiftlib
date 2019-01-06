package MTMessages.MT103;

import MTMessages.MT103.Interfaces.ITag;
import MTMessages.MT103.Interfaces.ReceiverCorrespondent;

public class ReceiverCorrespondent_B implements ReceiverCorrespondent, ITag {
  private final static String tag = "54";
  private final static String option  = "B";
  private final static String presence = "O";

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
