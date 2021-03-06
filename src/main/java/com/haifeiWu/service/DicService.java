package com.haifeiWu.service;

import java.util.List;

import com.haifeiWu.entity.PHCSMP_Dic_Keeping_Way;
import com.haifeiWu.entity.PHCSMP_Dic_Leaving_Reason;
import com.haifeiWu.entity.PHCSMP_Dic_Treatment_Method;

public interface DicService {
	public List<PHCSMP_Dic_Leaving_Reason> findLeaveReason();

	public List<PHCSMP_Dic_Keeping_Way> findKeepingWay();
	
	public List<PHCSMP_Dic_Treatment_Method> findTreatmentMethod();
}
