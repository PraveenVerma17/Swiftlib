package MTMessages.Common;
import java.util.Arrays;
import java.util.List;

public class Constants {
  public static final String tagStart = ":";
  public static final String tagEnd = ":";
  public static final List<String> ruleC2CntryList = Arrays.asList(
          "AD", "AT", "BE", "BG", "BV", "CH", "CY", "CZ", "DE", "DK", "ES", "EE", "FI",
          "FR", "GB", "GF", "GI", "GP", "GR", "HU", "IE", "IS", "IT", "LI", "LT", "LU",
          "LV", "MC", "MQ", "MT", "NL", "NO", "PL", "PM", "PT", "RE", "RO", "SE", "SI",
          "SJ", "SK", "SM", "TF", "VA"
  );

  public static final String swiftBicFormat = "[A-Z]{4}[A-Z]{2}[0-9A-Z]{2}([0-9A-Z]{3})?";
  public static final String senderReferenceFormat = "[0-9a-zA-Z/?:().',+-]{1,16}";
  public static final String partyIdentifierFormat = "/(C/|D/)?[0-9a-zA-Z/\\-\\?:\\(\\)\\.,'\\+ ]{1,34}";
}
