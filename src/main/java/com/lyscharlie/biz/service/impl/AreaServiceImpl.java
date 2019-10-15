package com.lyscharlie.biz.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyscharlie.biz.entity.Area;
import com.lyscharlie.biz.mapper.AreaMapper;
import com.lyscharlie.biz.service.AreaService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AreaServiceImpl extends ServiceImpl<AreaMapper, Area> implements AreaService {
}
