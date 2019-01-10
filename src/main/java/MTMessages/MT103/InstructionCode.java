package MTMessages.MT103;

import MTMessages.Common.Constants;
import MTMessages.MT103.Interfaces.ITag;

public class InstructionCode implements ITag {
  private final static String tag = "23";
  private final static String option = "E";
  private final static String presence = "O";
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


  public boolean isValid()
  {
    boolean isCodeValid = false;
    boolean isAdditionalInfoValid = false;


    isCodeValid = this.code !=null;

    isAdditionalInfoValid =(this.additionalInformation == null)||
                            (this.additionalInformation.length() >= 1
                                    && this.additionalInformation.length() <= 30
                                    && this.additionalInformation.matches(Constants.additionalInfoFormat));

    return  (isCodeValid && isAdditionalInfoValid);
  }

}

