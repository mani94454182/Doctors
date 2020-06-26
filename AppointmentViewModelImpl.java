package com.da.models;

import java.util.List;

import com.da.beans.AppointmentViewBean;
import com.da.daos.AppointmentViewDao;
import com.da.daos.AppointmentViewDaoImpl;

public class AppointmentViewModelImpl implements AppointmentViewModel {
  @Override
public List<AppointmentViewBean> getAppointments(AppointmentViewBean viewBean) {
	  AppointmentViewDao viewDao=new AppointmentViewDaoImpl();
	  return viewDao.getAppointments(viewBean);
  }
  @Override
	public boolean updateAppointments(AppointmentViewBean viewBean) {
	  AppointmentViewDao viewDao=new AppointmentViewDaoImpl();
	  return viewDao.updateAppointments(viewBean);
	}
@Override
public List<AppointmentViewBean> getHistoryWithCouponNo(
		AppointmentViewBean viewBean) {
	AppointmentViewDao viewDao=new AppointmentViewDaoImpl();
	return viewDao.getHistoryWithCouponNo(viewBean);
}
@Override
public List<AppointmentViewBean> getHistoryWithNamePhone(
		AppointmentViewBean viewBean) {
	AppointmentViewDao viewDao=new AppointmentViewDaoImpl();
	return viewDao.getHistoryWithNamePhone(viewBean);
}
@Override
public List<AppointmentViewBean> getHistoryWithApptNo(
		AppointmentViewBean viewBean) {
	AppointmentViewDao viewDao=new AppointmentViewDaoImpl();
	return viewDao.getHistoryWithApptNo(viewBean);
}
}
