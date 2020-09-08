package com.sivananda.assignment.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sivananda.assignment.R
import com.sivananda.assignment.model.ResultsItem
import com.sivananda.assignment.retrofit.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProfileFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getData()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    private fun getData() {
        val call: Call<List<ResultsItem>> = ApiClient.getClient.getProfiles()
        call.enqueue(object : Callback<List<ResultsItem>> {

            override fun onResponse(
                call: Call<List<ResultsItem>>?,
                response: Response<List<ResultsItem>>?
            ) {
                /*progerssProgressDialog.dismiss()
                dataList.addAll(response!!.body()!!)
                recyclerView.adapter.notifyDataSetChanged()*/
                Log.v("Response", response!!.body()!!.toString())
            }

            override fun onFailure(call: Call<List<ResultsItem>>?, t: Throwable?) {
                /* progerssProgressDialog.dismiss()*/
            }

        })
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ProfileFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            ProfileFragment()
    }
}