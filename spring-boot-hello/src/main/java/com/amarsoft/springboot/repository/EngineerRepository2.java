/** 
　 * Title: EngineerRepository2.java 
　 * Description: TODO(一句话描述这个方法的目的和作用)
　 * @author jiangshanwen 
　 * @date 2019年11月23日下午10:23:36 
　 * @version 1.0 
*/

package com.amarsoft.springboot.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.amarsoft.springboot.bean.Engineer;

/** 
 * @Title: 
 * @Description: （对类进行功能描述） 
 * @author jiangshanwen
 * @date: 2019年11月23日下午10:23:36 （日期） 
 * @version:v.1.0
 */
@Repository
public interface EngineerRepository2 extends PagingAndSortingRepository<Engineer, Integer> {

}
