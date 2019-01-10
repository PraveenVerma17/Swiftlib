package MTMessages.MT103;


import MTMessages.MT103.Enums.BankOperationCodeEnum;
import MTMessages.MT103.Interfaces.ITag;

public class BankOperationCode implements ITag {
  private final static String tag = "23";
  private final static String option = "B";
  private final static String presence = "M";

  private BankOperationCodeEnum bankOperationCode;

  public BankOperationCodeEnum getBankOperationCode() {
    return bankOperationCode;
  }

  public void setBankOperationCode(BankOperationCodeEnum bankOperationCode) {
    this.bankOperationCode = bankOperationCode;
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
    return this.bankOperationCode != null;
  }
}
