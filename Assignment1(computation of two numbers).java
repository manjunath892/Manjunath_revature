

public class m
{
  public static void main (String[] args)
  {
    int a, b, c, d;
    Compute obj = new Compute ();
      a = obj.add (5, 2);
      b = obj.sub (10,6);
      c = obj.mul (5, 4);
      d = obj.div (6, 3);
      System.out.println("add: "+a);
      System.out.println("sub: "+b);
      System.out.println("mul: "+c);
      System.out.println("div: "+d);
}
}
class Compute
{
  int add (int a, int b)
  {
    return a + b;
  }
  int sub (int a, int b)
  {
    return a - b;

  }
  int mul (int a, int b)
  {
    return a * b;
  }
  int div (int a, int b)
  {
    return a / b;
  }
}