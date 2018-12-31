package MTMessages.MT103;

import MTMessages.MT103.Interfaces.ITag;

public class TransactionTypeCode implements ITag {
  private final String tag = "26";
  private final String option = "T";
  private final String presence = "O";
  private String transactionTypeCode;

  public String getTransactionTypeCode() {
    return transactionTypeCode;
  }

  public void setTransactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
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
