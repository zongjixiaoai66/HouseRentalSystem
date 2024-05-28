package com.entity.model;

import com.entity.WeixiushujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 维修数据
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public class WeixiushujuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 维修次数
	 */
	
	private Integer weixiucishu;
		
	/**
	 * 月份
	 */
	
	private String yuefen;
		
	/**
	 * 维修人员
	 */
	
	private String weixiurenyuan;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：维修次数
	 */
	 
	public void setWeixiucishu(Integer weixiucishu) {
		this.weixiucishu = weixiucishu;
	}
	
	/**
	 * 获取：维修次数
	 */
	public Integer getWeixiucishu() {
		return weixiucishu;
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
	 * 设置：维修人员
	 */
	 
	public void setWeixiurenyuan(String weixiurenyuan) {
		this.weixiurenyuan = weixiurenyuan;
	}
	
	/**
	 * 获取：维修人员
	 */
	public String getWeixiurenyuan() {
		return weixiurenyuan;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
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
