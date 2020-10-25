package uppercase.model;

import java.util.ArrayList;
import java.util.List;

public class TextConverterModel implements TextConverter
{

  private List<String> list = new ArrayList<>();

  @Override public String toUppercase(String text)
  {
    return text.toUpperCase();
  }

  @Override public void addLog(String log)
  {
    list.add(list.size()+1 +". " + log);
  }

  @Override  public List<String> getList()
  {
    return list;
  }

  private int getLogSize(){
    return list.size();
  }
}
