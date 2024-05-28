package com.dao;

import com.entity.ShouzuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouzuxinxiVO;
import com.entity.view.ShouzuxinxiView;


/**
 * 收租信息
 * 
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public interface ShouzuxinxiDao extends BaseMapper<ShouzuxinxiEntity> {
	
	List<ShouzuxinxiVO> selectListVO(@Param("ew") Wrapper<ShouzuxinxiEntity> wrapper);
	
	ShouzuxinxiVO selectVO(@Param("ew") Wrapper<ShouzuxinxiEntity> wrapper);
	
	List<ShouzuxinxiView> selectListView(@Param("ew") Wrapper<ShouzuxinxiEntity> wrapper);

	List<ShouzuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShouzuxinxiEntity> wrapper);
	
	ShouzuxinxiView selectView(@Param("ew") Wrapper<ShouzuxinxiEntity> wrapper);
	
}
