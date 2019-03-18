package com.wx.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.wx.utils.jdbcUtils;

public class BaseDao<T> {
	
	QueryRunner queryRunner=new QueryRunner();
	private Class<T> clazz;
	@SuppressWarnings("unchecked")
	public BaseDao(){
		 Type superType = this.getClass().getGenericSuperclass();
	     if(superType instanceof ParameterizedType) {
	    	 ParameterizedType pt=(ParameterizedType) superType;
	    	 Type[] types = pt.getActualTypeArguments();
	         if(types[0] instanceof Class) {
	    	 clazz=(Class<T>) types[0];
	         }
	     }
	}
    public T get(String sql,Object...args) {
    	Connection conn=null;
    	T entity=null;
    	try {
			conn=jdbcUtils.getConn();
			entity= queryRunner.query(conn, sql,new BeanHandler<T>(clazz), args);
		} catch (Exception e) {
		   e.printStackTrace();
		}finally{
			jdbcUtils.closeConn(conn);
		}
    	return entity;
    }
    public T get(Connection conn,String sql,Object...args) {
    	T entity=null;
    	try {
			entity= queryRunner.query(conn, sql,new BeanHandler<T>(clazz), args);

		} catch (Exception e) {
		   e.printStackTrace();
		}
    	return entity;
    }
    public List<T> getList(String sql,Object...args){
    	Connection conn=null;
    	ArrayList<T> list = null;
    	try {
    		conn=jdbcUtils.getConn();
			list=(ArrayList<T>) queryRunner.query(conn, sql,new BeanListHandler<T>(clazz), args);

		} catch (Exception e) {
		   e.printStackTrace();
		}finally {
			jdbcUtils.closeConn(conn);
		}
    	return list;
    }
    public int update(String sql,Object...args){
    	Connection conn=null;
    	int rows=0;
    	try {
    		conn=jdbcUtils.getConn();
			rows=queryRunner.update(conn,sql,args);

		} catch (Exception e) {
		   e.printStackTrace();
		}finally {
			jdbcUtils.closeConn(conn);
		}
    	return rows;
    }
    @SuppressWarnings("unchecked")
	public Object getValue(String sql,Object...args){
    	Connection conn=null;
    	Object obj=null;
    	try {
    		conn=jdbcUtils.getConn();
            obj=queryRunner.query(conn, sql, new ScalarHandler(), args);
		} catch (Exception e) {
		   e.printStackTrace();
		}finally {
			jdbcUtils.closeConn(conn);
		}
    	return obj;
    }
}
