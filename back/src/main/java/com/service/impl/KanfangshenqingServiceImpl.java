package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KanfangshenqingDao;
import com.entity.KanfangshenqingEntity;
import com.service.KanfangshenqingService;
import com.entity.vo.KanfangshenqingVO;
import com.entity.view.KanfangshenqingView;

@Service("kanfangshenqingService")
public class KanfangshenqingServiceImpl extends ServiceImpl<KanfangshenqingDao, KanfangshenqingEntity> implements KanfangshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KanfangshenqingEntity> page = this.selectPage(
                new Query<KanfangshenqingEntity>(params).getPage(),
                new EntityWrapper<KanfangshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KanfangshenqingEntity> wrapper) {
		  Page<KanfangshenqingView> page =new Query<KanfangshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KanfangshenqingVO> selectListVO(Wrapper<KanfangshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KanfangshenqingVO selectVO(Wrapper<KanfangshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KanfangshenqingView> selectListView(Wrapper<KanfangshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KanfangshenqingView selectView(Wrapper<KanfangshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
