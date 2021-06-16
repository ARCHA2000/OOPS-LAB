class Rectangle
{
   float length;
   float bredth;

   void setData(float l,float b)
   {
     length = l;
     bredth = b;
   }
   float getArea()
   {
      return length * bredth;
   }

}

class Rarea
{
   public static void main(String args[])
   {
      Rectangle R1 = new Rectangle();
      R1.setData(12.4f,13f);
      float A1 = R1.getArea();
      System.out.println("Area of Rectangle1 " + A1);
      R1.setData(10.5f,9f);
      float A2 = R1.getArea();
      System.out.println("Area of Rectangle1 " + A2);
      R1.setData(13f,14f);
      float A3 = R1.getArea();
      System.out.println("Area of Rectangle1 " + A3);
   }
}
