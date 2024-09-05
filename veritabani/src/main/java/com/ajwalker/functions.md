----------------
-- FUNCTION - Javada geriye değer dönen metod gibidir.
-- Geriye değer dönebilir.
-- 1. Skaler Function: Bir değer alır ve geriye tek bir değer döner.
-- Bu değer herhangi bir tip olabilir.

CREATE OR REPLACE FUNCTION alanhesapla(yaricap INTEGER)
RETURNS DECIMAL
LANGUAGE plpgsql
AS
$$
BEGIN
RETURN 3*yaricap*yaricap;
END;
$$;
-- Oluşturulan Fonx SELECT ile çağrılır.
SELECT alanhesapla(5)

-- 2. Table Function: Bir veya birden fazla parametre alabilir. Geri dönüş olarak TABLE döner.

-- odemeturunu parametre olarak alıp, o türde yapılan ödemelerin toplamını geri dönen Function'ı yazınız.

CREATE OR REPLACE FUNCTION odemetoplam(odemeturu VARCHAR)
RETURNS TABLE(odemetur VARCHAR,odemetop MONEY)
LANGUAGE plpgsql
AS
$$
BEGIN
RETURN QUERY SELECT tur, SUM(odeme_tutar)
FROM vw_odemeturune_gore_odemelistesi
WHERE tur=odemeturu
GROUP BY tur;
END;
$$;

SELECT *
FROM odemetoplam('ÇEK')

SELECT *
FROM odemetoplam('KREDİ KARTI')


--  dogum tarihi bilgisinden yas bilgisini bulup dönen function'ı yazınız.
-- yashesapla(doğum tarihi alınacak)

CREATE FUNCTION dogumtarihihesapla(dogumtarihi DATE)
RETURNS INTEGER
LANGUAGE plpgsql
AS
$$
BEGIN
RETURN EXTRACT(YEAR from AGE(dogumtarihi));
END;
$$;

SELECT dogumtarihihesapla('2000-09-06')

--  tblmusteriler tablosundaki id,ad,soyad ve dtarihinden hesaplanmış yaş bilgisini içeren bir view hazırlayın.
CREATE VIEW vw_yaslariyla_musteriler
AS
SELECT id, ad, soyad, dogumtarihihesapla(dtarih)
FROM tblmusteriler;

SELECT * FROM vw_yaslariyla_musteriler;----------------
-- FUNCTION - Javada geriye değer dönen metod gibidir.
-- Geriye değer dönebilir.
-- 1. Skaler Function: Bir değer alır ve geriye tek bir değer döner.
-- Bu değer herhangi bir tip olabilir.

CREATE OR REPLACE FUNCTION alanhesapla(yaricap INTEGER)
RETURNS DECIMAL
LANGUAGE plpgsql
AS
$$
BEGIN
RETURN 3*yaricap*yaricap;
END;
$$;
-- Oluşturulan Fonx SELECT ile çağrılır.
SELECT alanhesapla(5)

-- 2. Table Function: Bir veya birden fazla parametre alabilir. Geri dönüş olarak TABLE döner.

-- odemeturunu parametre olarak alıp, o türde yapılan ödemelerin toplamını geri dönen Function'ı yazınız.

CREATE OR REPLACE FUNCTION odemetoplam(odemeturu VARCHAR)
RETURNS TABLE(odemetur VARCHAR,odemetop MONEY)
LANGUAGE plpgsql
AS
$$
BEGIN
RETURN QUERY SELECT tur, SUM(odeme_tutar)
FROM vw_odemeturune_gore_odemelistesi
WHERE tur=odemeturu
GROUP BY tur;
END;
$$;

SELECT *
FROM odemetoplam('ÇEK')

SELECT *
FROM odemetoplam('KREDİ KARTI')


--  dogum tarihi bilgisinden yas bilgisini bulup dönen function'ı yazınız.
-- yashesapla(doğum tarihi alınacak)

CREATE FUNCTION dogumtarihihesapla(dogumtarihi DATE)
RETURNS INTEGER
LANGUAGE plpgsql
AS
$$
BEGIN
RETURN EXTRACT(YEAR from AGE(dogumtarihi));
END;
$$;

SELECT dogumtarihihesapla('2000-09-06')

--  tblmusteriler tablosundaki id,ad,soyad ve dtarihinden hesaplanmış yaş bilgisini içeren bir view hazırlayın.
CREATE VIEW vw_yaslariyla_musteriler
AS
SELECT id, ad, soyad, dogumtarihihesapla(dtarih)
FROM tblmusteriler;

SELECT * FROM vw_yaslariyla_musteriler;