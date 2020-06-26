package com.da.models;

import com.da.beans.AppointmentFixBean;
import com.da.beans.AppointmentTransferBean;
import com.da.daos.AppointmentFixDao;
import com.da.daos.AppointmentFixDaoImpl;

public class AppointmentFixModelImpl implements AppointmentFixModel {
	@Override
	public boolean addAppointment(AppointmentFixBean bean) {
	AppointmentFixDao dao=new AppointmentFixDaoImpl();
	return dao.addAppointment(bean);
	}
	@Override
	public int checkPatientCoupon(AppointmentFixBean bean) {
		AppointmentFixDao dao=new AppointmentFixDaoImpl();
		return dao.checkPatientCoupon(bean);
	}
	@Override
	public int checkPatientName_Phone(AppointmentFixBean bean) {
		AppointmentFixDao dao=new AppointmentFixDaoImpl();
		return dao.checkPatientName_Phone(bean);
	}
	@Override
	public boolean addAppointmentOldPatient(AppointmentFixBean bean) {
		AppointmentFixDao dao=new AppointmentFixDaoImpl();
		return dao.addAppointmentOldPatient(bean);
	}
	@Override
	public AppointmentTransferBean transferCheckPatientCoupon(AppointmentFixBean bean) {
		AppointmentFixDao dao=new AppointmentFixDaoImpl();
		return dao.transferCheckPatientCoupon(bean);
	}
	@Override
	public AppointmentTransferBean transferCheckPatientName_Phone(AppointmentFixBean bean) {
		AppointmentFixDao dao=new AppointmentFixDaoImpl();
		return dao.transferCheckPatientName_Phone(bean);
	}
	
	@Override
	public boolean transfer(AppointmentTransferBean transferBean) {
		AppointmentFixDao dao=new AppointmentFixDaoImpl();
		return dao.transfer(transferBean);
	}
}
