package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouzuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouzuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouzuxinxiView;


/**
 * 收租信息
 *
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public interface ShouzuxinxiService extends IService<ShouzuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouzuxinxiVO> selectListVO(Wrapper<ShouzuxinxiEntity> wrapper);
   	
   	ShouzuxinxiVO selectVO(@Param("ew") Wrapper<ShouzuxinxiEntity> wrapper);
   	
   	List<ShouzuxinxiView> selectListView(Wrapper<ShouzuxinxiEntity> wrapper);
   	
   	ShouzuxinxiView selectView(@Param("ew") Wrapper<ShouzuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouzuxinxiEntity> wrapper);
   	
}

