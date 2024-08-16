package com.ajwalker.optional;

import java.util.Optional;

/*
Optional; null olabilme ihtimali olan değerlerle çalışmayı güvenli hale getrimek için eklenmiştir.
NPE riskini azaltmak için tasarlanmıştır.
Bir metod optional değer döndüğü zaman "NULL değer dönebilirim" mesajını programcıya vermiş olur.
Bu sayede zorunlu olarak null kontrolü yaptırmış oluruz.
 */
public class OptionalUsage {
	public static void main(String[] args) {
		//Optional oluşturma:
		Optional<String> emptyOptional = Optional.empty();
		
		Optional<String> stringOptional = Optional.of("Merhaba");
		
		//eğer value null ise boş bir (empty) Optional döner.
		Optional<String> nullableOptional = Optional.ofNullable(null);
		
		nullableOptional.ifPresent(System.out::println); // varsa değeri yazdıracak.
		stringOptional.ifPresent(System.out::println);
		nullableOptional.ifPresentOrElse(System.out::println, () -> System.out.println("içerisi boş"));
		
//		System.out.println(nullableOptional.get()); // NoSuchElementException
		if (nullableOptional.isPresent()){
			System.out.println(nullableOptional.get());
		}
		nullableOptional.ifPresent(o -> System.out.println(nullableOptional.get()));
		
		Optional<Integer> optionalInteger = Optional.ofNullable(10);
		optionalInteger.ifPresent(System.out::println);
		optionalInteger.ifPresent(sayi -> System.out.println("2 Katı : "+ sayi*2));
		
		// optional ile sarmalanmış değer eğer 10'dan büyükse değeri yazdırsın, değilse değer 10dan büyük değil mesajı versin.
		Optional<Integer> optionalInteger1 = Optional.of(8);
		optionalInteger1.filter(sayi -> sayi > 10)
		                .ifPresentOrElse(
				                System.out::println, // eğer koşul sağlanırsa çalışacak
				                ()-> System.out.println("Değer 10'dan büyük değil.") // Eğer koşul sağlanmazsa çalışacak.
		                );
	}
}