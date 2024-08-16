package com.ajwalker.stream_usage;

import java.util.List;
import java.util.stream.Stream;

public class StreamUsage {
	public static void main(String[] args) {
		//Stream oluşturma:
		Stream<String> tekKayitliStream = Stream.of("Pazartesi");
		Stream<Double> cokKayitliStream = Stream.of(1.1,23.32,5.43,6.54,1.123,46.3);
		Stream<String> bosStream = Stream.empty();
		
		//List'den stream oluşturma:
		List<String> gunler =List.of("Pazartesi","Salı", "Çarşamba","Perşembe","Cuma","Cumartesi","Pazar");
		Stream<String> gunlerStream =gunler.stream();
		
	}
}