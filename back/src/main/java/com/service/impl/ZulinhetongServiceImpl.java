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


import com.dao.ZulinhetongDao;
import com.entity.ZulinhetongEntity;
import com.service.ZulinhetongService;
import com.entity.vo.ZulinhetongVO;
import com.entity.view.ZulinhetongView;

@Service("zulinhetongService")
public class ZulinhetongServiceImpl extends ServiceImpl<ZulinhetongDao, ZulinhetongEntity> implements ZulinhetongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZulinhetongEntity> page = this.selectPage(
                new Query<ZulinhetongEntity>(params).getPage(),
                new EntityWrapper<ZulinhetongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZulinhetongEntity> wrapper) {
		  Page<ZulinhetongView> page =new Query<ZulinhetongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZulinhetongVO> selectListVO(Wrapper<ZulinhetongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZulinhetongVO selectVO(Wrapper<ZulinhetongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZulinhetongView> selectListView(Wrapper<ZulinhetongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZulinhetongView selectView(Wrapper<ZulinhetongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
