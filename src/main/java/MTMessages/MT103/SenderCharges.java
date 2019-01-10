package MTMessages.MT103;

import MTMessages.Common.Constants;
import MTMessages.MT103.Interfaces.ITag;

public class SenderCharges implements ITag {
  private final static String tag = "71";
  private final static String option  = "F";
  private final static String presence = "O";
  private String currency;
  private String amount;

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
    boolean isCurrencyValid  = false;
    boolean isAmountValid  = false;

    isCurrencyValid = (this.currency != null && this.currency.matches(Constants.currencyFormat));

    isAmountValid = (this.amount != null && this.amount.length() >= 2 && this.amount.length() <= 15 && this.amount.matches(Constants.amountFormat));

    return  (isCurrencyValid && isAmountValid);
  }
}
