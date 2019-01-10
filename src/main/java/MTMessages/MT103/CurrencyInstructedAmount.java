package MTMessages.MT103;

import MTMessages.Common.Constants;
import MTMessages.MT103.Interfaces.ITag;

public class CurrencyInstructedAmount implements ITag {
  private final static String tag = "33";
  private final static String option = "B";
  private final static String presence = "O";

  private String currency;
  private String instructedAmount;

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(String instructedAmount) {
    this.instructedAmount = instructedAmount;
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
    boolean isCurrencyValid = false;
    boolean isInstructedAmountValid = false;

    isCurrencyValid =(this.currency != null && this.currency.matches(Constants.currencyFormat));

    isInstructedAmountValid = (this.instructedAmount != null
                                  && this.instructedAmount.length() >= 2
                                  && this.instructedAmount.length() <= 15
                                  && this.instructedAmount.matches(Constants.amountFormat));

    return (isCurrencyValid && isInstructedAmountValid);
  }

}
