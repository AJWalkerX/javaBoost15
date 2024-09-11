****************
Java 15 Forum
****************
1- Register ol
2- Giriş yap

Databasename : Java15ForumDB
Tablo : User
1. entity package içinde User(id, ad, soyad, username(Unique), password) adında bir class açalım
2. register işlemi sırasında username'in daha önce alınıp alınmadığı kotrol edilmeli
3. Adınızı giriniz:
4. Soyadınızı giriniz:
5. Username giriniz:
6. Password giriniz:
7. UserRepository olmalı (CRUD) : Extra olarak
    - boolean existByUsername(String username)
    - Optinal<User> doLogin(String username, String password)    
8. Giriş yap:
    - username giriniz:
    - password giriniz:
    - eğer giriş başarılıysa başka bir ekrana geçiş yapsın

****************
Hoşgeldin, Ad Soyad
****************
1- Postları Görüntüle
2- Post paylaş
3- Kendi postlarını görüntüle
4- Kullanıcıları listele
5- Profil görüntüle
0-logout

Yapılacaklar:
Entity kısmında Post (id,userId,baslik,icerik,paylasimTarihi)
PostRepository(Crud İşlemleri-findAll,save)