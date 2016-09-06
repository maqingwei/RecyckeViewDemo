package com.example.maqingwei.daggerdemo.adapter;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.example.maqingwei.daggerdemo.R;
import com.example.maqingwei.daggerdemo.baselsitview.ListBaseAdapter;
import com.example.maqingwei.daggerdemo.baselsitview.ListViewHolder;
import com.example.maqingwei.daggerdemo.view.User;

import java.util.List;

/**
 * Created by maqingwei
 * Date on 16/9/6 下午2:47
 *
 * @Description:
 * 给listview设置的adapter只需要实现adapter基类并且
 * 重写convert方法即可,
 * 所有的操作都可以写在这个方法中
 * 可根据自己需求修改
 */
public class ListViewAdapter extends ListBaseAdapter<User> {

    private Context mContext;

    public ListViewAdapter(Context context, List<User> data, int layoutId) {
        super(context, data, layoutId);
        mContext = context;
    }

    @Override
    public void convert(ListViewHolder viewHolder, User date, final int position) {

            viewHolder.getConvertView().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(mContext, "啊哦!你点击了第:"+(position+1)+"行", Toast.LENGTH_SHORT).show();
                }
            });

        viewHolder.setText(R.id.tv_username,date.getUsername());
        viewHolder.setText(R.id.tv_time,date.getTime());
        viewHolder.setText(R.id.tv_content,date.getContent());
        viewHolder.setImage(R.id.iv_touxiang,date.getImg());


    }
}
