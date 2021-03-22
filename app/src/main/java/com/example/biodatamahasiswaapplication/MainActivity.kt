package com.example.biodatamahasiswaapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.biodatamahasiswaapplication.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ListMahasiswaAdapter.onMahasiswaItemClickListener{

    lateinit var binding : ActivityMainBinding
    lateinit var ListMahasiswa : ArrayList<Mahasiswa>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        ListMahasiswa = ArrayList()
        addMahasiswa()

        list_Mahasiswa.layoutManager = LinearLayoutManager(this)
        list_Mahasiswa.addItemDecoration(DividerItemDecoration(this,1))
        list_Mahasiswa.adapter = ListMahasiswaAdapter(ListMahasiswa, this)
    }

    fun addMahasiswa(){
        ListMahasiswa.add(Mahasiswa("Yustisia Pratiwi Suhastri","Nama saya Yustisia Pratiwi Suhastri, biasa dipanggil yusti, umur delapan belas tahun, Tempat " +
                "kelahiran di kota bandung, tanggal lahir 25 Mei tahun 2000. Saya anak pertama dari lima " +
                "bersaudara, saya mempunyai tiga adik perempuan dan satu adik laki-laki. Saya tinggal " +
                "bersama orangtua saya, alamat rumah komplek seskoad jalan gatotsubroto no 96 Bandung." +
                "Hobi saya menggambar, tahun 2017 saya magang di sebuah studio animasi di Jogjakarta yaitu " +
                "MSV Pictures salah satu film animasi yang diproduksi oleh studio tersebut adalah “Battle of " +
                "Surabaya”. Saya mengerjakan project film animasi pendek dua dimensi yang berjudul “Ada apa " +
                "dengan Coin”, saya di tempatkan di divisi coloring, tugas saya mewarnai animasi dua dimensi" +
                " frame by frame yang sudah dibuat oleh animator, saya juga bertugas membuat background dan" +
                " foreground untuk film animasi tersebut software yang digunakan adalah toonboom, adobe, dan clip studio" +
                "Saya lulusan dari Sekolah Dasar Negeri Halimun tahun 2012, Sekolah Menengah Pertama Badan Perguruan" +
                " Indonesia tahun 2015, Sekolah Menengah Kejuruan BPI 2018.",R.drawable.yusti,"yustisia.it2@gmail.com","087724088955"))
        ListMahasiswa.add(Mahasiswa("Lukman Azis","Nama saya Lukman Azis Gunawan bisa di panggil Oky, saya lahir pada hari selasa tanggal 18 bulan " +
                " tahun 1995, saya anak ke dua dari tiga bersaudara. Sekarang ini saya tinggal di Bandung dan " +
                "hidup sendiri, saat ini saya bekerja di Kantor Advokat/Pengacara sambil kuliah di Universitas" +
                " Informatika dan Bisnis Indonesia mengambil jurusan Informatika." +
                "Kepribadian saya orangnya pendiam, apalagi kepada seseorang yang belum terlalu dekat. Saya sangat menyukai musik terutama musik Kpop," +
                " dan saya juga suka bermain Drum dan Gitar. Selain itu saya sangat menyayangi dan menghormati Orang Tua saya, dan juga membantu orang-orang terdekat saya.",R.drawable.lukman,"okyLukman@gmail.com","081321557037"))
        ListMahasiswa.add(Mahasiswa("Alif Budiman","Teman-teman haaay !!! Nama saya alif , saya anak pertama dari 3 bersaudara , anak cowo satu satunya.." +
                " saya saat ini sedang di sibukan dengan bekerja di salah satu super store yang berada di bandung," +
                " yaitu di bagian admin gudang Kemudian saya juga sedang melaksanakan studi s1 saya di unibi kampus " +
                "kita yang sangat di cintai ya teman-teman .. kalau teman - teman ingin lebih tau tentang saya, baca" +
                " dan simak cerita saya di bawah ini ya semoga menjadi motivasi, contoh, acuan buat kalian semua .. terimakasih..",R.drawable.alif,"budimanAlif98@gmail.com","087736793241"))
        ListMahasiswa.add(Mahasiswa("Iman Fauzan","dulu hidupku susah segala apapun tidak bisa membeli, apa yang ku inginkan selalu nunggu ada uang,  " +
                "tapi keesokan harinya aku berfikir gimana caranya aku harus menata masa depanku dan bekerja" +
                " keras bersungguh sungguh untuk mencapai itu semua dan tidak lupa pula sholat 5 tepat waktu,  kunci kesuksesan adalah jangan pernah tinggalkan sholat",R.drawable.fauzan,"Fauzan00@gmail.com","081212042466"))
        ListMahasiswa.add(Mahasiswa("Apris Agung","\"Halo Perkenalkan nama saya Apris Agung Wiresa ,saya lahir di Garut saya lahir di bulan April tepatnya 21" +
                "April 1998,sekarang saya berumur 21 Tahun dan sekarang saya tinggal bersama orang tua saya,saya termasuk laki-laki yang Setia dan baik hati walau saya bukanlaki laki yang humoris tapi saya termasuk" +
                " laki laki yang serba bisa ,sekarang saya sedang belajar di Universitas Informatika dan Bisnis",R.drawable.apris,"aprisAggung99@gmail.com","083820385353"))
        ListMahasiswa.add(Mahasiswa("Ahmad Zaenudin","Perkenalkan Saya Ahmad Zaenudin biasa dipanggil ahmad atau zae atau endin, Saya Lahir DiBandung , 16  September 1999. " +
                "Saya anak ke 2 dari 3 bersaudara. Saya bekerja disebuah perusahaan Elzatta yang bergerak dibindang fashion " +
                "hijab. Saya bekerja sebagai Sales diperusahaan tersebut. Toko toko  elzatta sudah menyebar diseluruh indonesia" +
                ", kantor pusat nya terletak di Bandung. Saya di tempat di toko yang ada di Pasar Baru Trade Center Lt.4 Blok" +
                " B2 no 36-37 Bandung. Alhamdulillah saya sangant nyamaan dan senang bisa bekerja ditempat tersebut , karena" +
                " tidak mengganggu dalam beribadah ,itu yang saya cari , sebelum nya saya pernah bekerja yang dimanaa untuk " +
                "solat pun sangat susah karena saya bekerja sebagai pengantar pizza , karena orderan banyak maka solat pun " +
                "sering terganggu , akhir nya saya memutus kan untuk keluar dan mencari pekerjaan baru , dan alhamdulillah " +
                "sudah mendapatkan pekerjaan yang saya ingin kan . Selain hal itu teman teman  sangat baik pada saya , " +
                "atasan saya pun sangat dekat dengan karyawan nya , itulah mengapa saya sangat betah bekerja ",R.drawable.ahmadzae,"zaenuddin92@gmail.com","087867910503"))
        ListMahasiswa.add(Mahasiswa("Sanita Rahayu","Nama saya Sanita Rahayu, mahasiswi Teknik Informatika Universitas Informatika dan Bisnis Indonesia .Saya anak ke dua" +
                " dari 2 bersaudara. Saya lahir pada tanggal 17 Februari 1997 di kota Sukabumi. Di Bandung saya tinggal " +
                "bersama kakak kandung dan kakak ipar saya.Jika bicara tentang kepribadian, saya termasuk orang cukup " +
                "ramah, murah senyum dan dapat diandalkan. Saya orang yang lebih suka mendengarkan daripada banyak bicara." +
                " Saya sangat menyayangi kedua orang tua saya dan kakak saya.",R.drawable.sanita,"sanita17@gmail.com","083192100173"))
        ListMahasiswa.add(Mahasiswa("M. Abdul Baqrik","Namaku M. Abdul Baqrik, Lahir di Tasikmalaya, 21 November 1996. Aku adalah anak keempat dari empat bersaudara" +
                " yang terlahir dari ibu yang bernama Mamah Suryamah yang menikah dengan lelaki Oon Rahlan. Saya Lahir" +
                " dikalangan keluarga sederhana. IBu saya bekerja sebagai buruh sedangkan Ayah saya sudah meninggal " +
                "waktu umur saya 2,5 tahun.Saya dibesarkan sama Nenek saya yang bernama Ratih, Beliau adalah Nenek " +
                "yang baik bagaikan ibu sendiri, Saya di besarkan sama nenek dari kecil sampai lulus sd kurang lebih" +
                " 12 tahun karena ibu saya bekerja sebagai tkw. Saya diajarin sama nenek harus jujur, baik dan jangan" +
                " pernah tinggalkan sholat. Ketika umur 6 tahun, memulai pendidikan di SDN Kalangsari II Tasikmalaya," +
                " kemudian setelah lulus saya melanjutkan sekolah di SMPN3 Tasikmalaya 2009, kemudian melanjutkan " +
                "pendidikan di SMK MJPS 1 Tasikmalaya kejuruan TKJ (Teknik computer jaringan) pada tahun 2013. " +
                "Saya sudah bekerja sebagai engineer Atm /Teknisi Atm di Pt Datindo Infonet prima kurang lebih 2 tahun.",R.drawable.abdul,"mabdulaqrik@gmail.com","081312002732"))
        ListMahasiswa.add(Mahasiswa("Deni Haryanto","Nama saya Deni Herayanto saya anak pertama, saya lahir Di Bandung 25,Juni,1996 Dan sekarang tinggal" +
                    "Di Daerah Jatinagor, karna tuntutan pekerjaan dan sekarang, Saya sedang menempuh pendidikan " +
                    "di Univeristas Bisnis Informatika Indonesia dan menggambil. Prodi (Informatika)" +
                    "Kribadian saya Humonis, Saya lebih menyekai Alam luar yaaa seperti pendakin gunung,ngecekam" +
                    "Di gunung dan semuanya tentang Alam, Tapiii bukan P.A (Pecinta Alam) Cuma Penikmat alam ajah dahhh",R.drawable.deni,"hostname@gmail.com","081572500212"))
        ListMahasiswa.add(Mahasiswa("Wendi Mulyadi Setiawan", "Saya adalah wendi mulyadi setiawan tipe orang yang pendiam yang tidak terlalu banyak bicara,akan tetapi" +
                " kalau sudah dekat dan mungkin berteman lama saya itu bakalan cerewet banyak omong juga tentu " +
                "saja berisik pastinya dan mungkin bisa buat orang nyaman dan tidak nyaman tergantung gimana si " +
                "orangnya. Selain cerewet saya juga orangnya lumayan humoris sering bercanda juga.kemudian terkadang " +
                "bisa buat orang kesal dengan kelakuan saya.saya orangnya tidak mudah tersenyum kepada orang yang " +
                "belum dikenal,selain itu juga saya tidak pandai berteman seperti orang lain itu mungkin salah satu " +
                "kekurangan saya,kemudian terkadang saya suka nervous ketika dalam keadaan tertentu dan kadang" +
                " ngeblank tiba-tiba tidak tau apa yang akan diucapkan,saya juga terkadang orangnya pelupa akan" +
                " tetapi ingatan saya kuat dalam mengingat sesuatu dari dulu kemudian saya juga sulit berkonsentrasi " +
                "ketika dalam keadaan ramai atau berisik sekali.adapun kelebihan saya mungkin kalo menurut saya,saya" +
                " itu orangnya pandai atau jago dalam hal olahraga yang memakai tangan seperti bermain bulu tangkis.",R.drawable.wendi,"mulyadiWendi@gmail.com","0895703162662"))
        ListMahasiswa.add(Mahasiswa("Oriza Dio Aria","Saya Oriza Dio Aria, dinamai Oriza dari kata oryza satifa yang berarti “Padi”. Harapannya dengan nama ini," +
                " orang tua saya ingin anaknya ini menjadi orang yang bermanfaat bagi semua orang karena sebagaimana" +
                " padi dibutuhkan semua orang berdasarkan manfaatnya sebagai bahan pangan yang pokok dikonsumsi" +
                " setiap hari.Oriza lahir di Bandung pada 17 Mei tahun 1998 kemudian Dibesarkan dilingkungan yang " +
                "taat beragama sampai habis masa SMA pun saya habiskan mempelajari ilmu agama Islam. Maka dengan bekal" +
                " ini, saya masuk pada lingkungan masyarakat dengan Islam sebagai landasan pertimbangan melakukan" +
                " sesuatu demi memenuhi harapan orang tua yang disematkan pada nama saya, seperti ditulis diatas.",R.drawable.oriza,"oriza12@gmail.com","089662116817"))
    }

        override fun onItemClick(item: Mahasiswa, position: Int) {
    //        Toast.makeText(this, item.name, Toast.LENGTH_SHORT).show()
            val intent = Intent(this,DetailMahasiswaActivity::class.java)
            intent.putExtra("NAMA", item.nama)
            intent.putExtra("DETAIL",item.detail)
            intent.putExtra("PHOTO",item.photo.toString())
            intent.putExtra("EMAIL",item.email)
            intent.putExtra("NOTLP",item.notlp)
            startActivity(intent)
        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profilemenu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.profile){
            this.startActivity(Intent(this, MyProfileActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }


    }

