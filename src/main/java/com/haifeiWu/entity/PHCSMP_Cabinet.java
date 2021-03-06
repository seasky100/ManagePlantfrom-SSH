package com.haifeiWu.entity;

import java.io.Serializable;

/**
 * 保管柜信息表
 * 
 * @author wuhaifei
 * 
 * @date 2016年8月9日
 */
public class PHCSMP_Cabinet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6970445063811123978L;

	private int cabinet_ID;
	private String cabinet_Number;// 保管柜编号（主键）
	private String cabinet_Desc;// 保管柜描述

	public int getCabinet_ID() {
		return cabinet_ID;
	}

	public void setCabinet_ID(int cabinet_ID) {
		this.cabinet_ID = cabinet_ID;
	}

	public String getCabinet_Number() {
		return cabinet_Number;
	}

	public void setCabinet_Number(String cabinet_Number) {
		this.cabinet_Number = cabinet_Number;
	}

	public String getCabinet_Desc() {
		return cabinet_Desc;
	}

	public void setCabinet_Desc(String cabinet_Desc) {
		this.cabinet_Desc = cabinet_Desc;
	}

}
