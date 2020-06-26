package com.da.models;

import com.da.beans.AppointmentFixBean;
import com.da.beans.AppointmentTransferBean;

public interface AppointmentFixModel {
	public boolean addAppointment(AppointmentFixBean bean);
	public boolean addAppointmentOldPatient(AppointmentFixBean bean);
	public int checkPatientCoupon(AppointmentFixBean bean);
	public int checkPatientName_Phone(AppointmentFixBean bean);
	public AppointmentTransferBean transferCheckPatientCoupon(AppointmentFixBean bean);
	public AppointmentTransferBean transferCheckPatientName_Phone(AppointmentFixBean bean);
	
	public boolean transfer(AppointmentTransferBean transferBean);
}
