package com.ajwalker.lsp.lsp_uygun;
public abstract class Logger {
	abstract void logYaz();
}
abstract class DbLogger extends Logger{
	abstract void baglantiAc();
	abstract void baglantiKapat();
}

class DatabaseLogger extends DbLogger {
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
	void logYaz() {
		//log kayıtlarını txt'ye yazacak kodlar...
	}
}