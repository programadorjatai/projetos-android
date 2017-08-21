package com.example.ednaldo.tablayout_sample.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.ednaldo.tablayout_sample.fragment.TabPedidoItens;
import com.example.ednaldo.tablayout_sample.fragment.TabPedidoCabecalho;


/**
 * Created by Ednaldo on 21/08/2017.
 */

public class TabAdapter extends FragmentStatePagerAdapter {
    private  int indice;

    public TabAdapter(FragmentManager fm, int indice) {
        super(fm);
        this.indice = indice;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                TabPedidoCabecalho tabPedidoCabecalho = new TabPedidoCabecalho();
                return tabPedidoCabecalho;
            case 1 :
                TabPedidoItens tabPedidoItens = new TabPedidoItens();
                return  tabPedidoItens;
        }
        return null;
    }

    @Override
    public int getCount() {
        return indice;
    }
}
