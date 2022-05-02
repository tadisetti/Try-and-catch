import java.util.*;
class NumberFormatException
  {
    public static void main(String args[])
    {
      String str="123 ";
        int x=Integer.parseInt(str);
      try
        {
      System.out.println(x);
          }
      catch(Exception e)
        {
          System.out.print("NumberFormatException");
        }
    }
  }