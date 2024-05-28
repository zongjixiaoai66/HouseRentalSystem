package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZukeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZukeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZukeView;


/**
 * 租客
 *
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public interface ZukeService extends IService<ZukeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZukeVO> selectListVO(Wrapper<ZukeEntity> wrapper);
   	
   	ZukeVO selectVO(@Param("ew") Wrapper<ZukeEntity> wrapper);
   	
   	List<ZukeView> selectListView(Wrapper<ZukeEntity> wrapper);
   	
   	ZukeView selectView(@Param("ew") Wrapper<ZukeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZukeEntity> wrapper);
   	
}

