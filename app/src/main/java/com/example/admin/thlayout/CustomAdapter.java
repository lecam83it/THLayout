package com.example.admin.thlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 8/3/2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<Integer> listId;
    ArrayList<String> listString;

    public CustomAdapter(Context context, ArrayList<Integer> listId, ArrayList<String> listString) {
        this.context = context;
        this.listId = listId;
        this.listString = listString;
    }

    public Context getContext() {
        return context;
    }

    public ArrayList<Integer> getListId() {
        return listId;
    }

    public ArrayList<String> getListString() {
        return listString;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setListId(ArrayList<Integer> listId) {
        this.listId = listId;
    }

    public void setListString(ArrayList<String> listString) {
        this.listString = listString;
    }

    // Trả về độ dài của ListView
    @Override
    public int getCount() {
        return listString.size();
    }
    // Lấy ra 1 vị trí của ListView
    @Override
    public Object getItem(int position) {
        return position;
    }
    // Lấy ra vị trí mảng Image của ListView
    @Override
    public long getItemId(int position) {
        return position;
    }
    /*
    * Hàm để custom ListView
    * @parameter position:  trả về vị trí  phần tử trong danh sách ListView
    * @parameter convertView: xử lí Item
    * @parameter parent : danh sách truyền từ main
    * return View
    *
    * */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = layoutInflater.inflate(R.layout.custom_listview, parent, false);

        TextView txtNoiDung = (TextView) rowView.findViewById(R.id.textViewCustom);
        txtNoiDung.setText(listString.get(position));

        ImageView txtHinhAnh = (ImageView) rowView.findViewById(R.id.txtImage);
        txtHinhAnh.setImageResource(listId.get(position));

        return rowView;
    }
}
