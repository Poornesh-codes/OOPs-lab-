/* a) Develop a Java program to create an abstract class Energy_Source with members Source ID, Source Name, and Energy Generated (in kWh). Include an abstract method calculate_Efficiency(). Derive the classes Solar_Energy and Wind_Energy from Energy_Source and implement the method based on the following criteria: 

Forac, efficiency is calculated as (Energy Generated / 5000) × 100. 

For Wind_Energy, efficiency is calculated as (Energy Generated / 8000) × 100. Display source details and efficiency percentage. 





NOTE: The below part of the question shall be integrated into the above program after the concept has been taught in the class.

Demonstrate dynamic method dispatch using an Energy_Source reference.
E-> Energy source S -> solar energy ,w->wind energy
*/

abstract class E
{
	int source_id;
	String source_name;
	int Energy_Generated;
	abstract void calculateE();
	public E(int id,String Sn,int e)
	{
		source_id=id;
		source_name=Sn;
		Energy_Generated = e;

	}
}
class S extends E
{
	public S(int a,String b,int c){
		super(a,b,c);
	}
	public void calculateE(){
		
		System.out.println("efficiency"+((Energy_Generated)/5000)*100);
}
}
class w extends E
{
	public w(int a,String b,int c){
		super(a,b,c);
	}
	
	public void calculateE(){
		
		System.out.println("efficiency"+((Energy_Generated)/8000)*100);
}
}
class Main{
public static void main(String[] args){
	E so = new S(12,"star",10000);
	so.calculateE();
	E wi  = new w(11,"mw",5000);
	wi.calculateE();
}}
	
