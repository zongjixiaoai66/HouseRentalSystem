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


import com.dao.WeixiushujuDao;
import com.entity.WeixiushujuEntity;
import com.service.WeixiushujuService;
import com.entity.vo.WeixiushujuVO;
import com.entity.view.WeixiushujuView;

@Service("weixiushujuService")
public class WeixiushujuServiceImpl extends ServiceImpl<WeixiushujuDao, WeixiushujuEntity> implements WeixiushujuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiushujuEntity> page = this.selectPage(
                new Query<WeixiushujuEntity>(params).getPage(),
                new EntityWrapper<WeixiushujuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiushujuEntity> wrapper) {
		  Page<WeixiushujuView> page =new Query<WeixiushujuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiushujuVO> selectListVO(Wrapper<WeixiushujuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiushujuVO selectVO(Wrapper<WeixiushujuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiushujuView> selectListView(Wrapper<WeixiushujuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiushujuView selectView(Wrapper<WeixiushujuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
