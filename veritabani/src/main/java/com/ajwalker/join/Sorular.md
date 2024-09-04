-- SORULAR
--1. Tüm bölümleri ve o bölüme kayıtlı öğrencilerin adlarını listeleyin. Bir bölüme ait öğrenci yoksa, öğrenci adı yerine 'Öğrenci Yok' yazılmalıdır.
--
SELECT b.ad,COALESCE(o.ad,'ÖĞRENCİ YOK') "Öğrenci Ad"
FROM tblbolum b
LEFT JOIN tblogrenci o
ON o.bolum_id=b.bolum_id

--2.Bilgisayar bölümünde okuyan öğrencilerin ad ve soyadlarını listeleyin.
SELECT o.ad,o.soyad
FROM tblbolum b
JOIN tblogrenci o
ON o.bolum_id=b.bolum_id
WHERE b.ad='Bilgisayar'

--3.Her bölüm için toplam öğrenci sayısını listeleyin.
SELECT b.ad,COUNT(o.bolum_id) AS ogrenci_sayisi
FROM tblbolum AS b
LEFT JOIN tblogrenci AS o
ON b.bolum_id=o.bolum_id
GROUP BY b.ad

--4.Sadece öğrencisi olan bölümleri listeleyin.
SELECT DISTINCT (b.ad)
FROM tblbolum b
JOIN tblogrenci o
ON b.bolum_id = o.bolum_id

SELECT DISTINCT (b.ad)
FROM tblbolum b
LEFT JOIN tblogrenci o
ON b.bolum_id = o.bolum_id
WHERE o.bolum_id IS NOT NULL

SELECT DISTINCT (b.ad) ,COUNT(o.ogr_no)
FROM tblbolum b
LEFT JOIN tblogrenci o
ON b.bolum_id = o.bolum_id
GROUP BY b.ad
HAVING COUNT(o.ogr_no)!=0 -- <> , !=

--5.Öğrencisi olmayan bölümlerin adlarını listeleyin.

SELECT DISTINCT (b.ad)
FROM tblbolum b
LEFT JOIN tblogrenci o
ON b.bolum_id = o.bolum_id
WHERE o.bolum_id IS NULL

--6.Bilgisayar bölümü dışındaki bölümlerde okuyan öğrencilerin adlarını listeleyin.

--7.Her bölümdeki en son kayıt olan öğrencinin adını listeleyin

--8.Her bir öğrenci için öğrencinin adı, soyadı ve bölüm adını içeren bir liste oluşturun.

--9.tblogrenci tablosunda kayıtlı olup, tblbolum tablosunda karşılığı olmayan öğrenci var mı? Varsa, bu öğrencilerin ad ve soyadlarını listeleyin.