/** 
　 * Title: EngineerRepository.java 
　 * Description: TODO(一句话描述这个方法的目的和作用)
　 * @author jiangshanwen 
　 * @date 2019年11月23日下午3:28:57 
　 * @version 1.0 
*/

package com.amarsoft.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amarsoft.springboot.bean.Engineer;

/** 
 * @Title: 
 * @Description: （对类进行功能描述） 
 * @author jiangshanwen
 * @date: 2019年11月23日下午3:28:57 （日期） 
 * @version:v.1.0
 */
@Repository
public interface EngineerRepository extends CrudRepository<Engineer, Integer> {
         
	
	public List<Engineer> findByName(String name);
}
