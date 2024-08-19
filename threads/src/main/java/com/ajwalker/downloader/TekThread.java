package com.ajwalker.downloader;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TekThread {
	public static void main(String[] args) {
		String indirilecekDosyaAdresi="https://www.cs.cmu.edu/afs/cs.cmu.edu/user/gchen/www/download/java/LearnJava.pdf";
		String kaydedilecekDosyaAdi="LearnJava.pdf";
		FileDownloaderThread downloaderThread=new FileDownloaderThread(indirilecekDosyaAdresi,kaydedilecekDosyaAdi);
		downloaderThread.start();
		System.out.println(dosyaBoyutuBul(indirilecekDosyaAdresi));
		
	}

	public static Long dosyaBoyutuBul(String dosyaAdresi){
		try {
			URL url = new URL(dosyaAdresi);
			HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
			httpURLConnection.setRequestMethod("HEAD");
			String contentType = httpURLConnection.getContentType();
			long contentLengthLong = httpURLConnection.getContentLengthLong();
			return contentLengthLong/1024;
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return 0L;
	}
}

class FileDownloaderThread extends Thread {
	int inenDosyaBoyutu=0;
	String filename;
	String url;
	
	public FileDownloaderThread(String url, String filename) {
		this.url = url;
		this.filename = filename;
	}
	
	@Override
	public void run() {
		super.run();
		
		try(BufferedInputStream inputStream=new BufferedInputStream(new URL(url).openStream())){
			FileOutputStream fileOutputStream=new FileOutputStream(filename);
			byte[] buffer=new byte[1024];
			int readedByte;
			while( (readedByte = inputStream.read(buffer, 0, 1024)) !=-1){
				fileOutputStream.write(buffer,0,readedByte);
				inenDosyaBoyutu+=readedByte;
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}