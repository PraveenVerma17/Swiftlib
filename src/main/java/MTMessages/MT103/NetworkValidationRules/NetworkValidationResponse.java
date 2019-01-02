package MTMessages.MT103.NetworkValidationRules;

import java.util.List;

public class NetworkValidationResponse {
  private boolean isValid;
  private List<ValidationRule> rulesList;

  public boolean isValid() {
    return isValid;
  }

  public void setValid(boolean valid) {
    isValid = valid;
  }

  public List<ValidationRule> getRulesList() {
    return rulesList;
  }

  public void setRulesList(List<ValidationRule> rulesList) {
    this.rulesList = rulesList;
  }
}





