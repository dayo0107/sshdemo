package com.how2java.dao;

import java.util.List;
import com.how2java.pojo.Product;
public interface ProductDAO {
	
	public List list();
	public void add(Product p);
}
