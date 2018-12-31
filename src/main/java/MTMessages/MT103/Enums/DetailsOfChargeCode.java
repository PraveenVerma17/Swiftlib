package MTMessages.MT103.Enums;

public enum DetailsOfChargeCode {

  //Beneficiary
  // All transaction charges are to be borne by the beneficiary
  BEN,

  //Our customer charged
  // All transaction charges are to be borne by the ordering customer
  OUR,

  //Shared charges
  // All transaction charges other than the charges of the financial institution servicing the ordering customer
  // account are borne by the beneficiary customer
  SHA

}
