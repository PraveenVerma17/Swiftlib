package MTMessages.MT103;

import MTMessages.MT103.Enums.TimeIndicationCode;
import MTMessages.MT103.Enums.TimeIndicationSign;
import MTMessages.MT103.Interfaces.ITag;

public class TimeIndication implements ITag {
    private final static String tag = "13";
    private final static String option = "C";
    private final static String presence = "O";
    private TimeIndicationCode code;
    private String time;
    private TimeIndicationSign sign;
    private String offset;


  public TimeIndicationCode getCode() {
    return code;
  }

  public void setCode(TimeIndicationCode code) {
    this.code = code;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public TimeIndicationSign getSign() {
    return sign;
  }

  public void setSign(TimeIndicationSign sign) {
    this.sign = sign;
  }

  public String getOffset() {
    return offset;
  }

  public void setOffset(String offset) {
    this.offset = offset;
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


