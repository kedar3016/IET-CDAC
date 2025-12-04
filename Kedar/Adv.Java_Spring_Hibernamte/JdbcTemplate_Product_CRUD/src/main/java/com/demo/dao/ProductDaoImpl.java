package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Override
	public boolean save(Product p) {
		
		int n = jdbctemplate.update("insert into products1 values(?,?,?,?,?,?)",
				new Object[] {p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getMfgDate(),p.getCid()});

		return n>0;
		
	}

	@Override
	public List<Product> showAll() {
		
		List<Product> plist = jdbctemplate.query("select * from products1",(rs,n) ->{
			Product p = new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			p.setMfgDate(rs.getDate(5).toLocalDate());
			p.setCid(rs.getInt(6));
			
			return p;
			
		});
		return plist;
	}

	@Override
	public List<Product> showByCid(int cid) {
		List<Product> plist = jdbctemplate.query("select * from products1 where cid=?",
				(rs,numofrows) ->{
			Product p = new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			p.setMfgDate(rs.getDate(5).toLocalDate());
			p.setCid(rs.getInt(6));
			
			return p;
			
		},cid);
		return plist;
	}

	@Override
	public boolean removeByPid(int pid) {
		int n = jdbctemplate.update("delete form table products1 where pid=?",new Object[] {pid});
		
		return n>0;
	}

	@Override
	public boolean modifiedByPid(int pid, int qty, double price) {
		int n = jdbctemplate.update("update products1 set qty = ?,price = ? where pid=?",new Object[] {qty,price,pid});
		
		return n>0;
	}

	@Override
	public List<Product> sortByPrice() {
		List<Product> plist = jdbctemplate.query("select * from products1 order by price",(rs,n) ->{
			Product p = new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			p.setMfgDate(rs.getDate(5).toLocalDate());
			p.setCid(rs.getInt(6));
			
			return p;
			
		});
		return plist;
	}

}
