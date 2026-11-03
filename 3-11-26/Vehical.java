interface ParkingCharge
{
   void calculatecharge();
   void display();
}
class vehicleparking{
   String N;
   String t;
   int p;
   vehicleparking(String Na,String Ty,int pr){
      N=Na;
      t=Ty;
      p=pr;
   }
}
class Twowheeler extends vehicleparking implements ParkingCharge
{
   double charge;
   Twowheeler(String N,int p){
      super( N, "two wheeler",p);
    }
    public void calculatecharge(){
      if (p<=2){
         charge = 20*p;
      }
      else{
         charge=(20*2)+10*(p-2);
      }
    }
    public void display(){
      System.out.println("vehicle number:"+N);
      System.out.println("vehicle type"+t);
      System.out.println("parking hours"+p);
      calculatecharge();
      System.out.println("rs:"+charge);
    }
}
class Fourwheeler extends vehicleparking implements ParkingCharge
{
   double charge;
   Fourwheeler(String N,int p){
      super( N, "four wheeler", p);
    }
    public void calculatecharge(){
      if (p<=2){
         charge = 50*p;
      }
      else{
         charge=(50*2)+30*(p-2);
      }
    }
    public void display(){
      System.out.println("vehicle number:"+N);
      System.out.println("vehicle type : "+t);
      System.out.println("parking hours: "+p);
      calculatecharge();
      System.out.println("rs:"+charge);
    }
}
public class Vehical
{
   public static void main(String[] args){
      ParkingCharge p;
      p = new Twowheeler("k122",4);
      p.display();
      System.out.println("===========");
      p = new Fourwheeler("k33",3);
      p.display();
   }
}
