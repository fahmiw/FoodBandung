package com.example.bandungfood.data;

import com.example.bandungfood.R;

import java.util.ArrayList;

public class FoodData {
    private static String[] foodNames = {
            "Seblak",
            "Lotek",
            "Mie Kocok",
            "Surabi",
            "Ulukutek Leunca",
            "Bandros",
            "Peuyeum",
            "Nasi Liweut",
            "Cireng",
            "Cilok"
    };
    private static String[] foodDetails = {
            "Seblak adalah makanan Indonesia, umumnya adalah makanan khas dari Sunda, Jawa Barat yang bercita rasa gurih dan pedas yang terbuat dari kerupuk basah yang dimasak dengan sayuran dan sumber protein seperti telur, ayam, boga bahari atau olahan daging sapi, dimasak dengan bumbu tertentu. Bahan dasarnya adalah kerupuk udang yang disiram dengan air panas dan diberi bumbu serta sayuran. seblak terbuat dari kerupuk yang direbus, dan diberi bumbu seperti bawang merah, bawang putih, garam, kencur, cabai rawit, dan penyedap rasa.",
            "Lotek adalah salah satu makanan dari Jawa Barat yang mudah ditemukan di seluruh wilayah Jawa Barat. Sepintas lotek ini hampir mirip dengan Gado-gado, yakni makanan berupa rebusan sayuran segar yang disiram dressing berupa sambal dicampur bumbu kacang.",
            "Mie kocok adalah hidangan mi bercitarasa kaldu sapi khas kota Bandung, Jawa Barat. Hidangan ini terdiri atas mi kuning yang disajikan dalam kuah kaldu sapi kental, irisan kikil (tendon kaki sapi), taoge, bakso, jeruk nipis, dan ditaburi irisan seledri, daun bawang, dan bawang goreng. Beberapa resep mungkin menambahkan babat sapi. Istilah kocok dalam nama hidangan ini merujuk kepada proses memasaknya, yaitu mengocok-ngocok mi dalam wadah logam bolong-bolong bergagang, seraya mencelupkannya ke dalam air panas. Jenis mi yang digunakan adalah mi kuning gepeng yang bertekstur lebih lembut.",
            "Surabi merupakan jajanan tradisional Kota Bandung yang sudah ada sejak dulu. Dengan berbahan dasar tepung beras, tepung terigu dan santan kelapa. Di masak menggunakan tungku sehingga menghasilkan rasa dan aroma yang khas. Ada dua jenis surabi, yaitu surabi manis dengan menggunakan kinca dan surabi asin yang ditaburi oncom di atasnya, biasanya agak pedas.",
            "Ulekutek oncom adalah makanan khas Jawa Barat yang berbahan dasar oncom dan leunca (Solanum Nigrum L). Nama ulekutek berasal dari cara pembuatannya dengan cara di ulek atau di tumbuk, sedangkan kutek berasal dari bahasa sunda yang artinya diaduk.",
            "Bandros adalah salah satu makanan khas daerah Jawa Barat Kue tradisional ini terbuat dari campuran tepung beras, kelapa parut, daun suji dan santan. Kue ini biasanya dihidangkan dengan taburan gula pasir. Bentuk kue ini mirip dengan kue pukis karena memang di cetak pada cetakan yang serupa, yakni cetakan yang berbentuk setengah lingkaran dan berjejer cukup banyak, dengan tungku arang.",
            "Peuyeum adalah tapai yang dibuat dari singkong yang difermentasi dengan melibatkan aktivitas dari ragi Saccharomyces cerevisiae.  Khas yang dimiliki peuyeum yaitu warna putih bersih, bentuknya seperti umbi singkong utuh pada umumnya saat dijajakan namun memiliki tekstur yang sangat empuk dan lembut saat dipegang atau saat dicicipi, memiliki rasa manis khas dan aroma yang cukup menarik dan tentunya mengugah siapa pun untuk menikmatinya.",
            "Nasi liwet Sunda punya sejarah unik di balik kemunculannya. Sajian nasi satu ini berawal dari keinginan para petani untuk membawa bekal praktis saat bertani atau berladang. Agar hemat, mereka mencampur nasi dengan lauk pauk sederhana. Mereka lalu ngaliwet (membuat nasi liwet) dengan cara memasak nasi bersama bumbu-bumbu seperti bawang merah, bawang putih, serai, dau salam, cabai, dan santan dalam panci khusus liwet atau yang disebut kastrol.",
            "Cireng (singkatan dari aci goreng, bahasa Sunda untuk 'tepung kanji goreng') adalah makanan ringan yang berasal dari daerah Sunda yang dibuat dengan cara menggoreng campuran adonan yang berbahan utama tepung kanji atau tapioka. Makanan ringan ini sangat populer di daerah Priangan, dan dijual dalam berbagai bentuk dan variasi rasa. Makanan ini cukup terkenal pada era 80-an. Bahan makanan ini antara lain terdiri dari tepung kanji, tepung terigu, air, merica bubuk, garam, bawang putih, kedelai, daun bawang dan minyak goreng. ",
            "Cilok adalah sebuah makanan khas Jawa Barat yang terbuat dari tapioka yang kenyal dengan tambahan bumbu pelengkap seperti sambal kacang, kecap, dan saus. cilok bentuknya bulat-bulat seperti bakso, hanya saja berbeda bahan dasarnya. Terdapat telur atau daging cincang di dalamnya, karena terbuat dari bahan dasar tapioka maka cilok terasa kenyal saat dikonsumsi. "
    };
    private static int[] foodImages = {
            R.drawable.img_seblak,
            R.drawable.img_lotek,
            R.drawable.img_miekocok,
            R.drawable.img_surabi,
            R.drawable.img_ulukutek,
            R.drawable.img_bandros,
            R.drawable.img_peuyeum,
            R.drawable.img_liwet,
            R.drawable.img_cireng,
            R.drawable.img_cilok

    };
    private static String[] foodRecipe = {
                    "Bahan:\n" +
                        "- Krupuk warna warni/ bawang (bebas)\n" +
                        "- Bakso ikan\n" +
                        "- Sosis sapi\n" +
                        "- Sawi hijau\n" +
                        "- 2 butir telur\n" +
                        "- 2-3 gelas air\n" +
                        "- Kaldu bubuk\n" +
                        "- Kecap manis\n" +
                    "\n" +
                    "Bumbu halus:\n" +
                        "- 6 bawang merah\n" +
                        "- 3 bawang putih\n" +
                        "- 1 cm kencur\n" +
                        "- 25 cabai rawit merah\n" +
                        "- 5 cabai merah keriting\n" +
                    "\n" +
                    "Cara memasak:\n" +
                        "- Rebus kerupuk selama kurang lebih 10 menit. Tiriskan\n" +
                        "- Panaskan minyak. Tumis bumbu halus hingga matang dan harum, sisihkan dulu ke pinggir wajan lalu masukan telor diorak-arik\n" +
                        "- Masukan sosis, bakso, tuang air lalu masukan krupuk yang udah direbus. Beri bumbu garam, gula, kaldu bubuk dan kecap manis.\n" +
                        "- Test rasa yang sesuai diinginkan. Angkat dan siap disajikan.\n" +
                        "- Tambahkan bawang goreng agar lebih sedap.",

                    "Bahan:\n" +
                        "- Daun kangkung segar ( 250 gram )\n" +
                        "- Kacang panjang ( 250 gram )\n" +
                        "- Kol segar  ( 250 gram )\n" +
                        "- Taoge segar ( 150 gram )\n" +
                        "- Mentimun segar ( 200 gram )\n" +
                        "- Tempe goreng ( 300 gram )\n" +
                        "- Kacang tanah goreng siap pakai ( 225 gram )\n" +
                            "\n" +
                    "Bumbu:\n" +
                        "- Cabai merah keriting ( 4 buah )\n" +
                        "- Cabai rawit merah ( 4 siung )\n" +
                        "- Bawang putih ( 2 siung )\n" +
                        "- Terasi matang ( 1 sendok teh )\n" +
                        "- Air asam jawa ( 100 ml )\n" +
                        "- Gula merah sisir ( 200 gram )\n" +
                        "- Kencur ( 2 ruas jari )\n" +
                        "- Garam ( 1,5 sendok teh atau sesuai selera )\n" +
                            "\n" +
                    "Cara Pembuatan:\n" +
                        "- Siangi taoge, pisahkan dari bagian yang kotor lalu cuci hingga benar-benar bersih. Tiriskan.\n" +
                        "- Iris-iris tipis kol, lalu cuci hingga bersih dan tiriskan.\n" +
                        "- Cuci daun kangkung hingga benar-benar bersih, lalu tiriskan.\n" +
                        "- Potong-potong kacang panjang lalu cuci hingga bersih dan tiriskan.\n" +
                        "- Rendam tauge dengan air panas selama 20 menit. Lalu angkat dan tiriskan.\n" +
                        "- Kukuslah daun kangkung, potongan kacang panjang dan irisan kol hingga setengah matang. Lalu angkat.\n" +
                        "- Haluskan bawang putih, cabai rawit, cabai merah keriting, kencur, terasi matang, dengan sedikit garam.\n" +
                        "- Setelah benar-benar halus, masukan kacang tanah goreng dan gula merah. Haluskan hingga benar-benar halus.\n" +
                        "- Setelah benar-benar halus, tambahkan air asam jawa ke dalam saus kacang yang telah dihaluskan tadi. Aduk merata.\n" +
                        "- Susun sayuran yang telah dikukus tadi serta taouge ke dalam piring saji.\n" +
                        "- Tuangi dengan saus kacang dan aduk merata.\n" +
                        "- Potong-potong tempe goreng dan mentimun dalam bentuk dadu kecil.\n" +
                        "- Campurkan potongan tempe dan mentimun ke dalam Lotek. Aduk merata.\n" +
                        "- Lotek khas sunda siap dinikmati.\n",

                    "Bahan:\n" +
                        "- mie lebar (bisa dicari di pasar)\n" +
                        "- 250 gr kikil sapi\n" +
                        "- 2 lembar daun jeruk\n" +
                        "- Bakso sapi (selera)\n" +
                        "- 1 lembar daun salam\n" +
                        "- 2 cm lengkuas, di geprek\n" +
                        "- 1 batang serai, di geprek\n" +
                        "- Tauge secukupnya (selera)\n" +
                        "- 1 siung bawang putih\n" +
                        "- 3 siung bawang merah\n" +
                        "- 1/2 sendok teh lada bubuk (selera)\n" +
                        "- garam dan gula secukupnya\n" +
                        "- air secukupnya\n" +
                        "- irisan tomat, daun bawang dan seledri secukupnya\n" +
                            "\n" +
                    "Cara Pembuatan:\n" +
                        "- Didihkan air, lalu rebus kikil sapi sampai empuk, taburkan sedikit garam. setelah empuk, angkat, potong2, sisihkan.\n" +
                        "- Tumis bumbu bersama serai, lengkuas, daun jeruk dan daun salam, sampai wangi dan matang, tambahkan air panas secukupnya dan sebagian air kaldu sisa rebusan tadi.\n" +
                        "- Beri garam dan gula, test rasa, masak sampai air mendidih dan baso matang.\n" +
                        "- Sementara menunggu kuah matang, rendam sebentar mie basah dengan air panas, tiriskan.\n" +
                        "- Tata dalam mangkok: mie, toge, potongan kikil, siram dengan kuah kaldu, tambahkan irisan tomat daun bawang, bawang goreng, dan seledri.\n" +
                        "- Mie kocok siap dinikmati.\n",
                    "Bahan:\n" +
                        "- 225 gram tepung beras haluskan sendiri\n" +
                        "- 25 gram tepung tapioka\n" +
                        "- 100 gram kelapa muda kupas parut\n" +
                        "- 1 sdt peres garam\n" +
                        "- 500-550 ml santan\n"+
                        "\n" +
                    "Cara Pembuatan:\n" +
                        "- Uleni tepung dan kelapa parut dengan 200 ml santan sekitar 10 menit. Masukkan sisa santan, kocok dengan whisk hingga menghasilkan banyak gelembung/busa.\n" +
                        "- Diamkan adonan minimal selama dua jam. Siapkan cetakan serabi, olesi cetakan dengan minyak sayur, panaskan dengan api sedang cenderung besar hingga jika diciprati air akan berdesis.\n" +
                        "- Tuang adonan, tutup dengan tutup yang juga sudah dipanaskan. Gunakan api yang cukup besarnya, api kecil membuat bagian bawah serabi menjadi alot, api yang terlalu besar membuat serabi cepat gosong meski bagian tengahnya masih mentah.\n",
                    "Bahan:\n" +
                        "- 1/4 kg leunca, bersihkan\n" +
                        "- 1 genggam kemangi\n" +
                        "- 1 buah tomat, potong-potong\n" +
                        "- 3 lembar daun salam\n" +
                        "- 2 cm lengkuas, geprak\n" +
                        "- 2 batang sereh, geprak\n" +
                        "- 10 buah cabe rawit utuh\n" +
                        "- gula, garam secukupnya\n" +
                        "- air sedikit (kurleb 50 ml)\n" +
                        "- bumbu penyedap (bila suka)\n" +
                        "\n" +
                    "Cara Pembuatan:\n" +
                        "- tumis bumbu yang udah digerus kasar + tomat + salam + lengkuas + sereh + cabe rawit utuh sampe wangi\n" +
                        "- masukkan leunca, aduk rata, tambahkan gula, garam, royco dan air\n" +
                        "- tumis sampai leunca sedikit layu, masukkan daun kemangi, aduk sebentar, angkat, siap dihidangkan\n",
                    "Bahan:\n" +
                        "– 150 gram kelapa 1/2 tua,kupas, parut panjang\n" +
                        "– 150 gram tepung beras\n" +
                        "– 1 sdt garam\n" +
                        "– 400 ml santan kental\n" +
                        "– Minyak goreng untuk olesan\n" +
                    "\n" +
                    "Cara Pembuatan:\n" +
                        "– Campur kelapa parut, tepung beras dan garam, tuang santan sedikit demi sedikit sambil diaduk hingga tercampur rata.\n" +
                        "– Panaskan cetakkan kue pukis, olesi dengan sedikit minyak, tuang adonan ke dalam cetakan hingga penuh, kemudian tutup.\n" +
                        "– Panggang di atas bara api kecil hingga matang dan di kedua sisinya garing, angkat.\n" +
                        "– Sajikan selagi panas.",
                    "Bahan:\n" +
                        "– Secukupnya singkong\n" +
                        "– Secukupnya daun pisang\n" +
                        "– Secukupnya ragi, haluskan\n" +
                        "– Secukupnya air\n"+
                            "\n" +
                    "Cara Pembuatan:\n" +
                        "– Singkong dikupas dan dikerik sampai bersih lalu dipotong atau dibiarkan memanjang. Setelah itu, bilas singkong sampai bersih dan tiriskan.\n" +
                        "– Rebus singkong hingga matang lalu angkat dan tiriskan.\n" +
                        "– impan singkong yang sudah direbus matang dalam wadah ember dan biarkan dinging.\n" +
                        "– Setelah singkong rebus dingin, taburi singkong dengan ragi yang sudah dihaluskan sampai merata.\n" +
                        "– Kemudian pindahkan singkong yang sudah bercampur dengan ragi pada wadah yang sudah diberi alas daun pisang lalu tutup rapat dengan daun singkong dan wadah penutup.\n" +
                        "– Tunggu selama kurang lebih 3 hari sampai singkong terasa lembek dan menjadi peuyeum. Keluarkan.\n" +
                        "– Peuyeum siap dinikmati.",
                    "Bahan:\n" +
                        "– Beras 300 gram\n" +
                        "– Air secukupnya\n" +
                        "– Serai 2 batang\n" +
                        "– Daun salam 5 lembar\n" +
                        "– Bawang merah iris\n" +
                        "– Bawang putih 5 siung, iris tipis\n" +
                        "– Cabai rawit 10 buah\n" +
                        "– daun kemangi sesuai selera\n" +
                        "– Teri medan 100 gram (goreng matang)" +
                            "\n" +
                    "Cara Pembuatan:\n" +
                        "– Langkah pertama yang harus Anda lakukan adalah memanaskan minyak goreng dan masukkan semua bahan. Setelah itu tumis bahan-bahan tersebut seperti serai, daun sama, bawang putih, bawang merah dan cabai rawit masak hingga aromanya wangi. Jika sudah angkat dan tiris kan tumisan bahan-bahan tersebut.\n" +
                        "– Selanjutnya masukkan beras yang sudah di cuci bersih ke dalam panci rice cooker. Setelah itu masukkan tumisan bumbu ke dalam panci dan tuangkan air secukupnya. Masak hingga airnya sedikit berkurang, jangan lupa untuk mengaduknya dan tutup rice cooker tersebut.\n" +
                        "– Langkah selanjutnya yaitu masukkan teri medan yang sudah disiapkan sebelumnya. masukkan juga daun kemangi dan aduk hingga tercampur rata.\n" +
                        "– Terakhir Anda hanya perlu menunggu nasi benar hingga matang. Jika sudah sajikan nasi dengan pelengkap sekaligus dengan lalap",
                    "Bahan:\n" +
                        "– 250 gram Ttepung kanji\n" +
                        "– 50 gram tepung terigu serbaguna\n" +
                        "– 2 batang daun bawang, iris halus\n" +
                        "– 2 batang seledri, iris halus\n" +
                            "\n" +
                    "Cara Pembuatan:\n" +
                        "– Campurkan tepung kanji dengan tepung tapioka hingga tercampur sempurna.\n" +
                        "– Tambahkan daun bawang, seledri yang telah diiris halus, bawang putih yang telah dihaluskan, penyedap rasa ayam, merica, dan garam.\n" +
                        "– Tambahkan air panas perlahan-lahan sembari diaduk atau diuleni hingga kalis.\n" +
                        "– Adonan yang telah tercampur sempurna kemudian mulai dibentuk. Bentuk sesuai selera. Jika ingin pipih seperti koin, tipis saja jangan terlalu tebal. Jika ingin dibuat bulat-bulat kecil saja.\n" +
                        "– Panaskan minyak goreng dalam wajan. Setelah panas, adonan yang telah dibentuk tadi kemudian dimasukkan atau digoreng hingga matang.",
                    "Bahan:\n" +
                        "- 150gr tepung sagu\n" +
                        "- 75gr tepung terigu\n" +
                        "- 1 sdt garam\n" +
                        "- 1/2 sdt merica\n" +
                        "- 2 siung bawang putih, haluskan\n" +
                        "- Bumbu penyedap\n" +
                        "- Air hangat secukupnya\n" +
                            "\n" +
                    "Cara Pembuatan:\n" +
                        "- Campur semua bahan, aduk rata.\n" +
                        "- Masukan air sedikit demi sedikit, sampai adonan bisa dibentuk.\n" +
                        "- Siapkan air yang sudah mendidih, lalu bentuk adonan menjadi bulat-bulat kecil dan langsung masukan ke dalam air.\n" +
                        "- Jika cilok sudah mengapung, angkat dan sisihkan dan tambahkan bumbu kacang."
    };

