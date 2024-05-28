package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 维修数据
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
@TableName("weixiushuju")
public class WeixiushujuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeixiushujuEntity() {
		
	}
	
	public WeixiushujuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 维修物品
	 */
					
	private String weixiuwupin;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：维修物品
	 */
	public void setWeixiuwupin(String weixiuwupin) {
		this.weixiuwupin = weixiuwupin;
	}
	/**
	 * 获取：维修物品
	 */
	public String getWeixiuwupin() {
		return weixiuwupin;
	}
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
