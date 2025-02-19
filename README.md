# Katalon-Weather-Testing
Proyek ini merupakan automation testing untuk API OpenWeather menggunakan Katalon Studio.

**1.Cara Menjalankan**

*Clone Repository
git clone https://github.com/panji9904/Katalon-Weather-Testing.git


*Buka Katalon Studio
Klik File > Open Project
Pilih folder proyek ini
Menjalankan Test Case / Test Suite
Pilih Test Cases yang ingin dijalankan
Klik kanan > Run
Atau buka Test Suites, lalu klik Run
Melihat Hasil Report

*Setelah tes selesai, laporan akan muncul di folder:
Copy
Edit
Reports/YYYYMMDD_HH
Laporan bisa berupa HTML, PDF, atau JUnit Report

**2.Struktur Proyek Katalon OpenWeatherAPI**

Berikut adalah struktur proyek Katalon Studio untuk pengujian API OpenWeather:

**OpenWeatherAPI/ (Root folder proyek)**

*Test Cases/ → Berisi skenario pengujian individu > GetWeatherForecast

*Test Suites/ → Mengelompokkan beberapa test case > WeatherAPITests

*Reports/ → Hasil laporan pengujian

*Object Repository/ → Menyimpan objek yang digunakan dalam test case

*Data Files/ → Jika ada file eksternal yang digunakan dalam pengujian

*README.md → Dokumentasi proyek

*.gitignore → File yang diabaikan oleh Git

*katalon.project → Konfigurasi proyek Katalon