    private static String[] foodPrice = {
            "Rp.10.000",
            "Rp.10.000",
            "Rp.20.000",
            "Rp.3.000",
            "Rp.15.000",
            "Rp.2.000",
            "Rp.6.000",
            "Rp.60.000",
            "Rp.2.000",
            "Rp.5.000"
    };

    private static String[] foodLink = {
            "https://www.google.com/search?tbm=isch&as_q=seblak",
            "https://www.google.com/search?tbm=isch&as_q=lotek",
            "https://www.google.com/search?tbm=isch&as_q=mie+kocok",
            "https://www.google.com/search?tbm=isch&as_q=surabi",
            "https://www.google.com/search?tbm=isch&as_q=ulukutek",
            "https://www.google.com/search?tbm=isch&as_q=bandros",
            "https://www.google.com/search?tbm=isch&as_q=peyeum",
            "https://www.google.com/search?tbm=isch&as_q=nasi+liwet",
            "https://www.google.com/search?tbm=isch&as_q=cireng",
            "https://www.google.com/search?tbm=isch&as_q=cilok",
    };

    public static ArrayList<Food> getListData(){
        ArrayList<Food> foodArrayList = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++){
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodImages[position]);
            food.setRecipe(foodRecipe[position]);
            food.setPrice(foodPrice[position]);
            food.setLink(foodLink[position]);
            foodArrayList.add(food);
        }
        return foodArrayList;
    }

}
