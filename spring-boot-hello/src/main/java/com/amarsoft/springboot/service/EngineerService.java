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
public class EngineerService implements EngineerRepository{
	 @Resource
	 private EngineerRepository  engineerRepository;
	 
	  /**
	   * 
	    * @return 
	 * @Title: save 
	    * @Description:保存一个工程师实体 
	    * @date :2019年11月23日下午3:35:05
	  　       @param engineer
	   */
	  @Transactional
      public Engineer save(Engineer engineer){
		 engineerRepository.save(engineer);
		 return engineer;
      }
	  
	  public Engineer findById(int id){
		  return engineerRepository.findOne(id);
	  }
	  
	  @Override
	  public List<Engineer> findByName(String name) {
		  List<Engineer> engineerList = engineerRepository.findByName(name);
			return engineerList;
		}

	/* (non-Javadoc) 
	* <p>Title: save</p> 
	* <p>Description: </p> 
	* @param entities
	* @return 
	* @see org.springframework.data.repository.CrudRepository#save(java.lang.Iterable) 
	*/
	
	@Override
	public <S extends Engineer> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc) 
	* <p>Title: findOne</p> 
	* <p>Description: </p> 
	* @param id
	* @return 
	* @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable) 
	*/
	
	@Override
	public Engineer findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc) 
	* <p>Title: exists</p> 
	* <p>Description: </p> 
	* @param id
	* @return 
	* @see org.springframework.data.repository.CrudRepository#exists(java.io.Serializable) 
	*/
	
	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc) 
	* <p>Title: findAll</p> 
	* <p>Description: </p> 
	* @return 
	* @see org.springframework.data.repository.CrudRepository#findAll() 
	*/
	
	@Override
	public Iterable<Engineer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc) 
	* <p>Title: findAll</p> 
	* <p>Description: </p> 
	* @param ids
	* @return 
	* @see org.springframework.data.repository.CrudRepository#findAll(java.lang.Iterable) 
	*/
	
	@Override
	public Iterable<Engineer> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc) 
	* <p>Title: count</p> 
	* <p>Description: </p> 
	* @return 
	* @see org.springframework.data.repository.CrudRepository#count() 
	*/
	
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc) 
	* <p>Title: delete</p> 
	* <p>Description: </p> 
	* @param id 
	* @see org.springframework.data.repository.CrudRepository#delete(java.io.Serializable) 
	*/
	
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc) 
	* <p>Title: delete</p> 
	* <p>Description: </p> 
	* @param entity 
	* @see org.springframework.data.repository.CrudRepository#delete(java.lang.Object) 
	*/
	
	@Override
	public void delete(Engineer entity) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc) 
	* <p>Title: delete</p> 
	* <p>Description: </p> 
	* @param entities 
	* @see org.springframework.data.repository.CrudRepository#delete(java.lang.Iterable) 
	*/
	
	@Override
	public void delete(Iterable<? extends Engineer> entities) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc) 
	* <p>Title: deleteAll</p> 
	* <p>Description: </p>  
	* @see org.springframework.data.repository.CrudRepository#deleteAll() 
	*/
	
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
