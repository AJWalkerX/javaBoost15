# Design Patterns
* Tasarım Kalıpları, Tasarım Örüntüleri, Tasarım Desenleri
* Gang Of Four(Dörtlü çete) , GOF Design Pattern : Kitabın 4 yazarı.
* 23 tane sorun için önerilen tasarım kalıpları, 1994

# Design Patterns ne değildir?
* Bir algoritma değil.
* Bir kod değil.
* Bir dile bağımlılığı yok.

# Singleton
* Bir sınıfın sadece bir tane instance'ı olması istenirse kullanılır.
* Bu sayede bellek problemleri ve performans problemleri önlenebilir.
* Singleton olan sınıfa ait instance'a ulaşmak için global erişim kapatılmalıdır.
* Constructor private olmalıdır. Böylece dışarıdan new keywordü ile nesne üretimi sonlandırılır.
* Singleton sınıf instance'i sınıf içinde private static olarak tutulmalıdır.
* Bu static instance'ı geri dönecek bir public static metod olmalıdır.


# Factory Pattern Kullanmak için;
* Enum yaz.
* abstract class veya interface'inizi yazın.
* abstract class'tan extend edilecek alt sınıfları yazın.
* Factory-class yazın. İçinde switch case yapısını kurgulayın.
* Runnerdan factory sınıfın builder metodu ile nesne üretin.