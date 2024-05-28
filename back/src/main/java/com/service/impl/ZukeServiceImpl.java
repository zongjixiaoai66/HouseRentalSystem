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


import com.dao.ZukeDao;
import com.entity.ZukeEntity;
import com.service.ZukeService;
import com.entity.vo.ZukeVO;
import com.entity.view.ZukeView;

@Service("zukeService")
public class ZukeServiceImpl extends ServiceImpl<ZukeDao, ZukeEntity> implements ZukeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZukeEntity> page = this.selectPage(
                new Query<ZukeEntity>(params).getPage(),
                new EntityWrapper<ZukeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZukeEntity> wrapper) {
		  Page<ZukeView> page =new Query<ZukeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZukeVO> selectListVO(Wrapper<ZukeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZukeVO selectVO(Wrapper<ZukeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZukeView> selectListView(Wrapper<ZukeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZukeView selectView(Wrapper<ZukeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
