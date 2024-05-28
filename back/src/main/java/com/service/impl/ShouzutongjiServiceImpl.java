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


import com.dao.ShouzutongjiDao;
import com.entity.ShouzutongjiEntity;
import com.service.ShouzutongjiService;
import com.entity.vo.ShouzutongjiVO;
import com.entity.view.ShouzutongjiView;

@Service("shouzutongjiService")
public class ShouzutongjiServiceImpl extends ServiceImpl<ShouzutongjiDao, ShouzutongjiEntity> implements ShouzutongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouzutongjiEntity> page = this.selectPage(
                new Query<ShouzutongjiEntity>(params).getPage(),
                new EntityWrapper<ShouzutongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouzutongjiEntity> wrapper) {
		  Page<ShouzutongjiView> page =new Query<ShouzutongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouzutongjiVO> selectListVO(Wrapper<ShouzutongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouzutongjiVO selectVO(Wrapper<ShouzutongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouzutongjiView> selectListView(Wrapper<ShouzutongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouzutongjiView selectView(Wrapper<ShouzutongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
