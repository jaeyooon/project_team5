package com.multi.frame;

import java.util.List;

public interface MyService <K, V> {
    void register(V v) throws Exception;
	
	void remove(K k) throws Exception;
	
	void modify(V v) throws Exception;
	
	V get(K k) throws Exception;
	
	List<V> selectall() throws Exception;
}
