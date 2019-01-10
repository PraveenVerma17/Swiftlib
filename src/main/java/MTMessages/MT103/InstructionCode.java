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
    boolean isValid = false;
    boolean isCodeValid = false;
    boolean isAdditionalInfoValid = false;


    if(this.code !=null)
    {
      isCodeValid = true;
    }

    if(this.additionalInformation == null){
      isAdditionalInfoValid = true;
    }
    else
    {
      if(this.additionalInformation.length() >= 1 && this.additionalInformation.length() <= 30)
      {
        if(this.additionalInformation.matches(Constants.additionalInfoFormat))
        {
          isAdditionalInfoValid = true;
        }
      }
    }

    return isValid = (isCodeValid && isAdditionalInfoValid);
  }

}

