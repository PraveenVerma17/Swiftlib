package MTMessages.MT103.NetworkValidationRules;
import MTMessages.Common.Constants;
import MTMessages.MT103.AccountWithInstitution_A;
import MTMessages.MT103.MT103;

import java.util.ArrayList;
import java.util.List;

public class NetworkValidationRules {

  public static NetworkValidationResponse validateRules(MT103 message)
  {
     NetworkValidationResponse response  = new NetworkValidationResponse();
     List<ValidationRule> violations = new ArrayList<>();
     response.setValid(true);
     response.setRulesList(violations);

    /**
     *  Rules C1
     *  If field 33B is not present then 36B is not allowed.
     */

      if(message.getCurrencyInstructedAmount() == null && message.getExchangeRate() !=null)
      {
         ValidationRule rule = new ValidationRule();
         rule.setRuleCode("C1");
         violations.add(rule);
         response.setValid(false);
      }

    /**
     * if 33B is present and currency code of 33B and currency code of 32A is same then no need for exchange rate (field 36)
     * if currency code is not same then exchange rate is mandatory.
     */

    if(message.getCurrencyInstructedAmount() !=null
              && message.getCurrencyInstructedAmount().getCurrency() !=null
              && message.getValueDtCurrencyInterBankAmount() != null
              && message.getValueDtCurrencyInterBankAmount().getCurrency() != null)
      {
         if(message.getCurrencyInstructedAmount().getCurrency().equals(message.getValueDtCurrencyInterBankAmount().getCurrency()))
         {
            if(message.getExchangeRate() !=null)
            {
              ValidationRule rule = new ValidationRule();
              rule.setRuleCode("C1");
              violations.add(rule);
              response.setValid(false);
            }
         }
         else
         {
            if(message.getExchangeRate() == null)
            {
              ValidationRule rule = new ValidationRule();
              rule.setRuleCode("C1");
              violations.add(rule);
              response.setValid(false);
            }
         }
      }

    return response;
  }

}
