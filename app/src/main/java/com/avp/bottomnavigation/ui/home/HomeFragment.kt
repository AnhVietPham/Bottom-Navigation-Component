package com.avp.bottomnavigation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.navGraphViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.avp.bottomnavigation.R
import com.avp.bottomnavigation.models.ItemHomeModel
import com.avp.bottomnavigation.ui.adapter.HomeAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    private val viewModel by navGraphViewModels<HomeViewModel>(R.id.mobile_navigation)

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val itemHomeModels = listOf(
            ItemHomeModel(
                author = "Anh Viet Pham1",
                content = "hfahewufhawfeflaehfuehfuawhefluewahlfuewhlauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauw"
            ),
            ItemHomeModel(
                author = "Anh Viet Pham2",
                content = "hfahewufhawfeflaehfuehfuawhefluewahlfuewhlauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauw"
            ),
            ItemHomeModel(
                author = "Anh Viet Pham3",
                content = "hfahewufhawfeflaehfuehfuawhefluewahlfuewhlauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauw"
            ),
            ItemHomeModel(
                author = "Anh Viet Pham4",
                content = "hfahewufhawfeflaehfuehfuawhefluewahlfuewhlauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauw"
            ),
            ItemHomeModel(
                author = "Anh Viet Pham5",
                content = "hfahewufhawfeflaehfuehfuawhefluewahlfuewhlauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauw"
            ),
            ItemHomeModel(
                author = "Anh Viet Pham6",
                content = "hfahewufhawfeflaehfuehfuawhefluewahlfuewhlauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauw"
            ),
            ItemHomeModel(
                author = "Anh Viet Pham7",
                content = "hfahewufhawfeflaehfuehfuawhefluewahlfuewhlauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauw"
            ),
            ItemHomeModel(
                author = "Anh Viet Pham8",
                content = "hfahewufhawfeflaehfuehfuawhefluewahlfuewhlauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauw"
            ),
            ItemHomeModel(
                author = "Anh Viet Pham9",
                content = "hfahewufhawfeflaehfuehfuawhefluewahlfuewhlauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauw"
            ),
            ItemHomeModel(
                author = "Anh Viet Pham10",
                content = "hfahewufhawfeflaehfuehfuawhefluewahlfuewhlauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauw"
            ),
            ItemHomeModel(
                author = "Anh Viet Pham11",
                content = "hfahewufhawfeflaehfuehfuawhefluewahlfuewhlauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauw"
            ),
            ItemHomeModel(
                author = "Anh Viet Pham12",
                content = "hfahewufhawfeflaehfuehfuawhefluewahlfuewhlauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauw"
            ),
            ItemHomeModel(
                author = "Anh Viet Pham13",
                content = "hfahewufhawfeflaehfuehfuawhefluewahlfuewhlauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauw"
            ),
            ItemHomeModel(
                author = "Anh Viet Pham14",
                content = "hfahewufhawfeflaehfuehfuawhefluewahlfuewhlauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauwauehfluwehfulwehfuawefhuewfhauw"
            )
        )
        val homeAdapter = HomeAdapter(itemHomeModels = itemHomeModels)
        rvHome.layoutManager = LinearLayoutManager(this.context)
        rvHome.adapter = homeAdapter

        if (viewModel.listState != null){
            rvHome.layoutManager?.onRestoreInstanceState(viewModel.listState)
            viewModel.listState = null
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewModel.listState = rvHome.layoutManager?.onSaveInstanceState()
    }
}
