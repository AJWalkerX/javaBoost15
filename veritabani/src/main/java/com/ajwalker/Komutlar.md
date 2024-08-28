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

CREATE TABLE tblmusteriler
(
id serial NOT NULL,
ad character varying(30) NOT NULL,
soyad character varying(20)  NOT NULL,
cinsiyet character varying(1) ,
dtarih date,
tel character varying(15) ,
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