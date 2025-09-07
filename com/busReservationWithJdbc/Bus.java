package com.busReservationWithJdbc;

public class Bus {

	
	//instance variables  // private for instance var is best
	
	// these all instance var is known as models in database because using the same name for database column (mvc)
	
		private int busNo;   // Encapsulation (data hiding)
		
		private boolean ac;
		
		private int capacity;   //use get and set method ....
		
		//Constructor...
		
		
		Bus(int no, boolean ac, int cap){
			this.busNo = no;
			this.ac = ac;
			this.capacity = cap;
		}
		
		
		// get method for all instance var
		
		public int getCapacity() {  //accessor method
			return capacity;
		}
		
		public void setCapacity(int cap) {    //mutator method
			capacity = cap;
		}
		
		public boolean getAc() {
			return ac;
		}
		
		public void setAc(boolean val) {
			ac = val;
		}
		
		public int getBusNo() {
			return busNo;
		}
		// to print bus info 
		
//		public void displayBusInfo() {
//			System.out.println("Bus No: " + busNo+ " " + "AC :" + ac + " "+"Total Capacity: " + capacity );
//		}
		
	
}
