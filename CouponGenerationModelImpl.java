package com.da.models;

import java.util.List;

import com.da.beans.CouponBean;
import com.da.daos.CouponGenerationDao;
import com.da.daos.CouponGenerationDaoImpl;

public class CouponGenerationModelImpl implements CouponGenerationModel {
	@Override
	public List<CouponBean> getDoctors(CouponBean bean) {
		CouponGenerationDao dao=new CouponGenerationDaoImpl();
		return dao.getDoctors(bean);
	}
	@Override
	public List<CouponBean> getCouponNumbers(CouponBean bean) {
		CouponGenerationDao dao=new CouponGenerationDaoImpl();
		return dao.getCouponNumbers(bean);
	}
	@Override
	public String getDoctorName(int doctorId) {
		CouponGenerationDao dao=new CouponGenerationDaoImpl();
		return dao.getDoctorName(doctorId);
	}
}
