package com.lzl.proxy.staticProxy;

public class Proxy implements PersonDao{

	private PersonImpl personImpl;
	private Transation transation;
	public Proxy(PersonImpl personImpl, Transation transation) {
		super();
		this.personImpl = personImpl;
		this.transation = transation;
	}
	@Override
	public void save() {
		this.transation.beginTransation();
		this.personImpl.save();
		this.transation.commit();
		
	}
	
	
}
