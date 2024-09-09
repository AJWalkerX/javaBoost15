package com.ajwalker.jdbc_Eticaret;

import com.ajwalker.jdbc_Eticaret.entity.Adres;
import com.ajwalker.jdbc_Eticaret.entity.Musteri;
import com.ajwalker.jdbc_Eticaret.repository.AdresRepository;
import com.ajwalker.jdbc_Eticaret.repository.MusteriReposiyory;

import java.time.LocalDate;
import java.util.Optional;

public class Runner {
    public static void main(String[] args) {
        MusteriReposiyory musteriRepository = new MusteriReposiyory();
//        Musteri m1 = new Musteri("Selim", "Sarı", "E", LocalDate.of(2000,5,15),"555555", "selim@gmail.com","İzmir");
//        musteriRepository.save(m1);
//        musteriRepository.delete(1001);
//        musteriRepository.findAll().forEach(System.out::println);
//        Optional<Musteri> byId = musteriRepository.findById(1);
//        byId.ifPresent(System.out::println);
        Optional<Musteri> guncellenecekMusteri = musteriRepository.findById(1002);
		if(guncellenecekMusteri.isPresent()){
			guncellenecekMusteri.get().setSoyad("YeniSarı");
			guncellenecekMusteri.get().setEmail("selimyenisari@gmail.com");
			musteriRepository.update(guncellenecekMusteri.get());
		}else {
			System.out.println("Güncellenecek müşteri bulunamadı.");
		}


//        AdresRepository adresRepository = new AdresRepository();
////        Adres adres = new Adres(1002, "İzmir", "Bostanlı", "Bostan","112 sk");
////        adresRepository.save(adres);
//
//        Optional<Adres> byId = adresRepository.findById(1012);
//        byId.ifPresent(System.out::println);

//        adresRepository.findAll().forEach(System.out::println);

//        adresRepository.delete(1012);
    }
}
