# CRUD İŞLEMLERİ
## CREATE (INSERT)
## READ (SELECT)
## UPDATE
## DELETE

## CREATE (INSERT) KOMUTU
* INSERT INTO tabload(kolon1,kolon2) VALUES('deger1',deger2)
* Dikkat Edilecekler!
* Tablo adını ve kolon adlarını doğru yazmalısınız.
* Kolon sırasına göre valuelar eklenmeli.
* Not Null bir alan varsa mutlaka değer girilmeli.
* Constraintlere dikkat etmek gerekli.
* Valuesta eğer girilecek değer String ise tek tırnak içine yazılmalı.
* Valueste eğer girilecek değer Numeric ise tırnaksız yazılmalı.
  

* INSERT INTO tblmusteriler(ad,soyad,tel,cinsiyet)
  VALUES ('Alex','Walker','05552221122',1)

## UPDATE KOMUTU
* UPDATE tabload SET kolon=yenideger WHERE koşul

* Tablo içindeki veriyi güncellemek için kullanılır.
* DİKKAT! Update komutu çok tehlikelidir. 
* EĞER KOŞUL YAZMAZSANIZ tablodaki tüm kayıtları günceller.

* UPDATE tblmusteriler SET tel='05552221155' WHERE id=4

## DELETE KOMUTU
* DELETE FROM tabloadi WHERE koşul

* Tablo içindeki veriyi silmek için kullanılır.
* DİKKAT! Delete komutu çok tehlikelidir.
* EĞER KOŞUL YAZMAZSANIZ tablodaki tüm kayıtları siler.

## SELECT KOMUTU
* SELECT kolonadlari FROM tabloadı 

* Tablodan veri getirmek için kullanılır.
* SELECT id,ad,tel FROM tblmusteriler
* '*' ile tüm kolonlar seçilebilir:   SELECT * FROM tblmusteriler


INSERT INTO public.tblodemeturu(tur) VALUES ('ÇEK');
INSERT INTO public.tblodemeturu(tur) VALUES ('NAKİT');
INSERT INTO public.tblodemeturu(tur) VALUES ('KREDİ KARTI');
INSERT INTO public.tblodemeturu(tur) VALUES ('YEMEK KARTI');


tblodemeturu id 1-4
tblmusteriler id 1-1000

6 tablo:
Oda1: tbladres (1000 tane)
Oda2: tblborc (1000 tane)
Oda3: tblodeme (1000 tane)
Oda4: tblsatis (1000 tane)
Oda5: tblsepet (3000 tane)
Oda6: tblurun (1000 tane)