/** 
　 * Title: EngineerService.java 
　 * Description: TODO(一句话描述这个方法的目的和作用)
　 * @author jiangshanwen 
　 * @date 2019年11月23日下午3:30:42 
　 * @version 1.0 
*/

package com.amarsoft.springboot.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.amarsoft.springboot.bean.Engineer;
import com.amarsoft.springboot.repository.EngineerRepository;

/**
 * @Title:
 * @Description: （对类进行功能描述）
 * @author jiangshanwen
 * @date: 2019年11月23日下午3:30:42 （日期）
 * @version:v.1.0
 */
@Service
public class EngineerService implements EngineerRepository {
	@Resource
	private EngineerRepository engineerRepository;

	/**
	 * 
	 * @Title: save
	 * @Description:保存一个工程师实体
	 * @date :2019年11月23日下午3:35:05 @param engineer
	 * @return Engineer
	 */
	@Transactional
	public Engineer save(Engineer engineer) {
		engineerRepository.save(engineer);
		return engineer;
	}
    /**
      * 
      * @Title: findById 
      * @Description:根据对象id来查询工程师
      * @date :2019年11月23日下午10:33:02
    　     * @param id
    　     * @return Engineer
     */
	public Engineer findById(int id) {
		return engineerRepository.findOne(id);
	}
	
	@Override
	public List<Engineer> findByName(String name) {
		List<Engineer> engineerList = engineerRepository.findByName(name);
		return engineerList;
	}
	/**
	 * 模糊查询相关
	 */
	@Override
	public List<Engineer> findByLikeName(String name) {
		List<Engineer> engineerList = engineerRepository.findByLikeName(name);
		return engineerList;
	}
	@Override
	public <S extends Engineer> Iterable<S> save(Iterable<S> entities) {
		return null;
	}

	@Override
	public Engineer findOne(Integer id) {
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		return false;
	}

	@Override
	public Iterable<Engineer> findAll() {
		return null;
	}

	@Override
	public Iterable<Engineer> findAll(Iterable<Integer> ids) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void delete(Integer id) {
	}

	@Override
	public void delete(Engineer entity) {
	}

	@Override
	public void delete(Iterable<? extends Engineer> entities) {

	}

	@Override
	public void deleteAll() {

	}
	/* (non-Javadoc) 
	* <p>Title: findByLikeName</p> 
	* <p>Description: </p> 
	* @param name
	* @return 
	* @see com.amarsoft.springboot.repository.EngineerRepository#findByLikeName(java.lang.String) 
	*/


}
