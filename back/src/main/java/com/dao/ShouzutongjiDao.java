package com.dao;

import com.entity.ShouzutongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouzutongjiVO;
import com.entity.view.ShouzutongjiView;


/**
 * 收租统计
 * 
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public interface ShouzutongjiDao extends BaseMapper<ShouzutongjiEntity> {
	
	List<ShouzutongjiVO> selectListVO(@Param("ew") Wrapper<ShouzutongjiEntity> wrapper);
	
	ShouzutongjiVO selectVO(@Param("ew") Wrapper<ShouzutongjiEntity> wrapper);
	
	List<ShouzutongjiView> selectListView(@Param("ew") Wrapper<ShouzutongjiEntity> wrapper);

	List<ShouzutongjiView> selectListView(Pagination page,@Param("ew") Wrapper<ShouzutongjiEntity> wrapper);
	
	ShouzutongjiView selectView(@Param("ew") Wrapper<ShouzutongjiEntity> wrapper);
	
}
