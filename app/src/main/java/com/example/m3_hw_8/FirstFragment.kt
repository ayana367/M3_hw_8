package com.example.m3_hw_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.m3_hw_8.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private var data = arrayListOf<Flowers>()

    private lateinit var binding: com.example.m3_hw_8.databinding.FragmentFirstBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = FlowersAdapter(data,this::onClick)
        binding.chatRv.adapter = adapter

    }

    private fun onClick(pos:Int){
        val direction = FirstFragmentDirections.actionFirstFragmentToSecondFragment((Keys.KEY_FIST_FG to data[pos].getTitle()).toString(), (Keys.MESSAGE to data[pos].getMessage()).toString())
        findNavController().navigate(direction)
    }
    private fun loadData() {

        data.add(Flowers("Пион","Пион- «царь цветов». Луковичное растение, относится к семейству Пионовые. Пионы очень яркие, эффектные и пышные цветы. К тому же пионы обладают яркой сочной зеленью и сильным насыщенным ароматом.",R.drawable.pion))
        data.add(Flowers("Лилия","Ли́лия (лат. Lílium) — род растений семейства Лилейные (Liliaceae). Многолетние травы, снабжённые луковицами, состоящими из мясистых низовых листьев, расположенных черепитчато, белого, розоватого или желтоватого цвета.",R.drawable.lili))
        data.add(Flowers("Архидея","Орхиде́я, орхиде́и (лат. Orchidaceae) — как правило, красивоцветущие растения из семейства орхи́дные, или ятры́шниковые. Орхидеи относятся к крупнейшему и очень древнему семейству однодольных растений, возникшему ещё в позднемеловой период существования жизни на Земле Семейство названо по имени одной из распространённых европейских орхидей, ятрышника (его латинское название — орхис, лат. órchis), одно из народных имён которого — кукушкины слёзки.",R.drawable.arc))
        data.add(Flowers("Сирень","Сире́нь (лат. Syrínga) — род кустарников, принадлежащий семейству Маслиновые (лат. Oleaceae). Род включает около тридцати видов, распространённых в диком состоянии в Юго-Восточной Европе (Венгрия, Балканы) и в Азии, преимущественно в Китае.",R.drawable.siren))
        data.add(Flowers("Ирис","И́рис, или Каса́тик, или Петушо́к (лат. Íris) — род многолетних корневищных растений семейства Ирисовые, или Касатиковые (Iridaceae). Встречаются на всех континентах. Род насчитывает около 800 видов с богатейшим разнообразием форм и оттенков. За это ирис и получил своё название (от др.-греч. ἶρῐς — радуга).",R.drawable.iris))
        data.add(Flowers("Синие розы","Синяя роза, голубая роза — роза с синими (голубыми, лиловыми) лепестками. В природе розы с лепестками такого окраса не встречаются, однако технология получения синих роз с помощью окрашивания известна по крайней мере с XII века. В 2004 году путём генетической модификации был получен сорт роз 'Blue Moon', содержащий пигмент дельфинидин; цветки растений этого сорта имеют лепестки лиловой окраски.",R.drawable.roz))
        data.add(Flowers("Хризантема","Хризанте́ма (лат. Chrysánthemum, от др.-греч. χρῡσανθής, «златоцветный», от χρυσός — «золотой» и ἄνθος — «цветок»; объясняется жёлтой окраской соцветий) — род однолетних и многолетних травянистых растений семейства Астровые, или Сложноцветные (Asteraceae), близкий к родам Тысячелистник и Пижма, куда нередко перемещаются многие виды хризантем",R.drawable.xriz))
        data.add(Flowers("Подснежник","Подсне́жник, или Гала́нтус (лат. Galánthus, от др.-греч. γάλα — «молоко», ἄνθος — «цветок») — род многолетних трав семейства Амариллисовые (Amaryllidaceae), ранее относившийся к семейству Лилейные (Liliaceae). Включает 19 видов и два гибрида естественного происхождения. На территории бывшего СССР произрастает 12 видов.",R.drawable.pod))
        data.add(Flowers("Гвоздика","Гвозди́ка (лат. Diánthus) — род многолетних растений семейства Гвоздичные (Caryophyllaceae).Травянистое дикорастущее и садовое растение с цветками разнообразной окраски. Многие виды и сорта гвоздики выращиваются на срезку и являются декоративными садовыми растениями. Регистрацией сортов гвоздики занимается Королевское садоводческое общество.",R.drawable.gvoz))
        data.add(Flowers("Тюльпан","Тюльпа́н (лат. Túlipa) — род многолетних травянистых луковичных растений семейства Лилейные (Liliaceae), в современных систематиках включающий более 80 видов. Центр происхождения и наибольшего разнообразия видов тюльпанов — горы северного Ирана, Памиро-Алай и Тянь-Шань. За 10—15 миллионов лет эволюции тюльпаны расселились до Испании и Марокко на западе, до Забайкалья на востоке и до Синайского полуострова на юге. На севере интродуцированные человеком популяции тюльпана лесного достигли Шотландии и южного побережья Скандинавии.",R.drawable.tul))
    }
}