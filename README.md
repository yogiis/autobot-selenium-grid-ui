# autobot-selenium-grid-ui

**Tools dan Software :**

* Code editor : Intellij IDE Community Edition(https://www.jetbrains.com/idea/download/)

* Java Development Kit 8 (https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

* NodeJS (https://nodejs.org/en/)


**Instalasi :**

* Download dan Install Intellij IDEA Community, JDK 8, Node.js. Ikuti saja sesuai langkah-langkah dari installernya.

**Setting Environment :**

**Windows**

1. Klik kanan My Computer > Klik Properties > Klik Advance system settings > Klik Environment Variables > Klik PATH > Klik Edit.

2. Ketikkan: `C:\Program Files\Java\java-8\bin` (disesuaikan dengan direktori instalasi)

3. Buat variable baru dengan nama JAVA_HOME kemudian berikan value: `C:\Program Files\Java\java-8` (disesuaikan dengan direktori instalasi)

**Linux**

1. Jalankan Terminal.

2. Ketikkan sudo gedit `~/.bashrc` (pastikan di komputer telah terinstall aplikasi GEdit).

3. Kemudian di baris pertama, ketikkan sebagai berikut (disesuaikan dengan direktori instalasi):

> export JAVA_HOME=/usr/lib/jvm/java-8

**Mac**

1. Buka Terminal 

2. Kemudian ketik command open `~/.bash_profile`

3. Ketikkan pada baris pertama sebagai berikut (disesuaikan dengan direktori instalasi):

> export JAVA_HOME="$(/usr/libexec/java_home -v 1.8)"

Setelah itu source `source ~/.bash_profile` , simpan kemudian reboot komputer.

Untuk melakukan pengecekan apakah sesuai dengan pengaturan Environment Variables yang telah kita atur di atas, lakukan:

1. Jalankan Terminal.

2. Ketikkan command `java -version` kemudian tekan Enter.

3. Cek apakah versi JDK sudah sama dengan yang diinstall. Jika tidak muncul versi JDK, maka cek kembali setting Environment Variables.

4. Berikutnya ketik command which java tekan Enter.

5. Cek apakah direktori yang muncul sama dengan direktori yang didefinisikan di Environment Variables. Jika belum, maka cek kembali setting Environment Variables.

**Membuat Project Maven**

Langkah membuat project Maven:

1. Buka Intellij IDEA Community Open Source  

2. Pilih Create New Project

3. Pilih Maven.

4. Kemudian Next.

5. Lalu isi GroupId dan ArtifacID sesuai project kamu

6. Lalu Isi Project Name

7. Pilih OK

8. Selanjutnya Install Plugin Gherkin & Cucumber for Java

9. Pilih Preferences pada IDE Intellij IDEA Community

10. Pilih Plugin Gherkin dan Cucumber for Java

11. Jika sudah klik OK
