package com.aosuite.showcase.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.aosuite.showcase.dao.DemoDao;
import com.aosuite.showcase.mapper.PetBasicInfoMapper;
import com.aosuite.showcase.mapper.entity.PetBasicInfoEntity;
import com.aosuite.showcase.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private DemoDao demoDao;
	
	//Service也可以直接注入mapper组件，但是不建议这么干。
	//@Autowired
	//private PetBasicInfoMapper petBasicInfoMapper;
	
	//Service也可以直接注入SqlSession，直接调用具体的某个SQL语句，但也不建议这么干。
	//@Autowired
	//private SqlSession sqlSession;
	
	@Override
	public PetBasicInfoEntity getPetBasicInfoEntity(Integer id){
		PetBasicInfoEntity petBasicInfoEntity = demoDao.getPetBasicInfoEntity(id);
		logger.info("宠物实体对象：{}", JSON.toJSONString(petBasicInfoEntity));
		return petBasicInfoEntity;
	}
	
	@Override
	public Integer getAvgPetAge(){
		Integer avgAge = demoDao.getAvgPetAge();
		logger.info("宠物平均年龄：{}", avgAge);
		return avgAge;
	}
}
