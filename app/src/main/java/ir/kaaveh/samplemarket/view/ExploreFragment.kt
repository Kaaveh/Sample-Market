package ir.kaaveh.samplemarket.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ir.kaaveh.samplemarket.R
import ir.kaaveh.samplemarket.adapter.ItemAdapter
import ir.kaaveh.samplemarket.databinding.FragmentExplorBinding
import ir.kaaveh.samplemarket.viewmodel.ExploreViewModel

@AndroidEntryPoint
class ExploreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentExplorBinding>(
            inflater,
            R.layout.fragment_explor,
            container,
            false
        )

        val exploreViewModel: ExploreViewModel by viewModels()

        val itemAdapter = ItemAdapter()
        binding.itemRecycler.adapter = itemAdapter

        exploreViewModel.itemList.observe(viewLifecycleOwner, {
            itemAdapter.itemList = it
        })

        return binding.root
    }
}