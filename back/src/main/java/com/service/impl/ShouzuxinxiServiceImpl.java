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


import com.dao.ShouzuxinxiDao;
import com.entity.ShouzuxinxiEntity;
import com.service.ShouzuxinxiService;
import com.entity.vo.ShouzuxinxiVO;
import com.entity.view.ShouzuxinxiView;

@Service("shouzuxinxiService")
public class ShouzuxinxiServiceImpl extends ServiceImpl<ShouzuxinxiDao, ShouzuxinxiEntity> implements ShouzuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouzuxinxiEntity> page = this.selectPage(
                new Query<ShouzuxinxiEntity>(params).getPage(),
                new EntityWrapper<ShouzuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouzuxinxiEntity> wrapper) {
		  Page<ShouzuxinxiView> page =new Query<ShouzuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouzuxinxiVO> selectListVO(Wrapper<ShouzuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouzuxinxiVO selectVO(Wrapper<ShouzuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouzuxinxiView> selectListView(Wrapper<ShouzuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouzuxinxiView selectView(Wrapper<ShouzuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
