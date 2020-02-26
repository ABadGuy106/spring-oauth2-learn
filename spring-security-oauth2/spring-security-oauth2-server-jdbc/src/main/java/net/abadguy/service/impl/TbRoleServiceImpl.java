package net.abadguy.service.impl;

import net.abadguy.mapper.TbRoleMapper;
import net.abadguy.service.TbRoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class TbRoleServiceImpl implements TbRoleService {

    @Resource
    private TbRoleMapper tbRoleMapper;

}
