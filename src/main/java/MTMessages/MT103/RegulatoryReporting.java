package MTMessages.MT103;

import MTMessages.MT103.Interfaces.ITag;
import java.util.List;

public class RegulatoryReporting implements ITag {
  private final String tag = "77";
  private final String option = "B";
  private final String presence = "O";
  private List<String> regulatoryLines;


  public List<String> getRegulatoryLines() {
    return regulatoryLines;
  }

  public void setRegulatoryLines(List<String> regulatoryLines) {
    this.regulatoryLines = regulatoryLines;
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
