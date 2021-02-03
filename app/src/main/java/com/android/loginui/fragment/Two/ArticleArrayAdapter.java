package com.android.loginui.fragment.Two;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.android.loginui.R;
import com.ramotion.expandingcollection.ECCardContentListItemAdapter;

import java.util.List;

@SuppressLint({"SetTextI18n", "InflateParams"})
public class ArticleArrayAdapter extends ECCardContentListItemAdapter<Article> {

    public ArticleArrayAdapter(@NonNull Context context, @NonNull List<Article> objects) {
        super(context, R.layout.list_element, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        View rowView = convertView;

        if (rowView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());

            rowView = inflater.inflate(R.layout.list_element, null);
            // configure view holder
            viewHolder = new ViewHolder();
//            viewHolder.date = (TextView) rowView.findViewById(R.id.firstLineDate);
            viewHolder.line1 = (TextView) rowView.findViewById(R.id.firstLine);
            viewHolder.line2 = (TextView) rowView.findViewById(R.id.secondLine);
            viewHolder.line3 = (TextView) rowView.findViewById(R.id.thirdLine);
//            viewHolder.icon = (ImageView) rowView.findViewById(R.id.icon);
            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        final Article objectItem = getItem(position);
        if (objectItem != null) {
            viewHolder.line1.setText(objectItem.getCommentPersonName());
            viewHolder.line2.setText(objectItem.getCommentText());
            viewHolder.line3.setText(objectItem.getCommentDate());
//            viewHolder.date.setText(objectItem.getCommentDate());
//            viewHolder.icon.setImageResource(objectItem.getCommentPersonPictureRes());
        }

        // Removing item by tap on comment icon
//        viewHolder.icon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ArticleArrayAdapter.this.remove(objectItem);
//                ArticleArrayAdapter.this.notifyDataSetChanged();
//            }
//        });

        return rowView;
    }

    static class ViewHolder {
//        TextView date;
        TextView line1;
        TextView line2;
        TextView line3;
//        ImageView icon;
    }

}
