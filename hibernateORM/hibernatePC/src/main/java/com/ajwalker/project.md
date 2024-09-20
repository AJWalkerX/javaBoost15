# User - Pc - Components
>Database Adı: Java15HibernatePc

Bir user'ın birden fazla PC'si olabilir. Bir PC'nin bir User'ı olabilir. (One-to-many) Bir PC'de birden fazla component olabilir. bir component bir PC'ye aittir. (One-to-many)

entity-> User, Pc, Component(id,ad,tur) enum -> ComponentType ( CPU,RAM,HARDDISK,MAINBOARD,POWERSUPPLY,GRAPHICCARD,MONITOR,WEBCAM,MOUSE,KEYBOARD,MICROPHONE,SPEAKER )

# Sorular
## Soru 1. id'si verilen kullanıcının bilgisayarlarını getir.
>bdemirci pc-1 pc-2

## Soru 2. id'si verilen kullanıcının bilgisayarlarını ve o bilgisayara ait componentleri getir.
>bdemirci pc-1 cpu: Intel i9 mainboard: Gigabyte ram: Kingston

>pc-2 cpu: Intel i9 harddisk: Samsung

## Soru 3. Tüm kullanıcıların bilgisayarlarını ve o bilgisayara ait componentleri getir.
>bdemirci pc-1 cpu: Intel i9 mainboard: Gigabyte ram: Kingston

>pc-2 cpu: Intel i9 harddisk: Samsung

>edemir pc-1 cpu: Intel i9 mainboard: Gigabyte ram: Kingston

>pc-2 cpu: Intel i9 harddisk: Samsung

>arda pc-1 cpu: Intel i9 mainboard: Gigabyte ram: Kingston

>emre pc yok.