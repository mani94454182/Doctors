package com.da.models;

import com.da.beans.LoginBean;
import com.da.daos.LoginDAO;
import com.da.daos.LoginDAOImpl;

public class LoginModelImpl implements LoginModel {
	@Override
	public String authenticate(LoginBean bean) {
		LoginDAO dao=new LoginDAOImpl();
		return dao.authenticate(bean);
	}
}
