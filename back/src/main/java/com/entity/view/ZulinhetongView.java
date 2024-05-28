package com.entity.view;

import com.entity.ZulinhetongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 租赁合同
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
@TableName("zulinhetong")
public class ZulinhetongView  extends ZulinhetongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZulinhetongView(){
	}
 
 	public ZulinhetongView(ZulinhetongEntity zulinhetongEntity){
 	try {
			BeanUtils.copyProperties(this, zulinhetongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
