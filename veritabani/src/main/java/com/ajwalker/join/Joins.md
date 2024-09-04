-- Tabloları oluşturma:
CREATE TABLE tblbolum(
	bolum_id SERIAL PRIMARY KEY,
	ad varchar(50)
)

CREATE TABLE tblogrenci(
	ogr_no SERIAL PRIMARY KEY,
	ad varchar(30),
	soyad varchar(30),
	bolum_id int REFERENCES tblbolum(bolum_id)
)
--Tablolara veri ekleme:
INSERT INTO tblbolum(ad) VALUES ('Grafik'),('Elektronik'),('Bilgisayar')
SELECT * FROM tblbolum

INSERT INTO tblogrenci(ad,soyad,bolum_id)
VALUES ('Anıl','Özoğluöz',3), ('Mehmet','Tufan',1), ('Ahmet','Eriş',1)
SELECT * FROM tblogrenci
-- Kartezyen Çarpım:
SELECT *
FROM tblbolum,tblogrenci

-- Eşitliğe göre veri getirme:
SELECT *
FROM tblbolum,tblogrenci
WHERE tblbolum.bolum_id=tblogrenci.bolum_id
--- JOIN
-- Join: Birleştirmek

-- 1. INNER JOIN: İki tablo arasındaki ortak kayıtları gösterir.
SELECT *
FROM tblbolum AS b
INNER JOIN tblogrenci AS o
ON b.bolum_id=o.bolum_id
-- INNER JOIN yerine sadece JOIN de yazılabilir:
SELECT *
FROM tblbolum AS b JOIN tblogrenci AS o
ON b.bolum_id=o.bolum_id
-- INNER JOIN'de tabloların solda veya sağda olması birşeyi değiştirmez:
SELECT *
FROM tblogrenci AS o JOIN tblbolum AS b
ON b.bolum_id=o.bolum_id

-- 2. LEFT JOIN: (LEFT OUTER JOIN) Soldaki tablonun tüm satırlarını ve sağ tablo ile eşleşen satırları döner.
-- Eğer sağdaki tabloda soldaki ile eşleşmeyen kayıt varsa NULL döner.
SELECT *
FROM tblbolum AS b LEFT JOIN tblogrenci AS o
ON b.bolum_id=o.bolum_id
-- LEFT JOINDE tabloların solda veya sağda olması önemlidir:
SELECT *
FROM tblogrenci AS o LEFT JOIN tblbolum AS b
ON b.bolum_id=o.bolum_id

-- 3. RIGHT JOIN: (RIGHT OUTER JOIN) Sağdaki tablodaki tüm satırları ve soldaki tablo ile eşleşen kayıtları getirir. Eğer solda eşleşmeyen kayıt varsa NULL getirir.

SELECT *
FROM tblbolum AS b RIGHT JOIN tblogrenci AS o
ON b.bolum_id=o.bolum_id
-- YUKARIDAKİ sorgunun eşleneği LEFT JOINle de yapılabilir:
SELECT *
FROM tblogrenci AS o LEFT JOIN tblbolum AS b
ON b.bolum_id=o.bolum_id

-- Bölümsüz öğrenci ekleme:
INSERT INTO tblogrenci(ad,soyad)
VALUES ('Berkay','Başol')

INSERT INTO tblogrenci(ad,soyad)
VALUES ('Emine','Karabolat')

SELECT * FROM tblogrenci

--4. FULL JOIN: (FULL OUTER JOIN)
SELECT *
FROM tblbolum AS b
FULL JOIN tblogrenci AS o
ON b.bolum_id=o.bolum_id

--5. LEFT OUTER JOIN:
SELECT *
FROM tblbolum AS b LEFT OUTER JOIN tblogrenci AS o
ON b.bolum_id=o.bolum_id

SELECT *
FROM tblbolum AS b LEFT JOIN tblogrenci AS o
ON b.bolum_id=o.bolum_id

-- Öğrencisi olmayan bölümleri listeleyin:
SELECT *
FROM tblbolum b
LEFT JOIN tblogrenci o
ON b.bolum_id=o.bolum_id
WHERE o.bolum_id IS NULL

-- Bölümü olmayan öğrencileri listeleyin:
SELECT *
FROM tblbolum b
RIGHT JOIN tblogrenci o
ON b.bolum_id=o.bolum_id
WHERE o.bolum_id IS NULL

--SQL KOMUTLARI ÇALIŞMA SIRASI:
-- 1. FROM, JOIN
-- 2. ON
-- 3. WHERE
-- 4. GROUP BY
-- 5. HAVING
-- 6. SELECT
-- 7. ORDER BY
-- 8. LIMIT

-- Öğrecisi olmayan bölüm ve bölümü olmayan öğrencileri listele:

SELECT *
FROM tblbolum b
FULL JOIN tblogrenci o
ON b.bolum_id=o.bolum_id
WHERE o.bolum_id IS NULL OR b.bolum_id IS NULL