package MTMessages.MT103;

import MTMessages.MT103.Interfaces.ITag;

public class ValueDtCurrencyInterBankAmount implements ITag {

  private final String tag = "32";
  private final String option  = "A";
  private final String presence = "M";
  private String valueDate;

  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  private String currency;
  private String amount;

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
