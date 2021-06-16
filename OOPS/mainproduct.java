import java.util.Scanner;
class product
{
   int pcode;
   double price;
   String pname;
   void setdata(int code,double pri,String name)
   {
     pcode=code;
     price=pri;
     pname=name;
     
   }
   void getdata()
   {
      System.out.println("Product name:"+pname);
      System.out.println("Product code:"+pcode);
      System.out.println("Product price:"+price);
   }
   void lowprice(product p1,product p2)
   {
      if(price<=p1.price && p1.price<=p2.price)
         System.out.println(price+"has the smallest price");
      else if(p1.price<=price && p1.price<=p2.price)
          System.out.println(p1.price+"has the smallest price");
      else
          System.out.println(p2.price+"has the smallest price");
   }
}
class mainproduct
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      int code;
      double pri;
      String name;
      product p1 = new product();
      product p2 = new product();
      product p3 = new product();
      System.out.println("Enter the details of first product:");
      System.out.println("Enter the product name:");
      name=s.nextLine();
      System.out.println("Enter the product code:");
      code=s.nextInt();
      System.out.println("Enter the product price:");
      pri=s.nextDouble();
      p1.setdata(code,pri,name);
      System.out.println("Enter the details of second product:");
      System.out.println("Enter the product name:");
      name=s.nextLine();
      System.out.println("Enter the product code:");
      code=s.nextInt();
      System.out.println("Enter the product price:");
      pri=s.nextDouble();
      p2.setdata(code,pri,name);
      System.out.println("Enter the details of second product:");
      System.out.println("Enter the product name:");
      name=s.nextLine();
      System.out.println("Enter the product code:");
      code=s.nextInt();
      System.out.println("Enter the product price:");
      pri=s.nextDouble();
      p3.setdata(code,pri,name);
      System.out.println("product 1");
      p1.getdata();
      System.out.println("product 2");
      p2.getdata();
      System.out.println("product 1");
      p3.getdata();
      p1.lowprice(p2,p3);
}
} 
      
      
      