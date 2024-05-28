package com.dao;

import com.entity.WeixiushujuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiushujuVO;
import com.entity.view.WeixiushujuView;


/**
 * 维修数据
 * 
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public interface WeixiushujuDao extends BaseMapper<WeixiushujuEntity> {
	
	List<WeixiushujuVO> selectListVO(@Param("ew") Wrapper<WeixiushujuEntity> wrapper);
	
	WeixiushujuVO selectVO(@Param("ew") Wrapper<WeixiushujuEntity> wrapper);
	
	List<WeixiushujuView> selectListView(@Param("ew") Wrapper<WeixiushujuEntity> wrapper);

	List<WeixiushujuView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiushujuEntity> wrapper);
	
	WeixiushujuView selectView(@Param("ew") Wrapper<WeixiushujuEntity> wrapper);
	
}
