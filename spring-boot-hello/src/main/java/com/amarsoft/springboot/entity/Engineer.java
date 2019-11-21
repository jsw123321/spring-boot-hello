/** 
　 * Title: Engineer.java 
　 * Description: TODO(一句话描述这个方法的目的和作用)
　 * @author jiangshanwen 
　 * @date 2019年11月21日下午11:02:47 
　 * @version 1.0 
*/

package com.amarsoft.springboot.entity;

/** 
 * @Title: Engineer
 * @Description: Software developer（对类进行功能描述） 
 * @author jiangshanwen
 * @date: 2019年11月21日下午11:02:47 （日期） 
 * @version:v.1.0
 */
public class Engineer {
	  private int id;
      private String name;
      private int age;
      private String sex;
      private String rank;
	/** 
	　 * <p>Title: </p> 
	　 * <p>Description: </p> 
	　 * @param id
	　 * @param name
	　 * @param age
	　 * @param sex
	　 * @param rank 
	*/
	
	public Engineer(int id, String name, int age, String sex, String rank) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.rank = rank;
	}
	/** 
	　 * <p>Title: </p> 
	　 * <p>Description: </p>  
	*/
	
	public Engineer() {
		super();
	}
	/**
	* @return the id 
	*/
	
	public int getId() {
		return id;
	}
	/**
	* @param id the id to set 
	*/
	
	public void setId(int id) {
		this.id = id;
	}
	/**
	* @return the name 
	*/
	
	public String getName() {
		return name;
	}
	/**
	* @param name the name to set 
	*/
	
	public void setName(String name) {
		this.name = name;
	}
	/**
	* @return the age 
	*/
	
	public int getAge() {
		return age;
	}
	/**
	* @param age the age to set 
	*/
	
	public void setAge(int age) {
		this.age = age;
	}
	/**
	* @return the sex 
	*/
	
	public String getSex() {
		return sex;
	}
	/**
	* @param sex the sex to set 
	*/
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	* @return the rank 
	*/
	
	public String getRank() {
		return rank;
	}
	/**
	* @param rank the rank to set 
	*/
	
	public void setRank(String rank) {
		this.rank = rank;
	}
      
}
