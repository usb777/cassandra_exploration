package com.casexp;
import com.datastax.driver.core.*;


public class CRUD {

	public static void main(String[] args) {
		 String query = "SELECT * FROM emp";

	      //Creating Cluster object
	      Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
	    
	      //Creating Session object
	      Session session = cluster.connect("dzen");
	    
	      //Getting the ResultSet
	      ResultSet result = session.execute(query);
	    
	      System.out.println(result.all());
	      String queryUpdate = " UPDATE emp SET emp_city='Grodno',emp_sal=50000 where emp_id=1";
	      
	      ResultSet resultUpdate = session.execute(queryUpdate);
	      System.out.println(result.all());
	      
	      String queryInsert = "INSERT INTO emp (emp_id, emp_name, emp_city, emp_phone,  emp_sal)"
	    			
         + " VALUES(5,'Vasia', 'Minsk', 9848022338, 50000);" ;
	      
	      ResultSet resultInsert = session.execute(queryInsert);
	      
	      result = session.execute(query);
	      System.out.println(result.all());
	      
	      String queryDelete = "Delete FROM emp  where emp_id=5";
	      ResultSet resultDelete = session.execute(queryDelete); 
	      
	      result = session.execute(query);
	      System.out.println(result.all());
	      session.close();
	      
	      
	      
	      System.exit(0);

	}

}
