package com.entity.vo;

import com.entity.ShouzutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 收租统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public class ShouzutongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 收租人数
	 */
	
	private Integer shouzurenshu;
		
	/**
	 * 收租金额
	 */
	
	private Integer shouzujine;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 月份
	 */
	
	private String yuefen;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：收租人数
	 */
	 
	public void setShouzurenshu(Integer shouzurenshu) {
		this.shouzurenshu = shouzurenshu;
	}
	
	/**
	 * 获取：收租人数
	 */
	public Integer getShouzurenshu() {
		return shouzurenshu;
	}
				
	
	/**
	 * 设置：收租金额
	 */
	 
	public void setShouzujine(Integer shouzujine) {
		this.shouzujine = shouzujine;
	}
	
	/**
	 * 获取：收租金额
	 */
	public Integer getShouzujine() {
		return shouzujine;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：月份
	 */
	 
	public void setYuefen(String yuefen) {
		this.yuefen = yuefen;
	}
	
	/**
	 * 获取：月份
	 */
	public String getYuefen() {
		return yuefen;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
