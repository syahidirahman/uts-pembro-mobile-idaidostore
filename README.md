# 🛒 IDAIDOSTORE - Mobile App

Aplikasi e-commerce dan katalog digital resmi untuk **IDAIDOSTORE**. Proyek ini dikembangkan sebagai pemenuhan tugas Ujian Tengah Semester (UTS) mata kuliah Pemrograman Mobile. Aplikasi ini dirancang untuk memberikan pengalaman berbelanja digital yang responsif, interaktif, dan aman bagi pengguna.

## ⚙️ Teknologi yang Digunakan
* **Bahasa Pemrograman:** Kotlin
* **IDE:** Android Studio
* **Desain Antarmuka:** XML (ConstraintLayout & LinearLayout)
* **Version Control:** Git & GitHub

## ✨ Fitur Utama
* **Katalog Produk Terintegrasi:** Menampilkan berbagai etalase produk mulai dari *Top Up Game* (Mobile Legends, Free Fire), *Fashion*, *Elektronik*, hingga *Makanan*.
* **Filter Kategori Dinamis:** Memudahkan pengguna memilah dan mencari produk secara spesifik berdasarkan kategori dengan perubahan warna antarmuka tombol yang aktif.
* **Halaman Autentikasi (Login):** Gerbang utama masuk ke aplikasi untuk memastikan keamanan akses pengguna sebelum masuk ke halaman utama.
* **Navigasi Mulus (Smooth Transition):** Perpindahan antar halaman (Beranda, Tentang, dan Login) menggunakan animasi *fade-in* dan *fade-out* khusus tanpa jeda layar putih.
* **Keamanan Logout:** Dilengkapi *Alert Dialog* untuk konfirmasi sebelum pengguna keluar, serta pembersihan riwayat halaman (*back stack*) menggunakan `finishAffinity()` agar sesi benar-benar tertutup.
* **Responsif:** Menggunakan `fitsSystemWindows` sehingga *navigation bar* tidak tertutup oleh sistem bawaan ponsel Android.

## 👥 Anggota Tim & Pembagian Tugas

Berikut adalah rincian kontribusi masing-masing anggota dalam pengembangan aplikasi IDAIDOSTORE:

| Nama | NIM | Tugas Utama |
| :--- | :--- | :--- |
| **Hilyatul Aulia** | C030324020 | Design UI/UX, Halaman Tentang, Logout, Editing Video. |
| **Ridho Drajat** | C030324104 | Halaman Beranda (termasuk logika *filter* kategori, konfigurasi *Intent* navigasi, implementasi transisi *smooth*, serta optimasi UI `fitsSystemWindows`). |
| **Syahidi Rahman** | C030324109 | Membuat page Splash Screen, serta mengelola seluruh proses *Git* sebagai Git Manager.
| **Muhammad Ahyat** | C030324130 | Halaman Login. |

## 🎥 Video Presentasi & Demo Aplikasi
Untuk melihat bagaimana aplikasi ini berjalan beserta penjelasan teknis terkait *source code* yang digunakan, silakan saksikan melalui tautan YouTube berikut:
* 🎥 **Link Video Youtube:** 👉 **https://youtu.be/K4dvWDcvGiM?si=BJUEbuGynu_xU-iE**

## 🎨 Desain UI/UX
Anda dapat melihat *mockup* desain UI/UX aplikasi kami melalui tautan berikut:
👉 **https://www.figma.com/design/MSUK0rJStNO2fkNv2f0kC6/PBL?node-id=2047-2&t=H5GpjP1x0znzs00M-1**

## ©️ Atribusi & Hak Cipta
* Seluruh ikon yang digunakan pada antarmuka aplikasi ini (*Home, Info, Logout,* dll.) diambil dari **[Google Fonts - Material Icons](https://fonts.google.com/icons)**.

---
*Dibuat untuk keperluan akademik - Teknik Informatika Kelas 4D.*
