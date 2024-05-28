package com.entity.view;

import com.entity.ZukeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 租客
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
@TableName("zuke")
public class ZukeView  extends ZukeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZukeView(){
	}
 
 	public ZukeView(ZukeEntity zukeEntity){
 	try {
			BeanUtils.copyProperties(this, zukeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
