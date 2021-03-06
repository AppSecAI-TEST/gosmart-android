package com.atc.gosmartlesmagistra.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.atc.gosmartlesmagistra.App;
import com.atc.gosmartlesmagistra.R;
import com.atc.gosmartlesmagistra.activity.TeacherCourseDetailActivity;
import com.atc.gosmartlesmagistra.model.TeacherCourse;
import com.pkmmte.view.CircularImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ACER on 01/08/2017.
 */

public class SimiliarTeacherCourseListAdapter extends RecyclerView.Adapter<SimiliarTeacherCourseListAdapter.MyViewHolder> {

    private Context mContext;
    private List<TeacherCourse> list;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, price;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            price = (TextView) view.findViewById(R.id.price);

            view.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    Intent intent = new Intent(mContext, TeacherCourseDetailActivity.class);
                    TeacherCourse teacherCourse = list.get(getAdapterPosition());
                    intent.putExtra("teacherCourse", teacherCourse);
                    mContext.startActivity(intent);
                }
            });
        }
    }

    public SimiliarTeacherCourseListAdapter(Context mContext, List<TeacherCourse> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.similiar_teacher_course_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        TeacherCourse teacherCourse = list.get(position);
        holder.name.setText(teacherCourse.getCourse().getName());
        holder.price.setText(teacherCourse.getFormattedFinalCost());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    // Clean all elements of the recycler
    public void clear() {
        list.clear();
        notifyDataSetChanged();
    }

    // Add a list of items
    public void addAll(List<TeacherCourse> list) {
        list.addAll(list);
        notifyDataSetChanged();
    }

    public void add(TeacherCourse course) {
        list.add(course);
        notifyDataSetChanged();
    }
}
