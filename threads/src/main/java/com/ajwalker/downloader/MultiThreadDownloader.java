package com.ajwalker.downloader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadDownloader {
	public static void main(String[] args) {
		int threadSayisi = 5;
		ExecutorService executorService = Executors.newFixedThreadPool(threadSayisi);
		executorService.submit(()->{
			//dosya indir
			//dosya yaz
		});
	}
}