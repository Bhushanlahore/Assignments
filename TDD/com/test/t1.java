package com.test;

import javax.sql.rowset.JoinRowSet;

public class t1 {

	public static int str(String msg) {
		
		try {
			return (msg.length()>10?5:msg.length());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return (msg.length()>10?5:msg.length());
	}
	

}
