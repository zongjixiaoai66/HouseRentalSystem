package com.dao;

import com.entity.ZulinhetongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZulinhetongVO;
import com.entity.view.ZulinhetongView;


/**
 * 租赁合同
 * 
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public interface ZulinhetongDao extends BaseMapper<ZulinhetongEntity> {
	
	List<ZulinhetongVO> selectListVO(@Param("ew") Wrapper<ZulinhetongEntity> wrapper);
	
	ZulinhetongVO selectVO(@Param("ew") Wrapper<ZulinhetongEntity> wrapper);
	
	List<ZulinhetongView> selectListView(@Param("ew") Wrapper<ZulinhetongEntity> wrapper);

	List<ZulinhetongView> selectListView(Pagination page,@Param("ew") Wrapper<ZulinhetongEntity> wrapper);
	
	ZulinhetongView selectView(@Param("ew") Wrapper<ZulinhetongEntity> wrapper);
	
}
