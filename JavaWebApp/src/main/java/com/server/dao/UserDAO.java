package com.server.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.server.model.PojoNew;

public interface UserDAO {
  ArrayList<PojoNew> selectAllusers() throws ClassNotFoundException,SQLException;
	


}
