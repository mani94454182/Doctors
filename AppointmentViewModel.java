package com.da.models;

import java.util.List;

import com.da.beans.AppointmentViewBean;

public interface AppointmentViewModel {
	public List<AppointmentViewBean> getAppointments(AppointmentViewBean viewBean);
	public boolean updateAppointments(AppointmentViewBean viewBean);
	
	public List<AppointmentViewBean> getHistoryWithCouponNo(AppointmentViewBean viewBean);
	public List<AppointmentViewBean> getHistoryWithNamePhone(AppointmentViewBean viewBean);
	public List<AppointmentViewBean> getHistoryWithApptNo(AppointmentViewBean viewBean);
}
