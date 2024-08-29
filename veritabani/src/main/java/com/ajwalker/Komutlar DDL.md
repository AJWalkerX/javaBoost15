## CREATE DATABASE 
Bu komut ile database oluşturulur.

## CREATE TABLE
Bu komut ile tablo oluşturulur.

### id alanı:
* Otomatik artış sağlayan Serial veri türlerinden birini kullanmalıyız.
  * smallserial: 16bit
  * serial:      32bit
  * bigserial:   64bit
* PK olarak işaretlenmeli. PK olarak işaretlediğimiz alan benzersiz verilerden oluşmak zorundadır.
* PK olarak işaretlenen kolon otomatik olarak INDEX'lenir.
* Genellikle tablolarda id alanı bulunur ve PK olarak oluşturulur.

### tblmusteriler
CREATE TABLE tblmusteriler
(
id serial NOT NULL,
ad character varying(30) NOT NULL,
soyad character varying(20)  NOT NULL,
cinsiyet character varying(1) ,
dtarih date,
tel character varying(15) ,
email character varying(40) ,
sehir character varying(20)  DEFAULT 'İstanbul'::character varying,
state int DEFAULT 1, --0:Pasif, 1:Aktif
createAt bigint DEFAULT EXTRACT(epoch from Now()),
updateAt bigint DEFAULT EXTRACT(epoch from Now()),
CONSTRAINT "musterilerPK" PRIMARY KEY (id)
)

## ALTER TABLE
Tabloda Yapısal Değişiklik için kullanılır.
Örnek:
* ALTER TABLE tblmusteriler ADD COLUMN email  varchar(50)
* ALTER TABLE tblmusteriler ADD CONSTRAINT tblmusteriler_email_unique UNIQUE(email)
* ALTER TABLE tblmusteriler ALTER COLUMN cinsiyet TYPE int USING cinsiyet::integer
* ALTER TABLE tblmusteriler ADD CONSTRAINT tblmusteriler_tel_format CHECK (tel LIKE '0__________')

## REFERENCES ile FK Oluşturma
musteri_id int REFERENCES tblmusteriler(id) NOT NULL,

* FK ne işe yarar?
* Tablolar arasında ilişki kurmanızı sağlar.
* Veri tutarlılığını sağlar.
* tbladres tablosuna Ekleme yaparken tblmusteriler tablosunda olmayan bir id'nin eklenmesini engelledi.
* tblmusteriler tablosundan, adres tablosunda da kaydı olan musterinin silinmesini engelledi.

### tbladres
CREATE TABLE tbladres
(
id serial,
musteri_id int REFERENCES tblmusteriler(id) NOT NULL,
il varchar(30),
ilce varchar(30),
mahalle varchar(30),
adres text,
state int DEFAULT 1, --0:Pasif, 1:Aktif
createAt bigint Default EXTRACT(epoch from Now()),
updateAt bigint Default EXTRACT(epoch from Now()),
CONSTRAINT "adresPK" PRIMARY KEY (id)
)

## TRUNCATE TABLE
TRUNCATE TABLE tbladres

* Tablo içindeki verileri silmek için kullanılır.


## DROP TABLE/DATABASE
DROP TABLE tbladres
* Tabloyu tamamen silmek için kullanılır.

### tblBorc
CREATE TABLE tblBorc
(
	id serial NOT NULL,
	musteri_id int,
	borc bigint,
	status int DEFAULT 1,
	create_at bigint DEFAULT EXTRACT (epoch FROM Now()),
	update_at bigint DEFAULT EXTRACT (epoch FROM Now())
)

ALTER TABLE tblBorc ADD CONSTRAINT FK_tblBorc_musteri_id FOREIGN KEY (musteri_id) REFERENCES tblMusteriler(id);

ALTER TABLE tblBorc ADD CONSTRAINT "borcId" PRIMARY KEY (id)

## real / double precision
Ondalıklı sayı tutmak için kullanılabilecek veri türleridir.

ALTER TABLE tblBorc ALTER COLUMN borc TYPE real

### tblsatis
CREATE TABLE tblsatis
(
id serial NOT NULL,
musteri_id int REFERENCES tblmusteriler(id) NOT NULL,
tutar bigint,
satis_tarihi bigint Default EXTRACT(epoch from Now()),
state int DEFAULT 1, --0:Pasif, 1:Aktif
createAt bigint Default EXTRACT(epoch from Now()),
updateAt bigint Default EXTRACT(epoch from Now()),
CONSTRAINT "satisPK" PRIMARY KEY (id)
)
### tblodemeturu
CREATE TABLE tblodemeturu(
id serial NOT NULL,
tur varchar(15),
state smallint DEFAULT 1,
createAt bigint DEFAULT EXTRACT (epoch FROM Now()),
updateAt bigint DEFAULT EXTRACT (epoch FROM Now()),
CONSTRAINT "odemeturuPK" PRIMARY KEY (id)
)
### tblodeme
CREATE TABLE public.tblodeme
(
id serial PRIMARY KEY,
musteri_id int  NOT NULL,
satis_id int NOT NULL,
odemeturu_id int NOT NULL,
odeme_tutar bigint,
odeme_tarihi bigint NOT NULL DEFAULT EXTRACT(epoch from Now()),
state integer NOT NULL DEFAULT 1,
createAt bigint DEFAULT EXTRACT(epoch from Now()),
updateAt bigint DEFAULT EXTRACT(epoch from Now())
);

ALTER TABLE public.tblodeme
ADD CONSTRAINT musteri_FK FOREIGN KEY (musteri_id)
REFERENCES public.tblmusteriler (id);

ALTER TABLE public.tblodeme
ADD CONSTRAINT satis_FK FOREIGN KEY (satis_id)
REFERENCES public.tblsatis (id);

ALTER TABLE public.tblodeme
ADD CONSTRAINT odeme_turu_FK FOREIGN KEY (odemeturu_id)
REFERENCES public.tblodemeturu (id);

### tblurun

CREATE TABLE IF NOT EXISTS public.tblurun
(
id serial NOT NULL,
ad character varying(50) COLLATE pg_catalog."default",
marka character varying(50) COLLATE pg_catalog."default" NOT NULL,
birim_fiyat bigint,
stok_adet integer NOT NULL,
birim character varying(20) COLLATE pg_catalog."default" NOT NULL,
kdv integer NOT NULL,
state integer NOT NULL DEFAULT 1,
createat bigint NOT NULL DEFAULT EXTRACT(epoch FROM now()),
updateat bigint NOT NULL DEFAULT EXTRACT(epoch FROM now()),
CONSTRAINT tblurun_pkey PRIMARY KEY (id)
)

### tblsepet
CREATE TABLE tblsepet(
id serial NOT NULL,
urun_id int REFERENCES tblurun(id),
adet int,
birim_fiyat bigint,
toplam_fiyat bigint,
satis_id int REFERENCES tblsatis(id),
state smallint DEFAULT 1,
createAt bigint DEFAULT EXTRACT (epoch FROM Now()),
updateAt bigint DEFAULT EXTRACT (epoch FROM Now()),
CONSTRAINT "sepetPK" PRIMARY KEY (id)
)