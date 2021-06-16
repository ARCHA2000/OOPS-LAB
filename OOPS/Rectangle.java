class Rectangle{
   float length,bredth;
   void setData(float l,float b)
   {
     length = l;
     bredth = b;
   }
   void getArea()
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
      area1 = R1.getArea( length , bredth );
      System.out.println("Area of Rectangle " + area1);
   }
}
