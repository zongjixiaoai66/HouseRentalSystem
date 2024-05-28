package com.dao;

import com.entity.HuzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuzhuVO;
import com.entity.view.HuzhuView;


/**
 * 户主
 * 
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public interface HuzhuDao extends BaseMapper<HuzhuEntity> {
	
	List<HuzhuVO> selectListVO(@Param("ew") Wrapper<HuzhuEntity> wrapper);
	
	HuzhuVO selectVO(@Param("ew") Wrapper<HuzhuEntity> wrapper);
	
	List<HuzhuView> selectListView(@Param("ew") Wrapper<HuzhuEntity> wrapper);

	List<HuzhuView> selectListView(Pagination page,@Param("ew") Wrapper<HuzhuEntity> wrapper);
	
	HuzhuView selectView(@Param("ew") Wrapper<HuzhuEntity> wrapper);
	
}
