package com.soialab.askaruly.readcsvexample_android;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.soialab.askaruly.readcsvexample_android.dummy.DummyContent.DummyItem;

import java.util.List;
/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the

 * TODO: Replace the implementation with code for your data type.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {
    private final List<ContactModel> mValues;

    public MyItemRecyclerViewAdapter(List<ContactModel> items ) {
        mValues = items;
     }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
       /* holder.mIdView.setText(mValues.get(position).getMonth()+"");
        holder.mContentView.setText(mValues.get(position).getSumHours()+"");*/
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
       /* public final TextView mIdView;
        public final TextView mContentView;*/
        public ContactModel mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
           /* mIdView = (TextView) view.findViewById(R.id.item_number);
            mContentView = (TextView) view.findViewById(R.id.content);*/
        }

        @Override
        public String toString() {
            return super.toString() ;
        }
    }
}
