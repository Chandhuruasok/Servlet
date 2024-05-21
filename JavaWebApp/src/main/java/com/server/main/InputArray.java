package com.server.main;
import java.util.ArrayList;

import com.server.model.PojoClass;
public class InputArray {
static ArrayList<PojoClass>array=new ArrayList<>();
public static void add(String userName,String email,String password,String confirmPassword,String birthdate,String phoneNumber,String gender,String food)
{
	PojoClass pojo=new PojoClass(userName,email,password,confirmPassword,birthdate,phoneNumber,gender,food);
	array.add(pojo);
	System.out.println(array);
}
public ArrayList<PojoClass> getArray() {
    return array;
}

}