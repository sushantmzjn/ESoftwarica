package com.sushant.esoftwarica.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sushant.esoftwarica.R;
import com.sushant.esoftwarica.model.User;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    Context context;
    List<User> userList;
    int imgId;

    public UserAdapter(Context context, List<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

      final User user = userList.get(position);
      String gender=user.getGender();
      if(gender.equals("male")){
           imgId=R.drawable.male;
      }
      else
      {
           imgId=R.drawable.female;
      }

        holder.imgview.setImageResource(imgId);
        holder.Uname.setText(user.getName());
        holder.add.setText(user.getAddress());
        holder.Age.setText(user.getAge());
        holder.gen.setText(user.getGender());

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

   public class UserViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView imgview;
        private TextView Uname, add, Age, gen;
       private Button btndelete;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            imgview = itemView.findViewById(R.id.imageView);
            Uname = itemView.findViewById(R.id.Title);
            add = itemView.findViewById(R.id.address);
            Age = itemView.findViewById(R.id.age);
            gen = itemView.findViewById(R.id.gender);
            btndelete = itemView.findViewById(R.id.delete);
        }
    }
}
