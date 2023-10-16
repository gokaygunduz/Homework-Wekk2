package org.example;

/* -----------------------------------------------------------------------------------------
SORU 2  API, Kütüphane,  MAVEN kavramlarını yazılım gelişƟrirken sunduğu katkıları belirtiniz.
API: farklı türden uygulamaların aynı ana akışı üzerinde birlikte çalışmasını sağlayan yazılım parçasıdır. Kısacası
yazılımların birbiri arasındaki iletişim biçimide denilebilir. Bu yönden yazılımda bize kolaylık sağlar.
KÜTÜPHANELER: bilgisayar programları tarafından yazılım geliştirme amaçlı kullanılan kalıcı kaynakların tümüdür
içinde belli fonksiyonları kendi barındırdığından yazılımda programı yazan kişiye büyük kolaylık sağlar.
MAVEN: Eğer kütüphanelerden biri bir güncelleme aldığında yazılan kodda büyük sorunlar baş göstermeye başlayabilir ama
Maven bu kütüphaneleri otomatik güncelleyip bizim kodumuzun yeni kütüphane sürümünde de çalışmasına fayda sağlar kodu
değiştirmeye ihtiyaç duymayız .
 ---------------------------------------------------------------------------------------------- */
/* SORU 3 Debug kavramını araşƨrınız.   10 kere Merhaba yazısını for döngüsü ile yazınız debug modda gözlemleyiniz. */
/* DEBUG Kavramı Eğer kodda bir hata varsa bunu erken gözlemlemek için kodun belli noktalarına uygulanan bir yöntemdir
bu yöntem yazılımda pratiklik ve büyük bir zaman tasarrufu  sağlar */
public class soru3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // i değeri 0 dan başlayıp 10 a kadar yani 10 kere aynı cümleyi döndürecek
            System.out.println("Hello World");
        }
    }
}
