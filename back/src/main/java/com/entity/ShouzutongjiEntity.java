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
 * 收租统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
@TableName("shouzutongji")
public class ShouzutongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShouzutongjiEntity() {
		
	}
	
	public ShouzutongjiEntity(T t) {
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
	 * 收租统计
	 */
					
	private String shouzutongji;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：收租统计
	 */
	public void setShouzutongji(String shouzutongji) {
		this.shouzutongji = shouzutongji;
	}
	/**
	 * 获取：收租统计
	 */
	public String getShouzutongji() {
		return shouzutongji;
	}
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
