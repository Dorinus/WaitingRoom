package uppercase.model;

import java.util.List;

public interface TextConverter
{
  public String toUppercase(String text);
  public void addLog(String log);
  public List<String> getList();
}


