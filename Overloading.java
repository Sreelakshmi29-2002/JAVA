class Over
{
  float pi=3.14f;
  
  void area(int r)
  {
      System.out.println("Area of circle:"+(pi*r*r));
      }
      void area(int length,int bredth)
      {
        System.out.println("Area of rectangle:"+(length*bredth));
        }
        }
    class Overloading
    {
      public static void main(String args[])
      {
        Over O=new Over();
        O.area(2);
        O.area(2,4);
        }
        }
