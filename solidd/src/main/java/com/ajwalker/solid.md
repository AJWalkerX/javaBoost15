# SOLID
## UNCLE BOB: Robert Martin
https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/

### Kötü tasarım:
* Katılık: Sistemde değişiklik yapmakta zorlanıyorsanız bunun sebebi yazılım tasarımımızın katı olmasıdır.
* Kırınganlık: Sistemde meydana gelen bir hatayı ortadan kaldırırken başka bir yerden hatalar ortaya çıkmasıdır.
* Taşınmazlık: Bir yapıyı tekraren başka yerlerde kullanmakta zorlanıyorsanız, tasarım hatalıdır.

### SOLID Nedir?
* Kötü tasarımdan kaçınmak için öne sürülen yöntemlerdir.
* HEDEF: Tasarımın eksik anlaşılır ve yönetilebilir olmasını sağlamaktadır.

* S - The Single Responsibility Principle   (SRP)
* O - The Open-Closed Principle             (OCP)
* L - The Liskov Substitution Principle     (LSP)
* I - The Interface Segregation Principle   (ISP)
* D - The Dependency Inversion Principle    (DIP)

# S - The Single Responsibility Principle   (SRP)
* Tek sorumluluk ilkesi. Oluşturduğumuz yapılar (metod-sınıf-interface-enum) tek bir görevi yerine getirmeli.
* Belli bir işi yapmalı
* Bu tür yapılarda bir değişime gitmek için yalnızca bir sebep olmalı.
* İsviçre çakısını sevmiyoruz!
* Giant Hulk gibi sınıflar istemiyoruz!

# O - The Open-Closed Principle (OCP)
* Projeye ait tüm yapıalrın gelişime açık, değişime kapalı olmasıdır.
* Yazılan kodların kendisinde değişiklik yapmadan, yeni eklemeler yapılabilmesi.

# L - The Liskov Substitution Principle (LSP)
* Barbara liskov
* Alt sınıflardan oluşturduğumuz nesnler, üst sınıfın nesnesi ile yer değiştirdiğinde aynı davranışı sergileyebilmeli
* Türetilen sınıf, türüyen sınıfın tüm özelliklerini kullanılabilmeli
* Kullanılmaması gereken durumlar var ise onların ayrışrırmalısın.

# I - The Interface Segregation Principle (ISP)
* Nesnenin ihtiyacı olmatan metodları interface'den çıkarın.
* Bir interface'de gerektiğinden fazla method olmamalı.
* Böyle bir durumda interfaceleri bölmek gerekli.

# D - The Dependency Inversion Principle (DIP)
Bağımlılıkların tersine çevrilmesi
* Yüksek seviyeli sınıflar, düşük seviye sınıflara bağlı olmamalı
* Her 2si de soyut kavramlara(interfaceler,abstract classlara) bağlı olmalıdır.