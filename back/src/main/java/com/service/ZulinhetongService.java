package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZulinhetongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZulinhetongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZulinhetongView;


/**
 * 租赁合同
 *
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public interface ZulinhetongService extends IService<ZulinhetongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZulinhetongVO> selectListVO(Wrapper<ZulinhetongEntity> wrapper);
   	
   	ZulinhetongVO selectVO(@Param("ew") Wrapper<ZulinhetongEntity> wrapper);
   	
   	List<ZulinhetongView> selectListView(Wrapper<ZulinhetongEntity> wrapper);
   	
   	ZulinhetongView selectView(@Param("ew") Wrapper<ZulinhetongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZulinhetongEntity> wrapper);
   	
}

