package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiushujuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiushujuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiushujuView;


/**
 * 维修数据
 *
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public interface WeixiushujuService extends IService<WeixiushujuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiushujuVO> selectListVO(Wrapper<WeixiushujuEntity> wrapper);
   	
   	WeixiushujuVO selectVO(@Param("ew") Wrapper<WeixiushujuEntity> wrapper);
   	
   	List<WeixiushujuView> selectListView(Wrapper<WeixiushujuEntity> wrapper);
   	
   	WeixiushujuView selectView(@Param("ew") Wrapper<WeixiushujuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiushujuEntity> wrapper);
   	
}

