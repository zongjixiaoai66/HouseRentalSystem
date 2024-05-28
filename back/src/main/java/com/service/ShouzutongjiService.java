package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouzutongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouzutongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouzutongjiView;


/**
 * 收租统计
 *
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public interface ShouzutongjiService extends IService<ShouzutongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouzutongjiVO> selectListVO(Wrapper<ShouzutongjiEntity> wrapper);
   	
   	ShouzutongjiVO selectVO(@Param("ew") Wrapper<ShouzutongjiEntity> wrapper);
   	
   	List<ShouzutongjiView> selectListView(Wrapper<ShouzutongjiEntity> wrapper);
   	
   	ShouzutongjiView selectView(@Param("ew") Wrapper<ShouzutongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouzutongjiEntity> wrapper);
   	
}

