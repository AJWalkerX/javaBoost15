package com.ajwalker.lsp.lsp_aykiri;

public abstract class Logger {
	abstract void baglantiAc();
	abstract void baglantiKapat();
	abstract void logYaz();
}

class DatabaseLogger extends Logger {
	
	@Override
	void baglantiAc() {
	
	}
	
	@Override
	void baglantiKapat() {
	
	}
	
	@Override
	void logYaz() {
		baglantiAc();
		//log kayıtlarını db'ye yazacak kodlar...
		baglantiKapat();
	}
}

class FileLogger extends Logger {
	
	@Override
	void baglantiAc() {
	
	}
	
	@Override
	void baglantiKapat() {
	
	}
	
	@Override
	void logYaz() {
		//log kayıtlarını txt'ye yazacak kodlar...
	}
}