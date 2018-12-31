package MTMessages.MT103;

import MTMessages.MT103.Interfaces.ITag;

public class InstructionCode implements ITag {
  private final String tag = "23";
  private final String option = "E";
  private final String presence = "O";
  private InstructionCode code;
  private String additionalInformation;

  public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public InstructionCode getCode() {
    return code;
  }

  public void setCode(InstructionCode code) {
    this.code = code;
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

