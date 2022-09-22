package com.multi.frame;

import java.util.List;

public interface MyMapper<K, V> {
	void insert(V v) throws Exception;
	
	void delete(K k) throws Exception;
	
	void update(V v) throws Exception;
	
	V select(K k) throws Exception;
	
	List<V> selectall() throws Exception;
}
