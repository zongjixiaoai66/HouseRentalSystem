package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuzhuView;


/**
 * 户主
 *
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public interface HuzhuService extends IService<HuzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuzhuVO> selectListVO(Wrapper<HuzhuEntity> wrapper);
   	
   	HuzhuVO selectVO(@Param("ew") Wrapper<HuzhuEntity> wrapper);
   	
   	List<HuzhuView> selectListView(Wrapper<HuzhuEntity> wrapper);
   	
   	HuzhuView selectView(@Param("ew") Wrapper<HuzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuzhuEntity> wrapper);
   	
}

