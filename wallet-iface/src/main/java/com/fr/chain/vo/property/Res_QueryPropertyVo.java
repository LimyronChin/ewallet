package com.fr.chain.vo.property;

import java.util.ArrayList;
import java.util.List;

import com.fr.chain.message.MsgBody;

import lombok.Data;

@Data
public class Res_QueryPropertyVo extends MsgBody{
	
	//资产详情
	private List<PropertyInfo> propertyinfolist;  //查询多条
	
	@Data
	public static class PropertyInfo{	
		private String propertytype; //资产类型
		private String productid;
		private String productdesc;
		private String signtype;
		private String propertyname;	
		private String unit;
		private String mincount;
		private String count;
		private String url;
		private String description;		
		private String status;
	}
	
	public Res_QueryPropertyVo(){	
		propertyinfolist = new ArrayList<PropertyInfo> ();
	}
	
	public Res_QueryPropertyVo(String datano){
		this.datano = datano;
		propertyinfolist = new ArrayList<PropertyInfo> ();
	}
}
