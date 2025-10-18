public class CinemaNest{
	//Vars
	private int age;
	private int numberTickets;
	private int isWeekday;
	private double totalPrice;

	//Set
	public void setAge(int age){
		this.age=age;
	}
	public void setNumberTickets(int numberTickets){
		this.numberTickets=numberTickets;
	}
	public void setIsWeekday(int isWeekday){
		this.isWeekday=isWeekday;
	}

	//Compute
	public void calTotalPrice(){
		if(isWeekday==0){
			if(age<18){
				totalPrice=numberTickets*10;
			}
			else{
				totalPrice=numberTickets*12.50;
			}
		}else{
			if(age<18){
				totalPrice=numberTickets*8;
			}
			else{
				totalPrice=numberTickets*10.50;
			}
		}
	}

	//Get
	public double getTotalPrice(){
		return totalPrice;
	}
}