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


import com.dao.HuzhuDao;
import com.entity.HuzhuEntity;
import com.service.HuzhuService;
import com.entity.vo.HuzhuVO;
import com.entity.view.HuzhuView;

@Service("huzhuService")
public class HuzhuServiceImpl extends ServiceImpl<HuzhuDao, HuzhuEntity> implements HuzhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuzhuEntity> page = this.selectPage(
                new Query<HuzhuEntity>(params).getPage(),
                new EntityWrapper<HuzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuzhuEntity> wrapper) {
		  Page<HuzhuView> page =new Query<HuzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuzhuVO> selectListVO(Wrapper<HuzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuzhuVO selectVO(Wrapper<HuzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuzhuView> selectListView(Wrapper<HuzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuzhuView selectView(Wrapper<HuzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
