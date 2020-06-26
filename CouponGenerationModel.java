package com.da.models;

import java.util.List;

import com.da.beans.CouponBean;

public interface CouponGenerationModel {
	public List<CouponBean> getDoctors(CouponBean bean);
	public List<CouponBean> getCouponNumbers(CouponBean bean);
	public String getDoctorName(int doctorId);
}
