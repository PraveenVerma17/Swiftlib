package MTMessages.MT103;

import MTMessages.MT103.Interfaces.ITag;

public class SendingInstitution implements ITag {
  private final String tag = "51";
  private final String option = "A";
  private final String presence = "O";
  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
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
