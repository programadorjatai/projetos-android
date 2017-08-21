package com.example.ednaldo.tablayout_sample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ednaldo.tablayout_sample.R;


/**
 * Created by Ednaldo on 16/08/2017.
 */

public class TabPedidoCabecalho extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_pedido, container, false);
        return view;
    }
}
