package MTMessages.MT103.Enums;

public enum InstructionCodeType
{
  //Check
  //Pay beneficiary customer by check, the optional account number line in field 59A must not be used
   CHQB,

  //Corporate Trade
  //Payment is made in settlement of a trade, for example, foreign ex-change, securities transactions
   CORT,

  //Hold
  //Beneficiary customer will call and pay upon identification
   HOLD,

  //Intra-Company Payment
  //A payment between two companies belonging to the same group
   INTC,

  //Phone Beneficiary
  //Please advise beneficiary by phone
   PHOB,

  //Phone Intermediary
  //Please advise the intermediary institution by phone
   PHOI,

  //Telephone
  //Please advise account  with institution by phone
   PHON,

  //Related Payment
  //Payment has a related e-Payments reference
   REPA,

  //Same Day Value
  //Payment must to executed same day value to the beneficiary
   SDVA,

  //Telecommunication
  //Please advise beneficiary by the most efficient means of telecommunication
   TELB,

  //Telecommunication
  //Please advise account with institution by the most efficient means of telecommunication
   TELE,

  //Telecommunication
  ////Please advise intermediary with institution by the most efficient means of telecommunication
   TELI
}
