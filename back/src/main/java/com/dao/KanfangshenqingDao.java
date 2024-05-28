package com.dao;

import com.entity.KanfangshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KanfangshenqingVO;
import com.entity.view.KanfangshenqingView;


/**
 * 看房申请
 * 
 * @author 
 * @email 
 * @date 2021-03-13 12:56:24
 */
public interface KanfangshenqingDao extends BaseMapper<KanfangshenqingEntity> {
	
	List<KanfangshenqingVO> selectListVO(@Param("ew") Wrapper<KanfangshenqingEntity> wrapper);
	
	KanfangshenqingVO selectVO(@Param("ew") Wrapper<KanfangshenqingEntity> wrapper);
	
	List<KanfangshenqingView> selectListView(@Param("ew") Wrapper<KanfangshenqingEntity> wrapper);

	List<KanfangshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<KanfangshenqingEntity> wrapper);
	
	KanfangshenqingView selectView(@Param("ew") Wrapper<KanfangshenqingEntity> wrapper);
	
}
