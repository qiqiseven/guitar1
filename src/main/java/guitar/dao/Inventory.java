package guitar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import guitar.dbutil.SQLiteJDBC;
import guitar.entity.Guitar;

public class Inventory {
	private List<Guitar> guitars;
	private String sql;
	private PreparedStatement pstmt;
	public Inventory() {
		guitars=new LinkedList<Guitar>();
	}
	public Guitar search(Guitar searchGuitar) {
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      // Ignore serial number since that's unique
	      // Ignore price since that's unique
	      String builder = searchGuitar.getBuilder();
	      if ((builder != null) && (!builder.equals("")) &&
	          (!builder.equals(guitar.getBuilder().toLowerCase())))
	        continue;
	      String model = searchGuitar.getModel();
	      if ((model != null) && (!model.equals("")) &&
	          (!model.equals(guitar.getModel().toLowerCase())))
	        continue;
	      String type = searchGuitar.getType();
	      if ((type != null) && (!searchGuitar.equals("")) &&
	          (!type.equals(guitar.getType().toLowerCase())))
	        continue;
	      String backWood = searchGuitar.getBackWood();
	      if ((backWood != null) && (!backWood.equals("")) &&
	          (!backWood.equals(guitar.getBackWood().toLowerCase())))
	        continue;
	      String topWood = searchGuitar.getTopWood();
	      if ((topWood != null) && (!topWood.equals("")) &&
	          (!topWood.equals(guitar.getTopWood().toLowerCase())))
	        continue;
	      return guitar;
	    }
	    return null;
	  }
	
	

}
