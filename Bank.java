/******************************************************************************

 (opening/closing of an account, 
deposit/withdrawal of an amount, and checking the balance). 
*******************************************************************************/
class bank{
    
        String name;
        String Address;
        int Acount_number;
    
        int acount_balance=0;

    public bank(String name,String Address,int Acount_number)
    {
        this.name=name;  
        this.Address=Address;  
        this.Acount_number=Acount_number;
    }
    void show_details(){
        System.out.print("\n_______________________________________________________\n");
        System.out.println("Name\t\t"+name );
        System.out.println("Address\t\t"+Address );
        System.out.println("Acount_number\t"+Acount_number );
        System.out.println("Account_balance\t"+acount_balance );
        System.out.print("\n_______________________________________________________\n");
    }
    void deposit(int amount){
        System.out.print("\n_______________________________________________________\n");
        if(amount>0){
            acount_balance+=amount;
            System.out.print("\n Amount Rs "+amount+" is deposited in the Account of "+name+" \n");
        }
        else{
            System.out.println("Please Enter Valid Sum/t/t");
        }
        System.out.print("\n_______________________________________________________\n");
    }
    void withdrawal(int amount){
        System.out.print("\n_______________________________________________________\n");
        if( acount_balance>amount){
            acount_balance-=amount;
        System.out.print("\n Amount of Rs."+amount+" is deducted from Account of "+name+" \n");

        }
        else{
            System.out.println(name+"\nYou have INSUFFICENT BALANCE please check your Balance \t\t");
        }
        System.out.print("\n_______________________________________________________\n");
    }
    void check_balance(){
        System.out.print("\n_______________________________________________________\n");
        System.out.println(name+" your account balance:\t Rs"+acount_balance);
    System.out.print("\n_______________________________________________________\n");
        
    }
}

 
public class Main
{
    
//Function  to genrate random Acount number of 5 digits
public static int acount_Number_genrator(){
    int max=100000;
	    int min=990000;
		int acount_Number = (int) (Math.random()*(max-min)) + min;
	
            return acount_Number;
		
    
}
    
    // MAIN FUNCTION
	public static void main(String[] args) {
	  

    //new object represented as p1 -> person1;
        // ____________________PERSON 1________________________________
        
		bank p1=new bank("Tushar","Dehradun",acount_Number_genrator());
		p1.deposit(10000);
		p1.check_balance();
		p1.show_details();
        // System.out.print(p1.name+" your acount is succesfully CLOSED!");
        // p1=null;
        // ___________________________________________________________
		
		
		// ____________________PERSON 2________________________________
		bank p2=new bank("Arun","Bangalore",acount_Number_genrator());
		p2.deposit(20000);
		p2.withdrawal(4500);
		p2.show_details();
        //______________________________________________________________ 			
		
	
		
	}
}
