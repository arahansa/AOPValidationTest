package com.example.annointerface;

public enum Auth {
	ADMIN(1), OWNER(2), USER(3), VISITER(4);
	
	int auth;

	private Auth(int auth) {
		this.auth = auth;
	}
	
}
