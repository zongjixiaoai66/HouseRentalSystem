package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KanfangshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KanfangshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KanfangshenqingView;


/**
 * 看房申请
 *
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public interface KanfangshenqingService extends IService<KanfangshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KanfangshenqingVO> selectListVO(Wrapper<KanfangshenqingEntity> wrapper);
   	
   	KanfangshenqingVO selectVO(@Param("ew") Wrapper<KanfangshenqingEntity> wrapper);
   	
   	List<KanfangshenqingView> selectListView(Wrapper<KanfangshenqingEntity> wrapper);
   	
   	KanfangshenqingView selectView(@Param("ew") Wrapper<KanfangshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KanfangshenqingEntity> wrapper);
   	
}

