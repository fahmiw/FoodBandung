package com.example.bandungfood;

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
            "seblak adalah makanan Indonesia, umumnya adalah makanan khas dari Sunda, Jawa Barat yang bercita rasa gurih dan pedas yang terbuat dari kerupuk basah yang dimasak dengan sayuran dan sumber protein seperti telur, ayam, boga bahari atau olahan daging sapi, dimasak dengan bumbu tertentu. Bahan dasarnya adalah kerupuk udang yang disiram dengan air panas dan diberi bumbu serta sayuran. seblak terbuat dari kerupuk yang direbus, dan diberi bumbu seperti bawang merah, bawang putih, garam, kencur, cabai rawit, dan penyedap rasa.",
            "lotek adalah salah satu makanan dari Jawa Barat yang mudah ditemukan di seluruh wilayah Jawa Barat. Sepintas lotek ini hampir mirip dengan Gado-gado, yakni makanan berupa rebusan sayuran segar yang disiram dressing berupa sambal dicampur bumbu kacang.",
            "Mie kocok adalah hidangan mi bercitarasa kaldu sapi khas kota Bandung, Jawa Barat. Hidangan ini terdiri atas mi kuning yang disajikan dalam kuah kaldu sapi kental, irisan kikil (tendon kaki sapi), taoge, bakso, jeruk nipis, dan ditaburi irisan seledri, daun bawang, dan bawang goreng. Beberapa resep mungkin menambahkan babat sapi. Istilah kocok dalam nama hidangan ini merujuk kepada proses memasaknya, yaitu mengocok-ngocok mi dalam wadah logam bolong-bolong bergagang, seraya mencelupkannya ke dalam air panas. Jenis mi yang digunakan adalah mi kuning gepeng yang bertekstur lebih lembut.",
            "surabi merupakan jajanan tradisional Kota Bandung yang sudah ada sejak dulu. Dengan berbahan dasar tepung beras, tepung terigu dan santan kelapa. Di masak menggunakan tungku sehingga menghasilkan rasa dan aroma yang khas. Ada dua jenis surabi, yaitu surabi manis dengan menggunakan kinca dan surabi asin yang ditaburi oncom di atasnya, biasanya agak pedas.",
            "Ulekutek oncom adalah makanan khas Jawa Barat yang berbahan dasar oncom dan leunca (Solanum Nigrum L). Nama ulekutek berasal dari cara pembuatannya dengan cara di ulek atau di tumbuk, sedangkan kutek berasal dari bahasa sunda yang artinya diaduk.",
            "bandros adalah salah satu makanan khas daerah Jawa Barat Kue tradisional ini terbuat dari campuran tepung beras, kelapa parut, daun suji dan santan. Kue ini biasanya dihidangkan dengan taburan gula pasir. Bentuk kue ini mirip dengan kue pukis karena memang di cetak pada cetakan yang serupa, yakni cetakan yang berbentuk setengah lingkaran dan berjejer cukup banyak, dengan tungku arang.",
            "peuyeum adalah tapai yang dibuat dari singkong yang difermentasi dengan melibatkan aktivitas dari ragi Saccharomyces cerevisiae.  Khas yang dimiliki peuyeum yaitu warna putih bersih, bentuknya seperti umbi singkong utuh pada umumnya saat dijajakan namun memiliki tekstur yang sangat empuk dan lembut saat dipegang atau saat dicicipi, memiliki rasa manis khas dan aroma yang cukup menarik dan tentunya mengugah siapa pun untuk menikmatinya.",
            "Nasi liwet Sunda punya sejarah unik di balik kemunculannya. Sajian nasi satu ini berawal dari keinginan para petani untuk membawa bekal praktis saat bertani atau berladang. Agar hemat, mereka mencampur nasi dengan lauk pauk sederhana. Mereka lalu ngaliwet (membuat nasi liwet) dengan cara memasak nasi bersama bumbu-bumbu seperti bawang merah, bawang putih, serai, dau salam, cabai, dan santan dalam panci khusus liwet atau yang disebut kastrol.",
            "cireng (singkatan dari aci goreng, bahasa Sunda untuk 'tepung kanji goreng') adalah makanan ringan yang berasal dari daerah Sunda yang dibuat dengan cara menggoreng campuran adonan yang berbahan utama tepung kanji atau tapioka. Makanan ringan ini sangat populer di daerah Priangan, dan dijual dalam berbagai bentuk dan variasi rasa. Makanan ini cukup terkenal pada era 80-an. Bahan makanan ini antara lain terdiri dari tepung kanji, tepung terigu, air, merica bubuk, garam, bawang putih, kedelai, daun bawang dan minyak goreng. ",
            "cilok adalah sebuah makanan khas Jawa Barat yang terbuat dari tapioka yang kenyal dengan tambahan bumbu pelengkap seperti sambal kacang, kecap, dan saus. cilok bentuknya bulat-bulat seperti bakso, hanya saja berbeda bahan dasarnya. Terdapat telur atau daging cincang di dalamnya, karena terbuat dari bahan dasar tapioka maka cilok terasa kenyal saat dikonsumsi. "
    };
    private static int[] foodImages = {
            R.drawable.seblak,
            R.drawable.lotek,
            R.drawable.miekocok,
            R.drawable.surabi,
            R.drawable.ulukutek,
            R.drawable.bandros,
            R.drawable.peuyeum,
            R.drawable.liwet,
            R.drawable.cireng,
            R.drawable.cilok

    };

    public static ArrayList<Food> getListData(){
        ArrayList<Food> foodArrayList = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++){
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodImages[position]);
            foodArrayList.add(food);
        }
        return foodArrayList;
    }

}
