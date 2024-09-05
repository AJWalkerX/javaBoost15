-------------------------
-- PROCEDURE : Javadaki void method gibidir. (Geri değer dönmez.)
-- INSERT, UPDATE, DELETE işlemler için PROCEDURE yazılabilir.

CREATE PROCEDURE EkranaYazdir()
LANGUAGE plpgsql
AS
$$
BEGIN
RAISE NOTICE 'Merhaba';
END;
$$;
-- Procedure yazınca çalışmaz. Ancak çağrılırsa çalışır.
-- Procedure çağırmak için CALL keywordu kullanılır:
CALL ekranayazdir()

--parametreli procedure:
CREATE PROCEDURE DonguEkranaYazdir(adet INTEGER)
LANGUAGE plpgsql
AS
$$
DECLARE
sayac INTEGER:=0;
BEGIN
WHILE sayac<adet LOOP
RAISE NOTICE 'Merhaba';
sayac:=sayac+1;
END LOOP;
END;
$$;
-- Önce CREATE PROCEDURE ile procedure oluşturulur ve sol tarafta o isim görülmelidir. Ondan sonra CALL ile çağrılarak kullanılabilir.
CALL DonguEkranaYazdir(5)


--PROCEDURE kullanarak UPDATE yapma:
CREATE PROCEDURE updateAdresIl(adresid INTEGER, yeniil VARCHAR)
LANGUAGE plpgsql
AS
$$
BEGIN
UPDATE tbladres SET il=yeniil WHERE id=adresid;
END;
$$;
SELECT * FROM tbladres ORDER BY id
CALL updateAdresIl(2,'Bolu')