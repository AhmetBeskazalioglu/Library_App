
# Anke Library App

Anke Library App, Java tabanlı bir kütüphane yönetim uygulamasıdır. Bu uygulama, kitapların, yayınevlerinin ve yazarların yönetimini kolaylaştırmak için tasarlanmıştır.

---

## İçindekiler

- [Proje Hakkında](#proje-hakkında)
- [Kurulum](#kurulum)
- [Kullanım](#kullanım)
- [API Kullanımı](#api-kullanımı)
- [Proje Yapısı](#proje-yapısı)
- [Lisans](#lisans)
- [Destek](#destek)

---

## Proje Hakkında

Anke Library App, kütüphanelerin kitap yönetimini kolaylaştıran bir uygulamadır. Kullanıcılar, kitapları yayınevlerine ve yazarlara göre yönetebilirler. Şu an için kitaplar, yayınevleri ve yazarlar üzerinde listeleme (findAll) ve oluşturma (create) işlemleri yapılabilir.

### Özellikler

- Kitap, yayınevi ve yazar ekleme
- Kitap, yayınevi ve yazar listeleme

---

## Kurulum

### Gereksinimler

- Java 8 veya üzeri sürüm
- Maven (bağımlılıkları yönetmek için)

### Adımlar

1. **Projeyi İndirme:**
   ```bash
   git clone https://github.com/AhmetBeskazalioglu/Library_App.git
   cd Library_App
   ```

2. **Uygulamayı Derleme ve Çalıştırma:**
   ```bash
   mvn clean package
   java -jar target/AnkeLibraryApp-1.0-SNAPSHOT.jar
   ```

---

## Kullanım

Uygulama, komut satırı veya web arayüzü üzerinden kitapları, yayınevlerini ve yazarları yönetmek için kullanılır.

### Örnek Kullanım Senaryosu

1. **Yayınevi Ekleme**
   - Yayınevi adı ve diğer detaylarla birlikte yeni bir yayınevi ekleyin.

2. **Yazar Ekleme**
   - Yazar adı, soyadı ve ilgili kitaplarla birlikte yeni bir yazar ekleyin.

3. **Kitap Ekleme**
   - Başlık, fiyat, ISBN ve yayınevi bilgileriyle yeni bir kitap ekleyin.

---

## API Kullanımı

Uygulama, REST API'leri aracılığıyla kitap, yayınevi ve yazar verilerini yönetir.

### API URL'leri

- **Kitap API:** `/books`
- **Yayınevi API:** `/publishers`
- **Yazar API:** `/authors`

### Örnek Kullanım

```bash
# Yeni bir kitap eklemek için POST isteği
curl -X POST "http://localhost:8080/api/books" -H "Content-Type: application/json" -d '{
    "title": "Java Foundations",
    "price": 29.99,
    "isbn": "978-0134895713",
    "publisherId": 1,
    "authorIds": [1, 2]
}'

# Tüm kitapları listelemek için GET isteği
curl -X GET "http://localhost:8080/api/books"
```

---

## Proje Yapısı

Proje içindeki önemli dosyalar ve sınıflar:

- `src/main/java/com/anke/AnkeLibraryApp`: Java kodları
  - `controller/BookController.java`, `PublisherController.java`, `AuthorController.java`: REST API kontrolcüleri
  - `entity/Book.java`, `Publisher.java`, `Author.java`: Veritabanı varlıkları
  - `service/BookService.java`, `PublisherService.java`, `AuthorService.java`: Uygulama mantığı ve veri işlemleri

---

## Lisans

Bu proje MIT Lisansı ile lisanslanmıştır. Daha fazla bilgi için [LICENSE](LICENSE) dosyasına göz atabilirsiniz.

---

## Destek

Projeye katkıda bulunmak veya sorun bildirmek isterseniz, lütfen bir [issue](https://github.com/AhmetBeskazalioglu/Library_App/issues) açın veya bir [pull request](https://github.com/AhmetBeskazalioglu/Library_App/pulls) gönderin.
