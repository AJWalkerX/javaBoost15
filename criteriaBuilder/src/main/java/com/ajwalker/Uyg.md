Database: Java15HibernateOgrenci

Entity-> Ogrenci 
id (PK)
tckimlikno (unique)
ad (30)
soyad (30)
cinsiyet (enum)
dtarih (LocalDate)

Repository-> OgrenciRepository
save() ->persist()
List<Ogrenci> findAll() -> Criteria API

Ogrenci findByTcKimlikNo(String tcno) -> Criteria API
Ogrenci findById(Long id) -> Criteria API
List<Ogrenci> findByAdAndSoyad(String ad,String soyad) -> Criteria API

Runner
Repository'den save metodunu çağrı ve kaydet.
findAll çağırıp tüm öğrencileri listele.

Yapanlar
Alperen Bicav
Murat Saçak
Hüseyin Tartar

Mehmet Ertop (-)
Tolga Kömeç(-)
Selin Sancak(-)
Özkan Sargin(-)