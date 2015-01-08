public class Person{
		
		float height;
		float weight;
		
		//constructor
		public Person()
		{
			this.height =  61;
			this.weight =  200;
		}
		
		public void walks(){
			this.weight*= 0.9;
			System.out.println("You have lost weight");
			System.out.println("You weigh: "+ this.weight + "lbs");
			
		}
		
		public void eat(){
			
			this.weight *=1.2;
			System.out.println("You have gain weight");
			System.out.println("You weigh: "+ this.weight + "lbs");
		}
	} 