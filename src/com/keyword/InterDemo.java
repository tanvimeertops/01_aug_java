package com.keyword;
/*
 * class--->interface   implements
 * class--->class       extends
 * interface->interface extends
 */
interface Inter1{
	int i1=202;
	
}

public interface InterDemo extends Inter1 {

	int i_no=102;
	
	public void show();
	
}
